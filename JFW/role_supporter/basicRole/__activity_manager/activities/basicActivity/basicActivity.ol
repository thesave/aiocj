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

include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

type JoinType: void {
	.sid: string
}

cset { msgID:	OpType.msgID }

outputPort Leader {
	Protocol: sodep
	RequestResponse: joinStart( JoinType )( void )
}

inputPort MyInputPort {
	Location: "local"
	Protocol: sodep
	Interfaces: AdaptActivityInterface
	RequestResponse: coord( OpType )( void )
}

define onRun
{
	csets.cookie = csets.msgID = "basicActivity";
	coord( var1 )();
	Leader.location = var1.content.leader;
	adapt( eReq )(){ 
		for ( c = 0, c < #eReq.code, c++ ){
			embed_scope@ActivityManager(eReq.code[ c ])()
		}
	};
	var2.sid = var1.content.sid;
	joinStart@Leader( var2 )();
	run@ActivityManager(eReq.main_key)()
}

define start
{
	nullProcess 
}
