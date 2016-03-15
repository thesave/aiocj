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


package org.epp.impl.merging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jolie.lang.Constants.OperandType;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.DeepCopyStatement;
import jolie.lang.parse.ast.DefinitionCallStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.TypeCastExpressionNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.FreshValueExpressionNode;
import jolie.lang.parse.ast.expression.SumExpressionNode;
import jolie.util.Pair;

public class EqualUtils
{
	public static Boolean checkEqual( OLSyntaxNode left, OLSyntaxNode right )
	{
		try {
			if ( left == null || right == null ) {
				return left == right;
			}
			Method m = EqualUtils.class.getMethod( "checkEqual", left.getClass(), right.getClass() );
			return (Boolean) m.invoke( null, left, right );
		} catch( NoSuchMethodException e ) {
			return false;
		} catch( InvocationTargetException e ) {
			return false;
		} catch( IllegalAccessException e ) {
			return false;
		}
	}
	
	public static Boolean checkEqual( DefinitionCallStatement left, DefinitionCallStatement right )
	{
		return left.id().equals( right.id() );
	}
	
	public static Boolean checkEqual( ConstantStringExpression left, ConstantStringExpression right )
	{
		return left.value().equals( right.value() );
	}
	
	public static Boolean checkEqual( ConstantIntegerExpression left, ConstantIntegerExpression right )
	{
		return left.value() == right.value();
	}
	
	public static Boolean checkEqual( FreshValueExpressionNode left, FreshValueExpressionNode right )
	{
		return true;
	}
	
	public static Boolean checkEqual( TypeCastExpressionNode left, TypeCastExpressionNode right )
	{
		return left.type().equals( right.type() ) && checkEqual( left.expression(), right.expression() );
	}
	
	public static Boolean checkEqual( SolicitResponseOperationStatement left, SolicitResponseOperationStatement right )
	{
		if ( !left.id().equals( right.id() ) ) {
			return false;
		}
		
		return checkEqual( left.inputVarPath(), right.inputVarPath() ) && checkEqual( left.outputExpression(), right.outputExpression() );
	}
	
	public static Boolean checkEqual( OneWayOperationStatement left, OneWayOperationStatement right )
	{
		if ( !left.id().equals( right.id() ) ) {
			return false;
		}
		
		return checkEqual( left.inputVarPath(), right.inputVarPath() );
	}
	
	public static Boolean checkEqual( NullProcessStatement left, NullProcessStatement right )
	{
		return true;
	}
	
	public static Boolean checkEqual( AssignStatement left, AssignStatement right )
	{
		return checkEqual( left.variablePath(), right.variablePath() ) && checkEqual( left.expression(), right.expression() );
	}
	
	public static Boolean checkEqual( DeepCopyStatement left, DeepCopyStatement right )
	{
		return checkEqual( left.leftPath(), right.leftPath() ) && checkEqual( left.rightPath(), right.rightPath() );
	}
	
	public static Boolean checkEqual( NotificationOperationStatement left, NotificationOperationStatement right )
	{
		if ( !left.id().equals( right.id() ) ) {
			return false;
		}

		if ( !left.outputPortId().equals( right.outputPortId() ) ) {
			return false;
		}

		return checkEqual( left.outputExpression(), right.outputExpression() );
	}
	
	public static Boolean checkEqual( SumExpressionNode left, SumExpressionNode right )
	{
		if ( left.operands().size() != right.operands().size() ) {
			return null;
		}
		
		Pair< OperandType, OLSyntaxNode > leftPair, rightPair;
		for( int i = 0; i < left.operands().size(); i++ ) {
			leftPair = left.operands().get( i );
			rightPair = right.operands().get( i );
			if (
				leftPair.key() != rightPair.key()
				|| checkEqual( leftPair.value(), rightPair.value() ) == false
			) {
				return false;
			}
		}
		return true;
	}

	public static Boolean checkEqual( VariablePathNode left, VariablePathNode right )
	{
		if ( left == null || right == null ) {
			return left == right;
		}
		
		if ( left.path().size() != right.path().size() ) {
			return false;
		}

		ConstantStringExpression leftName, rightName;
		ConstantIntegerExpression leftIndex, rightIndex;
		Pair< OLSyntaxNode, OLSyntaxNode > leftPair, rightPair;
		for( int i = 0; i < left.path().size(); i++ ) {
			leftPair = left.path().get( i );
			rightPair = right.path().get( i );
			leftName = (ConstantStringExpression)leftPair.key();
			rightName = (ConstantStringExpression)rightPair.key();
			if ( !leftName.value().equals( rightName.value() ) ) {
				return false;
			}
			leftIndex = (ConstantIntegerExpression)leftPair.value();
			rightIndex = (ConstantIntegerExpression)rightPair.value();
			if ( leftIndex.value() != rightIndex.value() ) {
				return false;
			}
		}
		return true;
	}
}
