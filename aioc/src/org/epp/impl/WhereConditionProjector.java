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
import jolie.lang.parse.ast.expression.AndConditionNode;
import jolie.lang.parse.ast.expression.ConstantBoolExpression;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.OrConditionNode;

import org.aioc.ConditionOperator;
import org.aioc.Expression;
import org.aioc.Where;
import org.aioc.WhereCompareCondition;
import org.aioc.WhereExpressionBasicTerm;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.NamedNodeMap;

public class WhereConditionProjector extends AiocSwitch< OLSyntaxNode >
{
	private WhereConditionProjector() {}

	public static OLSyntaxNode project( Where n )
	{
		return new WhereConditionProjector().doSwitchIfNotNull( n.getWhereCondition() );
	}
	
	public OLSyntaxNode caseWhere( Where n ){
		return doSwitchIfNotNull( n.getWhereCondition() );
	}

	public OLSyntaxNode caseWhereCompareCondition( WhereCompareCondition n )
	{
		OLSyntaxNode c = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		if( n.getLeft() != null ){
			if( n.getRight() != null ){
				c = new CompareConditionNode(
						JolieEppUtils.PARSING_CONTEXT,
						doSwitch( n.getLeft() ),
						doSwitch( n.getRight() ),
						projectCompareOperator( n.getOperator() ) );
			} else {
				c = doSwitch( n.getLeft() );
			}
			if( n.getNext() != null ){
				if( n.isAnd() ){
					AndConditionNode cc = new AndConditionNode( JolieEppUtils.PARSING_CONTEXT );
					cc.addChild( c );
					if( n.getNext().isParen() ){
						cc.addChild( new SubExpression().enclose( doSwitch( n.getNext() ) ) );						
					} else {
						cc.addChild( doSwitch( n.getNext() ));
					}
					c = cc;
				} else {
					OrConditionNode cc = new OrConditionNode( JolieEppUtils.PARSING_CONTEXT );
					cc.addChild( c );
					if( n.getNext().isParen() ){
						cc.addChild( new SubExpression().enclose( doSwitch( n.getNext() ) ) );
					} else {
						cc.addChild( doSwitch( n.getNext() ));
					}
					c = cc;						
				}
			}
		}
		return c;
	}
	
	public OLSyntaxNode caseWhereExpressionBasicTerm( WhereExpressionBasicTerm n ){
		if( n.getEVariable() != null ){
			return JolieEppUtils.toPath( "request.environment." + 
		n.getEVariable() );
		} else if ( n.getNVariable() != null ){
			return JolieEppUtils.toPath( "request.properties." + 
		n.getNVariable() );
		} else if ( n.getSVariable() != null ){
			return JolieEppUtils.toPath( "request.state." + 
		n.getSVariable() );
		} else if ( n.getConstant() != null ){
			if( n.getConstant().getTrue() != null ){
				return new ConstantBoolExpression( JolieEppUtils.PARSING_CONTEXT, true );
			} else if ( n.getConstant().getFalse() != null ){
				return new ConstantBoolExpression( JolieEppUtils.PARSING_CONTEXT, false );
			} else if ( n.getConstant().getStrValue() != null ){
				return new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getConstant().getStrValue() );
			} else if ( n.getConstant().getIntValue() != null ){
				return new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, (int) n.getConstant().getIntValue().getValue() );
			}
		}
		return null;
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
