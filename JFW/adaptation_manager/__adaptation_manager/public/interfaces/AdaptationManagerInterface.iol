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

include "./public/types/JorbaTypes.iol"
include "types/Binding.iol"

type RegisterAdaptationServerResponse: void 

interface AdaptationManagerInterface {
RequestResponse:
	registerAdaptationServer( Binding )( RegisterAdaptationServerResponse ),
	checkForUpdate( CheckForUpdateRequest )( CheckForUpdateResponse )
}
