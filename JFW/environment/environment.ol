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

include "file.iol"
include "console.iol"
include "xml_utils.iol"
include "./config/locations.iol"
include "./environmentInterface.iol"

include "string_utils.iol"

inputPort EnvironmentInput {
	Location: Location_Environment
	Protocol: sodep
	Interfaces: EnvironmentInterface
}

init
{
	vtx.rootNodeName = "store";
	store -> vtx.root;
  wfr.filename = rfr.filename = "environmentVariables.xml";
  // initialise environmentVariables.xml
  store = "store";
  writeStore
}

define readStore
{
	readFile@File( rfr )( xmlStore );
	xmlToValue@XmlUtils( xmlStore )( store )
}

define writeStore
{
		valueToXml@XmlUtils( vtx )( wfr.content );
		writeFile@File( wfr )()
}

define get
{
	get( varName )( value ){
		readStore;
		value = store.( varName )
	};
	get
}

define set
{
	print@Console( "Do you want to [I]nsert or [D]elete variables \n > " )();
	registerForInput@Console()();
	in( command );
	if( command == "I" || command == "i" ){
		print@Console( "Insert the name of the variable you want to set \n > " )();
		registerForInput@Console()();
		in( var );
		print@Console( "Insert the value of environmental variable \"" + var + "\" \n > " )();
		registerForInput@Console()( );
		in( val );
		readStore;
		store.( var ) = val;
		undef( var ); undef( val );
		writeStore
	} else if ( command == "D" || command == "d" ){
		print@Console( "Insert the name of the variable you want to delete \n > " )();
		registerForInput@Console()();
		in( var );
		readStore;
		undef( store.( var ) );
		undef( var );
		writeStore
	} else {
		println@Console( "Command not recognised: \"" + command + "\"" )()
	};
	undef( command );
	set
}

main
{
	get
	| 
	set
}
