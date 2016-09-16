

/******************************************************************************
 *   Copyright (C) 2009-2010 by Fabrizio Montesi <famontesi@gmail.com>        *
 *   Copyright (C) 2013 by Claudio Guidi <guidiclaudio@gmail.com>             *
 *   Copyright (C) 2013 by Saverio Giallorenzo <sgiallor@cs.unibo.it>         *
 *                                                                         		*
 *   This program is free software; you can redistribute it and/or modify  		*
 *   it under the terms of the GNU Library General Public License as       		*
 *   published by the Free Software Foundation; either version 2 of the    		*
 *   License, or (at your option) any later version.                       		*
 *                                                                         		*
 *   This program is distributed in the hope that it will be useful,       		*
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        		*
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         		*
 *   GNU General Public Lictypemense for more details.                     		*
 *                                                                         		*
 *   You should have received a copy of the GNU Library General Public     		*
 *   License along with this program; if not, write to the                 		*
 *   Free Software Foundation, Inc.,                                       		*
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             		*
 *                                                                         		*
 *   For details about the authors of this software, see the AUTHORS file. 		*
 ******************************************************************************/
include "console.iol"
include "string_utils.iol"
include "./config/locations.iol"

include "./__adaptation_manager/public/interfaces/AdaptationManagerInterface.iol"
include "./__adaptation_server/public/interfaces/AdaptationServerInterface.iol"
include "./__state/public/interfaces/StateInterface.iol"

execution { concurrent }

outputPort State {
Interfaces: StateInterface
}

outputPort AdaptationServer {
Interfaces: AdaptationServerInterface
}

embedded {
Jolie:
	"./__state/main_state.ol" in State
}

inputPort AdaptationManagerInput {
Location: Location_AdaptationManager
Protocol: sodep
Interfaces: AdaptationServerInterface, AdaptationManagerInterface
Aggregates: State
}

init
{
	servers -> global.servers;
	println@Console("AdaptationManager is running...")()
}

main
{
	[ registerAdaptationServer( binding )() {
		synchronized( servers ) {
			servers.(binding.location) << binding
		};
		valueToPrettyString@StringUtils( binding )( s );
		println@Console("Registered " + s )()
	} ] { nullProcess }

	[ checkForUpdate( request )( response ) {
		synchronized( servers ) {
			foreach( n : servers ) {
				b[i++] << servers.(n)
			}
		};
		for( i = 0, i < #b && !is_defined( response ), i++ ) {
			AdaptationServer << b[i];
			scope( checkForUpdateRequest ) {
				install( IOException => 
					synchronized( servers ) { undef( servers.( n ) ) } );
				checkForUpdate@AdaptationServer( request )( response )
			}
		}
	} ] { nullProcess }
}
