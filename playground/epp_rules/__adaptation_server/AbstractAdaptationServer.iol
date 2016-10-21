/***************************************************************************
 *   Copyright (C) 2009-2010 by Fabrizio Montesi <famontesi@gmail.com>     *
 *   Copyright (C) 2009-2010 by Ivan Lanese <lanese@cs.unibo.it>           *
 *   Copyright (C) 2013-2016 by Saverio Giallorenzo <sgiallor@cs.unibo.it> *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/
include "file.iol"
include "runtime.iol"
include "string_utils.iol"
include "console.iol"

include "../config/locations.iol"

include "../__activity_manager/public/interfaces/ActivityManagerInterface.iol"
include "../__activity_manager/public/interfaces/ActivityInterface.iol"
include "../__adaptation_manager/public/interfaces/AdaptationManagerInterface.iol"
include "../__state/public/interfaces/StateInterface.iol"
include "../__roleSupporter/public/interfaces/RoleSupporterInterface.iol"
include "./public/interfaces/AdaptationServerInterface.iol"
include "../environment/environmentInterface.iol"

include "./__rule/public/interfaces/RuleInterface.iol"  // <- restore include of JorbaTypes AFTER DEVELOPMENT

// REMOVE AFTER DEVELOPMENT
type VariableNamesList:void {
  .name[0,*]:string
}

type CheckForUpdateRequest:void {
  .properties?:undefined
  .client:string
  .ports: undefined
}

constants {
  Location_AdaptationManager = "socket://localhost:9049",
  Location_Environment = "socket://localhost:9048",
  Location_AdaptationServer = "socket://localhost:9050",
  Location_RoleSupporter = "socket://localhost:9059" // <--- THIS MUST BE ADDED INTO locations.iol
}
// REMOVE AFTER DEVELOPMENT


execution { concurrent }

outputPort Environment{
  Location: Location_Environment
  Protocol: sodep
  Interfaces: EnvironmentInterface
}

outputPort AdaptationManager {
  Location: Location_AdaptationManager
  Protocol: sodep
  Interfaces: AdaptationManagerInterface, StateInterface
}

outputPort Rule {
  Interfaces: RuleInterface
}

outputPort State {
  Protocol: sodep
  Interfaces: StateInterface
}

outputPort ActivityManager {
  Protocol: sodep
  Interfaces: ActivityManagerInterface
}

inputPort AdaptationServerInput {
  Location: Location_AdaptationServer
  Protocol: sodep
  Interfaces: AdaptationServerInterface
}


outputPort RoleSupporter {
  Location: Location_RoleSupporter
  Protocol: sodep
  Interfaces: RoleSupporterInterface
}

outputPort NewRole {
  Protocol: sodep
  Interfaces: AdaptActivityInterface
}

init
{
  // loads all the rules inside the "rules" folder
  rules -> global.rules;
  registerAdaptationServer@AdaptationManager( global.inputPorts.AdaptationServerInput )();
  getServiceDirectory@File()( serviceDirectory );
  getFileSeparator@File()( fileSeparator );
  rulesDirectory = serviceDirectory + fileSeparator + "rules" + fileSeparator;
  f.directory = rulesDirectory;
  f.regex = ".*Rule\\.ol";
  list@File( f )( list );
  s.type = "Jolie";
  for( i = 0, i < #list.result, i++ ) {
    println@Console( "Loading rule " + list.result[i] )();
    s.filepath = rulesDirectory + list.result[i];
    loadEmbeddedService@Runtime( s )( Rule.location );
    getDescription@Rule()( rules[i] );
    rules[i].location = Rule.location;
    rules[i].filename = list.result[i]
  };
  undef( f )
}

define checkRule {
  println@Console( "Checking rule " + rule.filename )();
  Rule.location = rule.location;
  properties -> rule.properties.name;
  for( j = 0, j < #properties, j++ ){
    eval.properties.( properties[ j ] ) = request.properties.( properties[ j ] ).value
  };
  State.location = request.client;
  stateVariables -> rule.stateVariables.name;
  for( j = 0, j < #stateVariables, j++ ){
    get@State( stateVariables[ j ] )( eval.state.( stateVariables[ j ] ))
  };
  envVariables -> rule.envVariables.name;
  for( j = 0, j < #envVariables, j++ ){
    get@Environment( envVariables[ j ] )( eval.environment.( envVariables[ j ] ))
  };
  evaluateConstraint@Rule( eval )( send );

  // check that the rule does not have any newRole 
  // with the same name of a role in the scope
  for ( newRole in rule.newRoles ) {
    if( is_defined( request.ports.( newRole ) ) ){
      println@Console( "The rule contains the newRole " + newRole + " already present in the scope" )();
      send = 0
    }
  }

  /* OLD PROCEDURE FOR (SUB)SET OF ROLES IN RULES
  // check for roles in the scope
  ruleDir = rulesDirectory + rule.activityDirectory;
  f.directory = ruleDir;
  f.dirsOnly = true;
  list@File( f )( list );
  roles = true;
  for( r = 0, r < #list.result, r++ ) {
    role = list.result[ r ];
    println@Console( "Checking the presence of role " + role )();
    if( !is_defined( request.ports.( role ) )){
      roles = false
    }
  };
  undef( ruleDir );
  undef( f );
  undef( list );
  undef( role );
  */
}

