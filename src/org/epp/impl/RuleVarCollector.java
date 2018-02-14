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


package org.epp.impl;

import java.util.HashSet;
import java.util.Set;

import org.aioc.Where;
import org.aioc.WhereCompareCondition;
import org.aioc.WhereExpressionBasicTerm;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.ecore.EObject;


public class RuleVarCollector extends AiocSwitch< Boolean >
{
	private final Set< String > stateVarNames = new HashSet< String >();
	private final Set< String > propertiesVarNames = new HashSet< String >();
	private final Set< String > environmentVarNames = new HashSet< String >();
	
	public void collect(EObject expression) {
		doSwitchIfNotNull( expression );
	}
	
	public Set< String > getStateVarNames(){
		return stateVarNames;
	}
	
	public Set< String > getPropertiesVarNames(){
		return propertiesVarNames;
	}
	
	public Set< String > getEnvironmentVarNames(){
		return environmentVarNames;
	}
	
	public Boolean caseWhere( Where n ){
		return doSwitchIfNotNull( n.getWhereCondition() );
	}
	
	public Boolean caseWhereCompareCondition( WhereCompareCondition n )
	{
		doSwitchIfNotNull( n.getLeft() );
		doSwitchIfNotNull( n.getNext() );
		return doSwitchIfNotNull( n.getRight() );
	}

	public Boolean caseWhereExpressionBasicTerm( WhereExpressionBasicTerm n )
	{
		if( n.getNVariable() != null ){
			propertiesVarNames.add( n.getNVariable() );
		}
		if( n.getSVariable() != null ){
			stateVarNames.add( n.getSVariable() );
		}
		if( n.getEVariable() != null ){
			environmentVarNames.add( n.getEVariable() );
		}
		return true;
	}
	
	private Boolean doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return true;
	}
}
