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

import jolie.lang.Constants.OperandType;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.expression.ConstantBoolExpression;
import jolie.lang.parse.ast.expression.ConstantDoubleExpression;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.SumExpressionNode;
import jolie.util.Pair;

import java.util.HashMap;

import org.aioc.Constant;
import org.aioc.Expression;
import org.aioc.ExpressionBasicTerm;
import org.aioc.SumExpression;
import org.aioc.SumExpressionAddTerm;
import org.aioc.SumExpressionDivideTerm;
import org.aioc.SumExpressionSubtractTerm;
import org.aioc.SumExpressionTerm;
import org.aioc.SumExpressionTimesTerm;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.ecore.EObject;

public class ExpressionProjector extends AiocSwitch< OLSyntaxNode >
{
	private final HashMap<String, String> variableMap;
	
	private ExpressionProjector( HashMap<String,String> variableMap ) { this.variableMap = variableMap; }
	
	public static OLSyntaxNode project( EObject expression, HashMap<String, String> variableMap )
	{
		return new ExpressionProjector( variableMap ).doSwitchIfNotNull( expression );
	}
	
	public OLSyntaxNode caseExpression( Expression n )
	{
		return doSwitchIfNotNull( n.getSumExpression() );
	}
	
	public OLSyntaxNode caseSumExpression( SumExpression n )
	{
		SumExpressionNode jolieSumExpression = new SumExpressionNode( JolieEppUtils.PARSING_CONTEXT );
		OLSyntaxNode jolieTerm;
//		Boolean castToInt = false;
//		for (EObject term : n.getChildren() ){
//			jolieTerm = doSwitch( term );
//			if (!( term instanceof SumExpressionAddTerm ) && !( term instanceof ExpressionBasicTerm )) {
//				castToInt = castToInt || true;
//			}
//		}
		
		for( EObject term : n.getChildren() ) {
			jolieTerm = doSwitch( term );
			if ( term instanceof SumExpressionAddTerm || term instanceof ExpressionBasicTerm ) {
//				if( term instanceof SumExpressionAddTerm ){
//					jolieSumExpression.add( jolieTerm );					
//				} else if ( castToInt && ((ExpressionBasicTerm) term).getVariable() != null  ){
//					jolieSumExpression.add( JolieEppUtils.toPath( "int( " + ((ExpressionBasicTerm) term).getVariable() + " )" ) );
//				} else {
					jolieSumExpression.add( jolieTerm );
//				}
			} else if( term instanceof SumExpressionSubtractTerm ){
				jolieSumExpression.operands().add( new Pair< OperandType, OLSyntaxNode >( OperandType.SUBTRACT, jolieTerm  ) );
			} else if( term instanceof SumExpressionTimesTerm ){
				jolieSumExpression.operands().add( new Pair< OperandType, OLSyntaxNode >( OperandType.MULTIPLY, jolieTerm  ) );
			} else if( term instanceof SumExpressionDivideTerm ){
				jolieSumExpression.operands().add( new Pair< OperandType, OLSyntaxNode >( OperandType.DIVIDE, jolieTerm  ) );
			}
		}
		return jolieSumExpression;
	}
	
	public OLSyntaxNode caseSumExpressionTerm( SumExpressionTerm n )
	{
		return doSwitch( n.getExpression() );
	}

	public OLSyntaxNode caseExpressionBasicTerm( ExpressionBasicTerm n )
	{
		if ( n.getVariable() != null ) {
			String v = variableMap.get( n.getVariable() );
			if( n.isNot() ){ v = "!" + v; }
			return JolieEppUtils.toPath( v );
		} else if ( n.getConstant() != null ) {
			return doSwitch( n.getConstant() );
		} 
		else if ( n.getCondition() != null ){
			return new SubExpression().enclose( ConditionProjector.project( n.getCondition(), variableMap ));
		}
//		else if ( n.getExpression() != null ) {
//			return doSwitch( n.getExpression() );
//		}

		return null;
	}
	
	public OLSyntaxNode caseConstant( Constant n )
	{
		if ( n.getStrValue() != null ) {
			return new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getStrValue() );
		} if( n.getTrue() != null ){
			return new ConstantBoolExpression( JolieEppUtils.PARSING_CONTEXT, true );
		} if( n.getFalse() != null ){
			return new ConstantBoolExpression( JolieEppUtils.PARSING_CONTEXT, false );
		} if( n.getFloatValue() != null ){
			return new ConstantDoubleExpression( JolieEppUtils.PARSING_CONTEXT, Double.parseDouble( n.getFloatValue().getValue() ) );
		} else {
			return new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, n.getIntValue().getValue() );
		}
	}
	
	private OLSyntaxNode doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return null;
	}
}
