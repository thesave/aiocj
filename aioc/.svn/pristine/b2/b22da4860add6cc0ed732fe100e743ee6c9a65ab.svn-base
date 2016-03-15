/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
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

import jolie.lang.parse.Scanner;
import jolie.lang.parse.ast.CompareConditionNode;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;

import org.aioc.Condition;
import org.aioc.ConditionOperator;
import org.aioc.Expression;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.ecore.EObject;

public class ConditionProjector extends AiocSwitch< OLSyntaxNode >
{
	private ConditionProjector() {}

	public static OLSyntaxNode project( Condition condition )
	{
		return new ConditionProjector().doSwitchIfNotNull( condition );
	}

	public OLSyntaxNode caseCondition( Condition n )
	{
		OLSyntaxNode c = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		OLSyntaxNode left = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		OLSyntaxNode right = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		if( n.getLeft() != null ){
			c = left = doSwitch( n.getLeft() );
			if( n.getRight() != null ){
				right = doSwitch( n.getRight() );
				c = new CompareConditionNode(
						JolieEppUtils.PARSING_CONTEXT,
						left,
						right,
						projectCompareOperator( n.getOperator() ));					
				}
			}
		return c;
	}
	
	public OLSyntaxNode caseExpression( Expression n ){
		return ExpressionProjector.project( n );
	}

	private static Scanner.TokenType projectCompareOperator( ConditionOperator operator )
	{
		if ( operator.isEqual() ) {
			return Scanner.TokenType.EQUAL;
		} else if ( operator.isLt() ) {
			return Scanner.TokenType.LANGLE;
		} else if ( operator.isAnd() ) {
			return Scanner.TokenType.AND;
		}	else if ( operator.isOr() ) {
			return Scanner.TokenType.OR;
		} else if ( operator.isLeq() ) {
			return Scanner.TokenType.MINOR_OR_EQUAL;
		} else if ( operator.isGt() ) {
			return Scanner.TokenType.RANGLE;
		} else if ( operator.isGeq() ) {
			return Scanner.TokenType.MAJOR_OR_EQUAL;
		} else if ( operator.isNot_equal() ) {
			return Scanner.TokenType.NOT_EQUAL;
		}
		return null;
	}

	private OLSyntaxNode doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return null;
	}
}