define sendRule { 
  println@Console( "\tPreparing the new code" )();
  // ruleDir = rulesDirectory + rules[ i ].activityDirectory;
  ruleDir = rulesDirectory + rule.activityDirectory;
  println@Console( "Selected: " + ruleDir )();

  // loads the emptyProcess code of the rule
  readFile.filename = ruleDir + fileSeparator + "emptyProcess.ol";
  readFile@File( readFile )( emptyProcess );

  // assigns a fresh key to the main scope of the rule
  main_key = response.main_key = new;

  // remaps statics keys of subscopes with fresh ones
  subscopes -> rule.subscopes.name;
  for( subIndex = 0, subIndex < #subscopes, subIndex++ ){
    subscopesMap.( subscopes[ subIndex ] ) = new
  };

  // retrieves the roles involved in this rule (one per folder)
  f.directory = ruleDir;
  f.dirsOnly = true;
  list@File( f )( list );
  println@Console( "Directories retrieved: " + #list.result )();
  undef( f );

  // creates the list of projected roles
  for( r = 0, r < #list.result, r++ ){
    pRoles.( list.result[ r ] ) = 1
  };

  // create the newRoles and store their locations
  for ( newRole in rule.newRoles ) {
    createRole@RoleSupporter( newRole )( roleID );
    newRolesLocations.( newRole ) = Location_RoleSupporter + "/!/" + roleID
  };
  
  // send the code to the newRoles
  for ( newRole in rule.newRoles ) {

    rci = 0; // role code counter
    // retrieves the "main" adapted scope and the message-handler
    sf.directory = ruleDir + fileSeparator + newRole;
    println@Console( "Entering " + sf.directory )();
    sf.regex = ".*\\.ol";
    list@File( sf )( fileList );
    for( fileIndex = 0, fileIndex < #fileList.result, fileIndex++ ){
      file = fileList.result[ fileIndex ];
      println@Console( "Loading file " + role + fileSeparator + file )();
      readFile.filename = sf.directory + fileSeparator + file;
      readFile@File( readFile )( code );

      adaptReq.main_key = adaptReq.code[ rci ].key = main_key;

      if( file == "mh.ol" ){
        adaptReq.code[ rci ].mh = code
      } else {
        // if it is the scope, it injects a fresh key related to that scope
        code.replacement = main_key;
        code.regex = "Adapt__KPH__";
        replaceAll@StringUtils( code )( code );
        // replaces the addresses of existing roles
        foreach ( p : request.ports ){
          code.replacement = request.ports.( p ).address;
          code.regex = "RPH__" + p;
          replaceAll@StringUtils( code )( code )
        };
        // replaces the addresses of the newRoles
          foreach ( p : newRolesLocations ){
            code.replacement = newRolesLocations.( p );
            code.regex = "RPH__" + p + "!";
            replaceAll@StringUtils( code )( code )
          };
          
        // replaces the static UUID keys with the fresh ones
        foreach( staticScopeUUID : subscopesMap ){
          code.replacement = subscopesMap.( staticScopeUUID );
          code.regex = staticScopeUUID;
          replaceAll@StringUtils( code )( code )
        };
        adaptReq.code[ rci ].code = code
      }
    };

    // retrieves the subscopes and the message-handler
    undef( sf.regex );
    sf.dirsOnly = true;
    list@File( sf )( subscopesList );
    undef( sf.dirsOnly );
    sf.regex = ".*\\.ol";
    scopeDirectory = sf.directory;
    for( ssIndex = 0, ssIndex < #subscopesList.result, ssIndex++ ){
      ssFolder = subscopesList.result[ ssIndex ];
      println@Console( "Entering subscope " + ssFolder )();
      sf.directory = scopeDirectory + fileSeparator + ssFolder;
      list@File( sf )( fileList );
      rci++;
      for( fileIndex = 0, fileIndex < #fileList.result, fileIndex++ ){
        file = fileList.result[ fileIndex ];
        println@Console( "Loading file " + sf.directory + fileSeparator + file )();
        readFile.filename = sf.directory + fileSeparator + file;
        readFile@File( readFile )( code );

        adaptReq.code[ rci ].key = subscopesMap.( ssFolder );

        if( file == "mh.ol" ){
          adaptReq.code[ rci ].mh = code
        } else {
          // replaces the static UUID key with the fresh one
          foreach( staticScopeUUID : subscopesMap ){
            println@Console( "replacing key: " + staticScopeUUID + " with " + subscopesMap.( staticScopeUUID ) )();
            code.replacement = subscopesMap.( staticScopeUUID );
            code.regex = staticScopeUUID;
            replaceAll@StringUtils( code )( code )
          };
          // replaces the addresses of the existing roles
          foreach ( p : request.ports ) {
            code.replacement = request.ports.( p ).address;
            code.regex = "RPH__" + p;
            println@Console( "replacing address: " + code.regex + " with " + code.replacement )();
            replaceAll@StringUtils( code )( code )
          };
          // replaces the addresses of the newRoles
          foreach ( p : newRolesLocations ){
            code.replacement = newRolesLocations.( p );
            code.regex = "RPH__" + p + "!";
            replaceAll@StringUtils( code )( code )
          };
          

          adaptReq.code[ rci ].code = code
        }
      }
    };

    NewRole.location = newRolesLocations.( newRole ) + "/Activity/basicActivity"; // THIS IS THE PATH OF THE BASIC ACTIVITY
    adaptReq.cookie = "basicActivity";
    adapt@NewRole( adaptReq )( s );
    undef( adaptReq )
  };

  // checks if the rule has the code for the considered role
  foreach( role : request.ports ) {
    rci = 0; // role code counter
      
    // if it has the code for that role
    if( is_defined( pRoles.( role ) ) ){

      // retrieves the "main" adapted scope and the message-handler
      sf.directory = ruleDir + fileSeparator + role;
      println@Console( "Entering " + sf.directory )();
      sf.regex = ".*\\.ol";
      list@File( sf )( fileList );
      for( fileIndex = 0, fileIndex < #fileList.result, fileIndex++ ){
        file = fileList.result[ fileIndex ];
        println@Console( "Loading file " + role + fileSeparator + file )();
        readFile.filename = sf.directory + fileSeparator + file;
        readFile@File( readFile )( code );

        response.( role ).code[ rci ].key = main_key;

        if( file == "mh.ol" ){
          response.( role ).code[ rci ].mh = code
        } else {
          // if it is the scope, it injects a fresh key related to that scope
          code.replacement = main_key;
          code.regex = "Adapt__KPH__";
          replaceAll@StringUtils( code )( code );
          // replaces the addresses of the existing roles
          foreach ( p : request.ports ){
            code.replacement = request.ports.( p ).address;
            code.regex = "RPH__" + p;
            replaceAll@StringUtils( code )( code )
          };
          // replaces the addresses of the newRoles
          foreach ( p : newRolesLocations ){
            code.replacement = newRolesLocations.( p );
            code.regex = "RPH__" + p + "!";
            replaceAll@StringUtils( code )( code )
          };
          // replaces the static UUID keys with the fresh ones
          foreach( staticScopeUUID : subscopesMap ){
            code.replacement = subscopesMap.( staticScopeUUID );
            code.regex = staticScopeUUID;
            replaceAll@StringUtils( code )( code )
          };
          response.( role ).code[ rci ].code = code
        }
      };

      // retrieves the subscopes and the message-handler
      undef( sf.regex );
      sf.dirsOnly = true;
      list@File( sf )( subscopesList );
      undef( sf.dirsOnly );
      sf.regex = ".*\\.ol";
      scopeDirectory = sf.directory;
      for( ssIndex = 0, ssIndex < #subscopesList.result, ssIndex++ ){
        ssFolder = subscopesList.result[ ssIndex ];
        println@Console( "Entering subscope " + ssFolder )();
        sf.directory = scopeDirectory + fileSeparator + ssFolder;
        list@File( sf )( fileList );
        rci++;
        for( fileIndex = 0, fileIndex < #fileList.result, fileIndex++ ){
          file = fileList.result[ fileIndex ];
          println@Console( "Loading file " + sf.directory + fileSeparator + file )();
          readFile.filename = sf.directory + fileSeparator + file;
          readFile@File( readFile )( code );

          response.( role ).code[ rci ].key = subscopesMap.( ssFolder );

          if( file == "mh.ol" ){
            response.( role ).code[ rci ].mh = code
          } else {
            // replaces the static UUID key with the fresh one
            foreach( staticScopeUUID : subscopesMap ){
              println@Console( "replacing key: " + staticScopeUUID + " with " + subscopesMap.( staticScopeUUID ) )();
              code.replacement = subscopesMap.( staticScopeUUID );
              code.regex = staticScopeUUID;
              replaceAll@StringUtils( code )( code )
            };
            // replaces the addresses of the existing roles
            foreach ( p : request.ports ) {
              code.replacement = request.ports.( p ).address;
              code.regex = "RPH__" + p;
              println@Console( "replacing address: " + code.regex + " with " + code.replacement )();
              replaceAll@StringUtils( code )( code )
            };
            // replaces the addresses of the newRoles
            foreach ( p : newRolesLocations ){
              code.replacement = newRolesLocations.( p );
              code.regex = "RPH__" + p + "!";
              replaceAll@StringUtils( code )( code )
            };

            response.( role ).code[ rci ].code = code
          }
        }
      }
      
    // if there are no projected processes for that role
    } else {
      // loads the empty scope
      response.( role ).code[ rci ].key = main_key;
      code = emptyProcess;
      code.replacement = main_key;
      code.regex = "Adapt__KPH__";
      replaceAll@StringUtils( code )( code );
      code.replacement = role;
      code.regex = "RPH__m";
      replaceAll@StringUtils( code )( code );
      foreach ( p : request.ports ) {
        code.replacement = request.ports.( p ).address;
        code.regex = "RPH__" + p;
        replaceAll@StringUtils( code )( code )
      };
      response.( role ).code[ rci ].code = code
    }
  }
}

define checkRules
{
  getVariableNames@AdaptationManager()( envVariableNames );
  rule -> rules[i];
  for( i = 0, i < #rules, i++ ) {
    checkRule;
    if ( send ){
      println@Console( "\tConstraints satisfied" )();
      sendRule;
      i=#rules // rule found, exit the loop
    } else {
      println@Console( "\tConstraint not satisfied, skipping rule" )()
    }
  }
}

main
{
  checkForUpdate( request )( response ) {
    checkRules;
    println@Console( "sending response with " + #response + " roles" )()
  }
}