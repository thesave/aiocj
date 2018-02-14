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

import java.util.TreeSet;

import org.aioc.Choreography;
import org.aioc.IfThenElse;
import org.aioc.Interaction;
import org.aioc.NestedChoreography;
import org.aioc.Scope;
import org.aioc.SeqBlock;
import org.aioc.While;
import org.aioc.util.AiocSwitch;

public class CausalitySafety extends AiocSwitch< Boolean > {

	public class CSInteraction implements Comparable< CSInteraction >{
		
		private Interaction interaction;
		private String operation;
		private String receiver;
		private String sender;
		
		public CSInteraction( Interaction i, String o, String r, String s ){
			this.receiver = r;
			this.operation = o;
			this.sender = s;
			this.interaction = i;
		}
		
		public Interaction getInteraction() {
			return interaction;
		}
		
		public int compareTo( CSInteraction i ) {
			if( 
					this.operation.equals( i.operation ) &&
					this.sender.equals( i.sender ) &&
					this.receiver.equals( i.receiver )
					){
				return 0; // the object is equal
				} else {
					return 1; // the object is different
				}
		}
		
	}
		
	TreeSet< CSInteraction > interactions = new TreeSet< CSInteraction >();
	
	public TreeSet< CSInteraction > getInteractions( Choreography n ){
		doSwitch( n );
		return interactions;
	}
	
	public TreeSet< CSInteraction > getInteractions( SeqBlock n ){
		doSwitch( n );
		return interactions;
	}
	
	@Override
	public Boolean caseChoreography( Choreography n ) {
		doSwitch( n.getSeqBlock() );
		if( n.getPar() != null ){
			doSwitch( n.getPar() );
		}
		return true;
	}
	
	@Override
	public Boolean caseSeqBlock( SeqBlock n ) {
		doSwitch( n.getEvent() );
		if( n.getNext() != null ){
			doSwitch( n.getNext() );
		}
		return true;
	}
	
	@Override
	public Boolean caseInteraction( Interaction n ) {
		interactions.add( new CSInteraction(n, 
				n.getOperation(), n.getReceiver(), n.getSender() ));
		return true;
	}
	
	@Override
	public Boolean caseNestedChoreography( NestedChoreography n ) {
		doSwitch( n.getChoreography() );
		return true;
	}
	
	@Override
	public Boolean caseIfThenElse( IfThenElse n ) {
		doSwitch( n.getThen() );
		if( n.getElse() != null ){
			doSwitch( n.getElse() );
		}
		return true;
	}

	@Override
	public Boolean caseScope( Scope n ) {
		doSwitch( n.getChoreography() );
		return true;
	}
	
	@Override
	public Boolean caseWhile( While n ) {
		doSwitch( n.getChoreography() );
		return true;
	}
	
}
