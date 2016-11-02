/***********************************************************************************
 *   Copyright (C) 2009-2010 by Fabrizio Montesi <famontesi@gmail.com>             *
 *   Copyright (C) 2013 by Claudio Guidi <guidiclaudio@gmail.com>                  *
 *   Copyright (C) 2013-2016 by Saverio Giallorenzo <saverio.giallorenzo@gmail.com>*
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

include "runtime.iol"
include "file.iol"
include "console.iol"

include "string_utils.iol"

include "./config/locations.iol"

include "./__activity_manager/public/interfaces/ActivityManagerInterface.iol"
include "./__activity_manager/public/interfaces/ActivityManagerAdminInterface.iol"
include "./__activity_manager/public/interfaces/ActivityInterface.iol"
include "./__activity_manager/public/interfaces/ComparatorInterface.iol"
include "./__adaptation_manager/public/interfaces/AdaptationManagerInterface.iol"
include "./__state/public/interfaces/StateInterface.iol"


execution { concurrent }

outputPort Activity {
Interfaces: ActivityInterface
}

outputPort AdaptationManager {
Location: Location_AdaptationManager
Protocol: sodep
Interfaces: AdaptationManagerInterface
}

outputPort State {
Location: "local"
Protocol: sodep
Interfaces: StateInterface
}

outputPort Comparator {
Interfaces: ComparatorInterface
}

inputPort ActivityManagerInput {
Location: "local"
Interfaces: ActivityManagerInterface, ActivityManagerAdminInterface
}


define selectActivity
{
	synchronized( Activities ) {
		Activity.location = global.activities.( activityName )
	}
}

define embed_scope
{
	mkdir@File( "./__activity_manager/activities/" + eReq.key )();

	if( is_defined( eReq.mh ) ){
		f.filename = "./__activity_manager/activities/" + eReq.key + "/mh.ol";
		f.content = eReq.mh;
		writeFile@File( f )()
	};

	f.filename = "./__activity_manager/activities/" + eReq.key + "/" + eReq.key + ".ol";
	f.content = eReq.code;
	writeFile@File( f )();

	s.type = "Jolie";
	s.filepath = f.filename;

	// and then embed it
	loadEmbeddedService@Runtime( s )( global.activities.( eReq.key ) );
	
	with( opReq ){	
		.name = eReq.key + "_port";
		.location = global.activities.( eReq.key );
		.protocol = "sodep"
	};
	setOutputPort@Runtime( opReq )();
	
	with( rReq ){
		.inputPortName = "ActivityManagerInput";
		.resourceName = eReq.key;
		.outputPortName = opReq.name
	};
	setRedirection@Runtime( rReq )();

	println@Console( "Loaded: " + s.filepath )();
	undef( s )

}

init
{
	setClientLocation( clientLocation )() { 
	
		State.location = clientLocation.location;
		activity_folder = clientLocation.folder;

		getLocalLocation@Runtime()( global.myLocation );

		// load all default scopes
		lReq.directory = "./__activity_manager/activities/";
		lReq.dirsOnly = true;
		list@File( lReq )( lRes );
		println@Console( "Activities found in " + lReq.directory + ": " + #lRes.result )();
		for( i=0, i < #lRes.result, i++ ){
			println@Console( "activityManager found: " + lRes.result[ i ] )()
		};
		for (i = 0, i < #lRes.result, i++ ) {
			s.type = "Jolie";
			s.filepath = lReq.directory + lRes.result[ i ] + "/" + lRes.result[ i ] + ".ol";
			println@Console( "embedding " + s.filepath )();
			loadEmbeddedService@Runtime( s )( global.activities.( lRes.result[ i ] ) );
			with( opReq ){
				.name = lRes.result[ i ] + "_port";
				.location = global.activities.( lRes.result[ i ] );
				.protocol = "sodep"
			};
			setOutputPort@Runtime( opReq )();
			with( rReq ){
				.inputPortName = "ActivityManagerInput";
				.resourceName = lRes.result[ i ];
				.outputPortName = opReq.name
			};
			setRedirection@Runtime( rReq )();
			println@Console( "Loaded: " + s.filepath )();
			undef( s );

			activityName = lRes.result[ i ];
			selectActivity;
			runRequest.stateLocation = State.location;
			runRequest.activityManagerLocation = global.myLocation;
			start@Activity( runRequest )
		}
	}
}

define selectComparator
{
	synchronized( Activities ) {
		Comparator.location = global.activities.( activityName ).comparator
	}
}

main
{
	[ run( activityName )( response ) {
		println@Console( "Entering activity " + activityName )();
		selectActivity;

		runRequest.stateLocation = State.location;
		runRequest.activityManagerLocation = global.myLocation;

		println@Console( "\tExecuting activity" )();

		run@Activity( runRequest )();

		println@Console( "\t Activity " + activityName + " terminated." )()

	} ] { nullProcess }

	[ embed_scope( eReq )() {
		println@Console( "Received embedding request for key " + eReq.key )();
		synchronized( Activities ){
			embed_scope
		}
	} ] { 
				synchronized( Activities ){
					activityName = eReq.key;
					selectActivity;
					runRequest.stateLocation = State.location;
					runRequest.activityManagerLocation = global.myLocation;
					start@Activity( runRequest )
				}
			}

	[ startActivity( sReq ) ]{
			activityName = sReq;
			selectActivity;
			runRequest.stateLocation = State.location;
			runRequest.activityManagerLocation = global.myLocation;
			start@Activity( runRequest )
	}

	[ checkUpdateNFP( request )( response ) {
		println@Console( "\tEvaluating user preferences" )();
		activityName = request.activityName;
		selectActivity;
		getNFP@Activity()( currentNFP );
		selectComparator;
		compare.leftNFP -> currentNFP;
		compare.rightNFP -> request.updateNFP;
		compareNFP@Comparator( compare )( response );

		if ( response == 0 ) {
			println@Console( "\tUpdate rejected; cause: NFP not satisfying user preferences" )()
		}
	} ] { nullProcess }
}
