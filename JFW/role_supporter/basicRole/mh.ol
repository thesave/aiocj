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

execution { concurrent }

type OpType:void {
	.msgID:string
	.content?:undefined
}

type CoordType:void {
	.rolesNum:int
	.hasAck?:bool
	.sid:string
}

type JoinType:void {
	.sid:string
}

interface MHInterface {
OneWay:
	initStartProcedure(CoordType)
RequestResponse:
	joinAck(JoinType)(void), joinStart(JoinType)(void)
}

inputPort MyInputPort {
Location: "local"
Interfaces: MHInterface
}

cset { 
msgID:
	OpType.msgID
}

cset { 
sid:
	CoordType.sid JoinType.sid
}

define joinStart
{
	joinStart()(	) {
		if (--joinStartCounter > 0) {
			joinStart
		}	
	}
}

define joinAck
{
	joinAck()(	) {
		if (--joinAckCounter > 0) {
			joinAck
		}	
	}
}

main
{
	[ initStartProcedure(startRequest) ] {
		joinStartCounter = joinAckCounter = startRequest.rolesNum;
		joinStart;
		if (startRequest.hasAck) {
			joinAck
		}
	}
}

