package org.epp;

import java.io.IOException;
import java.io.StringWriter;


import org.epp.impl.JolieEppUtils;
import org.epp.impl.JolieProcessPrettyPrinter;

import jolie.lang.parse.Scanner;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.CompareConditionNode;
import jolie.lang.parse.ast.DefinitionNode;
import jolie.lang.parse.ast.ForStatement;
import jolie.lang.parse.ast.PostIncrementStatement;
import jolie.lang.parse.ast.Program;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;

public class TestOutput {

	public static void main(String[] args) throws IOException {
		Program jolieProgram = new Program( JolieEppUtils.PARSING_CONTEXT );
		StringWriter w = new StringWriter();
		
		SequenceStatement s = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		s.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
			JolieEppUtils.toPath( "ciao" ), 
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, "ciao") ) );
		s.addChild( 
			new PostIncrementStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( "ciao" ) ) );
		s.addChild( 
				new PostIncrementStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( "ciao" ) ) );
		s.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( "ciao" ), 
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, "ciao") ) );
		
		s.addChild( new ForStatement( 
						JolieEppUtils.PARSING_CONTEXT,
						// c = 0
						new AssignStatement(
								JolieEppUtils.PARSING_CONTEXT, 
								JolieEppUtils.toPath( "c" ),
								new ConstantIntegerExpression(
										JolieEppUtils.PARSING_CONTEXT, 0 )
								),
						// c < #aRes.LEADER.code
						new CompareConditionNode(
								JolieEppUtils.PARSING_CONTEXT, 
								JolieEppUtils.toPath( "c" ), 
								JolieEppUtils.toPath( 
										"#aRes.roles." + "LEADER" + ".code"), 
										Scanner.TokenType.LANGLE ),
						// c++
						new PostIncrementStatement(
								JolieEppUtils.PARSING_CONTEXT, 
								JolieEppUtils.toPath( "c" )),
								
						// embed_scope@ActivityManager(aRes.LEADER.code[ c ])()
						new SolicitResponseOperationStatement(
								JolieEppUtils.PARSING_CONTEXT,
								"embed_scope", 
								"ActivityManager", 
								JolieEppUtils.toPath( 
										"aRes.roles." + "LEADER" + ".code[ c ]"), 
										null, null)
						)
			);		
		
		jolieProgram.addChild( new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "main", s ) );
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter( w, jolieProgram );
		printer.run();
		
		System.out.println( w.toString() );

	}

}
