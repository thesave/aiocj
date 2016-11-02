/***********************************************************************************
 *   Copyright (C) 2016 by Saverio Giallorenzo <saverio.giallorenzo@gmail.com>     *
 *                                                                                 *
 *   This program is free software; you can redistribute it and/or modify          *
 *   it under the terms of the GNU Library General Public License as               *
 *   published by the Free Software Foundation; either version 2 of the            *
 *   License, or (at your option) any later version.                               *
 *                                                                                 *
 *   This program is distributed in the hope that it will be useful,               *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of                *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                 *
 *   GNU General Public License for more details.                                  *
 *                                                                                 *
 *   You should have received a copy of the GNU Library General Public             *
 *   License along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                               *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.                     *
 *                                                                                 *
 *   For details about the authors of this software, see the AUTHORS file.         *
 ***********************************************************************************/

include "./config/locations.iol"
include "./interfaces/RoleSupporterInterface.iol"
include "runtime.iol"
include "console.iol"
include "file.iol"

inputPort RoleSupporter {
	Location: Location_RoleSupporter
	Protocol: sodep
	Interfaces: RoleSupporterInterface
}

type NewRoleConstantsType: void {
  .Location_Folder: string
  .Role: string
}

outputPort NewRole {
	RequestResponse: setConstants( NewRoleConstantsType )( void )
}

execution{ concurrent }

main
{
  createRole( roleName )( roleID ){
  	synchronized( counter ){
  		roleID = "role_" + new
  	};
		copyDir@File( { .to = roleID, .from = "basicRole" } )(); // TODO: replace with unzip 
  	// embed the new basicRole
		loadEmbeddedService@Runtime( { .filepath = roleID + "/BasicRole.ol", .type = "Jolie" } )( roleLocation );
		// create an outputPort
		setOutputPort@Runtime( { .location = roleLocation, .name = roleID } )();
		//
		NewRole.location = roleLocation;
		setConstants@NewRole( { .Location_Folder = roleID, .Role = roleName  } )();
		// redirect RoleSupporter to OutputPort
		setRedirection@Runtime( {
	    .inputPortName = "RoleSupporter",
	    .outputPortName = roleID,
	    .resourceName = roleID
		 } )();
		 // we keep a single location folder since updates are uniquely identified  
		 println@Console( "created role " + roleID )()
  }
}