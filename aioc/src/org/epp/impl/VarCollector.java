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

import org.aioc.Condition;
import org.aioc.Constant;
import org.aioc.Expression;
import org.aioc.ExpressionBasicTerm;
import org.aioc.SumExpression;
import org.aioc.SumExpressionTerm;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.ecore.EObject;


public class VarCollector extends AiocSwitch< Boolean >
{
	private final Set< String > varNames = new HashSet< String >();
	
	public void collect( Condition n ){
		doSwitch( n );
	}
	
	public void collect( Expression n ){
		doSwitch( n );
	}
	
	public void collect( ExpressionBasicTerm n ){
		doSwitch( n );
	}
	
	public void collect( SumExpression n ){
		doSwitch( n );
	}
	
public Boolean caseCondition( Condition n ){
		if( n.getLeft() != null ){
			doSwitch( n.getLeft() );
		}
		if( n.getRight() != null ){
			doSwitch( n.getRight() );
		}
		return true;
	}
	
public Boolean caseExpression( Expression n )
{
	return doSwitchIfNotNull( n.getSumExpression() );
}

public Boolean caseSumExpression( SumExpression n )
{
	for( EObject term : n.getChildren() ) {
		doSwitch( term );
	}
	return true;
}

public Boolean caseSumExpressionTerm( SumExpressionTerm n )
{
	return doSwitch( n.getExpression() );
}

public Boolean caseExpressionBasicTerm( ExpressionBasicTerm n )
{
	if ( n.getVariable() != null && (
			!n.getVariable().equals("true") && 
			!n.getVariable().equals("false")) ){
			varNames.add( n.getVariable() );
	} else if ( n.getConstant() != null ) {
		return doSwitch( n.getConstant() );
	} 
	else if ( n.getCondition() != null ) {
		return doSwitch( n.getCondition() );
	}
	return true;
}
	
	public Boolean caseConstant( Constant n )
{
	return true;
}

	public Set< String > getVarNames(){
		return varNames;
	}

	private Boolean doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return true;
	}
}
