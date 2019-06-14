
/***********************************************************************************
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

include "file.iol" // <--- for debugging purposes
include "console.iol" // <--- for debugging purposes


include "./public/types/JorbaTypes.iol"
include "./public/interfaces/StateInterface.iol"

execution { sequential }

inputPort StateInput {
Location: "local"
Interfaces: StateInterface
}

init
{
	vars -> global.vars;
	getServiceDirectory@File()( dir );
	println@Console( "State: " + dir )()
}

main
{
	[ get( varName )( vars.(varName) ) {
		nullProcess
	} ] { nullProcess }

	[ set( var )() {
		vars.(var) << var.value
	} ] { nullProcess }

	[ getVariableNames()( response ) {
		foreach( varName : vars ) {
			response.name[i++] = varName
		}
	} ] { nullProcess }
}
