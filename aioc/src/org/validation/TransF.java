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

import java.util.ArrayList;
import org.aioc.Choreography;
import org.aioc.IfThenElse;
import org.aioc.Interaction;
import org.aioc.LocalCode;
import org.aioc.NestedChoreography;
import org.aioc.Scope;
import org.aioc.SeqBlock;
import org.aioc.Skip;
import org.aioc.While;
import org.aioc.util.AiocSwitch;
import org.epp.impl.NameCollector;

import jolie.util.Pair;

public class TransF extends AiocSwitch< Boolean > {

	private ArrayList< Pair<String, String > > roles = new ArrayList< Pair<String, String > >();
	
	public TransF() {}
	
	@Override
	public Boolean caseChoreography( Choreography n ) {
		doSwitch( getLastEvent( n.getSeqBlock() ));
		if( n.getPar() != null ){
			doSwitch( n.getPar() );
		}
		return true;
	}
	
	private SeqBlock getLastEvent( SeqBlock n ){
		if( n.getNext().getPar() != null ){	doSwitch( n.getNext().getPar() ); }
		if( n.getNext() != null && hasNonSkippingNext( n ) ){
			return getLastEvent( n.getNext().getSeqBlock() );
		} else {
			return n;
		}
	}
	
	private Boolean hasNonSkippingNext( SeqBlock n ){
		if( !(n.getEvent() instanceof Skip ) ){
			return true;
		} else if( n.getNext() != null ){
			return hasNonSkippingNext( n.getNext().getSeqBlock() );
		} else {
			return false;
		}
	}
	
	public ArrayList< Pair<String, String > > getRoles( SeqBlock n ){
		doSwitch( n );
		return roles;
	}
	
	public ArrayList< Pair<String, String > > getRoles( Choreography n ){
		doSwitch( n );
		return roles;
	}
	
	@Override
	public Boolean caseSeqBlock( SeqBlock n ) {
		doSwitch( n.getEvent() );
		return true;
	}
	
	@Override
	public Boolean caseInteraction( Interaction n ){
		roles.add( new Pair<String, String>( n.getSender(), n.getReceiver() ) );
		return true;
	}
	
	@Override
	public Boolean caseLocalCode( LocalCode n ){
		roles.add( new Pair<String, String>( n.getThread(), n.getThread() ) );
		return true;
	}
	
	@Override
	public Boolean caseScope( Scope n ){
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null);
		if ( nc.getRoles().size() == 0 && n.getRoles() == null ) {
			roles.add( new Pair<String, String>(n.getThread(), n.getThread() ) ); 
		}
		for ( String role : nc.getRoles() ) {
			if ( !role.equals( n.getThread() )) {
				roles.add( new Pair<String, String>( role, n.getThread() ) );				
			}
		}
//		roles.addAll( nc.getRoles() );
		if( nc.getRoles().size() == 0 && n.getRoles() != null ){
//			roles.addAll( n.getRoles().getRoles() );
			for (String role : n.getRoles().getRoles() ) {
				if ( !role.equals( n.getThread() )) {
					roles.add( new Pair<String, String>( role,  n.getThread() ) );
				}
			}
		}
		return true;
	}

	@Override
	public Boolean caseIfThenElse( IfThenElse n ){
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
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null);
		if( nc.getRoles().size() == 0 ){
			roles.add( new Pair<String, String>( n.getThread(), n.getThread() ) ); 
		} else {
			TransF transF = new TransF();
			roles = transF.getRoles( n.getChoreography() ); 
//			if ( nc.getRoles().size() == 1 && nc.getRoles().contains( n.getThread() ) ){
//				roles.add( new Pair<String, String>( n.getThread(), n.getThread() ) );
//			} else {
//				for ( String role : nc.getRoles() ) {
//					if ( !role.equals( n.getThread() ) ) {
//						roles.add( new Pair<String, String>( n.getThread(), role ) );					
//					}
//				}	
//			}
		}
		return true;
	}

}
