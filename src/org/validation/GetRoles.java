/***************************************************************************
 *   Copyright (C) 2013-2014 by Saverio Giallorenzo <sgiallor@cs.unibo.it> *
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

package org.validation;

import java.util.HashSet;

import org.aioc.Choreography;
import org.aioc.IfThenElse;
import org.aioc.Interaction;
import org.aioc.LocalCode;
import org.aioc.NestedChoreography;
import org.aioc.Scope;
import org.aioc.SeqBlock;
import org.aioc.While;
import org.aioc.util.AiocSwitch;
import org.epp.impl.NameCollector;

public class GetRoles extends AiocSwitch< Boolean >{
	
	private HashSet< String > roles = new HashSet< String >();
	
	public HashSet< String > getRoles( Choreography n ){
		doSwitch( n );
		return roles;
	}
	
	@Override
	public Boolean caseChoreography(Choreography n) {
		doSwitch( n.getSeqBlock() );
		if( n.getPar() != null ){
			doSwitch( n.getPar() );
		}
		return true;
	}
	
	@Override
	public Boolean caseSeqBlock( SeqBlock n ) {
		doSwitch( n.getEvent() );
		if ( n.getNext() != null ){
			doSwitch( n.getNext() );
		}
		return true;
	}
	
	@Override
	public Boolean caseInteraction( Interaction n ){
		roles.add( n.getSender() );
		roles.add( n.getReceiver() );
		return true;
	}
	
	@Override
	public Boolean caseLocalCode( LocalCode n ){
		roles.add( n.getThread() );
		return true;
	}
	
	@Override
	public Boolean caseScope( Scope n ){
		roles.add( n.getThread() );
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null);
		roles.addAll( nc.getRoles() );
		if( n.getRoles() != null ){
			roles.addAll( n.getRoles().getRoles() );
		}
		return true;
	}

	@Override
	public Boolean caseIfThenElse( IfThenElse n ){
		roles.add( n.getThread() );
		doSwitch( n.getThen() );
		if( n.getElse() != null ){
			doSwitch( n.getElse() );
		}
		return true;
	}
	
	@Override
	public Boolean caseNestedChoreography( NestedChoreography n ) {
		doSwitch( n.getChoreography() );
		return true;
	}
	
	@Override
	public Boolean caseWhile( While n ){
		roles.add( n.getThread() );
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null);
		roles.addAll( nc.getRoles() );
		return true;
	}
	
}
