
/***********************************************************************************
 *   Copyright (C) 2009-2010 by Fabrizio Montesi <famontesi@gmail.com>             *
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

include "../public/interfaces/ActivityInterface.iol"
include "../__state/public/interfaces/StateInterface.iol"
include "../__activity_manager/public/interfaces/ActivityManagerInterface.iol"
include "../__adaptation_manager/public/interfaces/AdaptationManagerInterface.iol"
include "../config/locations.iol"

execution { concurrent }

inputPort ActivityInput {
Location: "local"
Interfaces: ActivityInterface, AdaptActivityInterface
}

outputPort ActivityManager {
Interfaces: ActivityManagerInterface
Location: "local"
Protocol: sodep
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

init
{
	varNames -> global.varNames;
	nfp -> global.nfp;
	done -> global.done;
	done = false;
	execute -> global.execute;
	execute = false
}

cset {
	cookie: AdaptRequest.cookie NoAdaptRequest.cookie
}

main
{
	[ run( runRequest )() {
		State.location = runRequest.stateLocation;
		ActivityManager.location = runRequest.activityManagerLocation;
		undef( runRequest );
		onRun
	} ] { nullProcess }

	[ start( runRequest ) ] {
		State.location = runRequest.stateLocation;
		ActivityManager.location = runRequest.activityManagerLocation;
		undef( runRequest );
		start
	}

	[ getVariableNames()( varNames ) { nullProcess } ] {
		nullProcess
	}

	[ getNFP()( nfp ) {
		nullProcess
	} ] { nullProcess }
}
