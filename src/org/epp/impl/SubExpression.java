package org.epp.impl;

import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.expression.ConstantDoubleExpression;

public class SubExpression extends ConstantDoubleExpression  {

	private static final long serialVersionUID = 1L;
	private OLSyntaxNode expressioNode;
	
	public SubExpression(){
		super( JolieEppUtils.PARSING_CONTEXT, 0d);
	}
	
	private void setExpressionNode( OLSyntaxNode n ){
		this.expressioNode = n;
	}
	
	public OLSyntaxNode getExpressionNode(){
		return expressioNode;
	}
	
	public SubExpression enclose( OLSyntaxNode n ){
		setExpressionNode( n );
		return this;
	}
	
}
