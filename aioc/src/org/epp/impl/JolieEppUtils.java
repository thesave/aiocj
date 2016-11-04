/***********************************************************************************
 *   Copyright (C) 2009-2010 by Fabrizio Montesi <famontesi@gmail.com>             *
 *   Copyright (C) 2013-2016 by Saverio Giallorenzo <saverio.giallorenzo@gmail.com>*
 *                                                                                 *
 *   This program is free software; you can redistribute it and/or modify          *
 *   it under the terms of the GNU Library General Public License as               *
 *   published by the Free Software Foundation; either version 2 of the            *
 *   License, or (at your option) any later version.                               *
 *                                                                                 *
 *   This program is distributed in the hope that it will be useful,               *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of                *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                 *
 *   GNU General Public License for more details.                                  *
 *                                                                                 *
 *   You should have received a copy of the GNU Library General Public             *
 *   License along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                               *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.                     *
 *                                                                                 *
 *   For details about the authors of this software, see the AUTHORS file.         *
 ***********************************************************************************/

package org.epp.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import java.util.UUID;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import jolie.lang.NativeType;
import jolie.lang.parse.OLParseTreeOptimizer;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.CompareConditionNode;
import jolie.lang.parse.ast.DefinitionCallStatement;
import jolie.lang.parse.ast.DefinitionNode;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.PreDecrementStatement;
import jolie.lang.parse.ast.PreIncrementStatement;
import jolie.lang.parse.ast.RequestResponseOperationStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.SumExpressionNode;
import jolie.lang.parse.ast.types.TypeInlineDefinition;
import jolie.lang.parse.context.ParsingContext;
import jolie.lang.parse.context.URIParsingContext;
import jolie.util.Pair;
import jolie.util.Range;

import org.aioc.Expression;
import org.aioc.ExpressionBasicTerm;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;

public class JolieEppUtils
{
	public static final ParsingContext PARSING_CONTEXT = new URIParsingContext( URI.create( "aioc" ), 0 );
	
	public static OLSyntaxNode optimizeProcess( OLSyntaxNode processNode )
	{
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		jolieProgram.addChild( new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "main", processNode ) );
		jolieProgram = new OLParseTreeOptimizer( jolieProgram ).optimize();
		DefinitionNode main = (DefinitionNode) jolieProgram.children().get( 0 );
		return main.body();
	}
	
	public static SumExpressionNode getSumExpression( OLSyntaxNode... elements ){
		SumExpressionNode s = new SumExpressionNode( JolieEppUtils.PARSING_CONTEXT );
		for (OLSyntaxNode element : elements) {
			s.add( element );
		}
		return s;
	}
	
	public static String getFreshVariable(){
//		return "_" + UUID.randomUUID().toString().replace("-", "");
		return VARIABLE_NAME + variableCounter++;
	}
	
	public static void deployEnvironment( String targetDirectory ) throws IOException {
		deployJFWElement( targetDirectory, "environment", JolieEppUtils.JFW_ENVIRONMENT );
	}
	
	public static void deployAdaptationManager( String targetDirectory ) throws IOException {
		deployJFWElement( targetDirectory, "adaptation_manager", JolieEppUtils.JFW_ADAPTATIONMANAGER );
	}
	
	public static void deployRoleSupporter( String targetDirectory ) throws IOException {
		deployJFWElement( targetDirectory, "role_supporter", JolieEppUtils.JFW_ROLESUPPORTER );
	}
	
	public static void deployJFWElement(String targetDirectory, String folderName, String JFW_Element) throws IOException {
		Bundle bundle = Platform.getBundle("aioc");
		File destFolder = new File(targetDirectory + File.separator + folderName);
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		Path path = new Path("src/org/epp/" + JFW_Element);
		URL fileUrl = FileLocator.find(bundle, path, null);
		InputStream jar_is = fileUrl.openStream();
		File jar_f = new File(destFolder + File.separator
				+ JFW_Element);

		byte[] b = new byte[4096];
		OutputStream jar_os = new FileOutputStream(jar_f);
		for (int rB = jar_is.read(b); rB > 0; rB = jar_is.read(b)) {
			jar_os.write(b, 0, rB);
		}
		jar_is.close();
		jar_os.close();
		JarFile jarFile = new JarFile(jar_f.getAbsolutePath());
		Enumeration<JarEntry> files = jarFile.entries();
		while (files.hasMoreElements()) {
			JarEntry e = files.nextElement();
			if (e.isDirectory()) {
				File dir = new File(destFolder + File.separator + e.getName());
				if (!dir.exists())
					dir.mkdirs();
			} else if (!e.equals(null) && !e.getName().contains(".MF")) {
				File file = new File(destFolder + File.separator + e.getName());
				file.createNewFile();
				InputStream in = jarFile.getInputStream(e);
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader r = new BufferedReader(isr);
				PrintWriter w = new PrintWriter(file);
				for (String line = ""; line != null; line = r.readLine()) {
					w.println(line);
				}
				w.close();
				r.close();
				isr.close();
				in.close();
			}
		}
		jarFile.close();
		File meta = new File(destFolder + File.separator + "META-INF");
		if (meta.exists()) {
			meta.delete();
		}
		if (jar_f.exists()) {
			jar_f.delete();
		}
	}

	public static void deployJorbaServerFramework( File destFolder ) throws IOException {
		Bundle bundle = Platform.getBundle("aioc");
		Path path = new Path("src/org/epp/" + JolieEppUtils.JFW_server);
		URL fileUrl = FileLocator.find(bundle, path, null);
		InputStream jar_is = fileUrl.openStream();
		File jar_f = new File( destFolder.toString() + File.separator + JolieEppUtils.JFW_server);

		byte[] b = new byte[4096];
		OutputStream jar_os = new FileOutputStream(jar_f);
		for (int rB = jar_is.read(b); rB > 0; rB = jar_is.read(b)) {
			jar_os.write(b, 0, rB);
		}
		jar_is.close();
		jar_os.close();
		JarFile jarFile = new JarFile(jar_f.getAbsolutePath());
		Enumeration<JarEntry> files = jarFile.entries();
		while (files.hasMoreElements()) {
			JarEntry e = files.nextElement();
			if (e.isDirectory()) {
				File dir = new File(destFolder + File.separator + e.getName());
				if (!dir.exists())
					dir.mkdirs();
			} else if (!e.equals(null) && !e.getName().contains(".MF")) {
				File file = new File(destFolder + File.separator + e.getName());
				file.createNewFile();
				InputStream in = jarFile.getInputStream(e);
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader r = new BufferedReader(isr);
				PrintWriter w = new PrintWriter(file);
				for (String line = ""; line != null; line = r.readLine()) {
					w.println(line);
				}
				w.close();
				r.close();
				isr.close();
				in.close();
			}
		}
		jarFile.close();
		File meta = new File(destFolder + File.separator + "META-INF");
		if (meta.exists()) {
			meta.delete();
		}
		if (jar_f.exists()) {
			jar_f.delete();
		}
	}
	
	
	public static void deployJorbaFramework( String targetDirectory, File destFolder ) throws IOException {
		Bundle bundle = Platform.getBundle("aioc");
		Path path = new Path("src/org/epp/" + JolieEppUtils.JFW);
		URL fileUrl = FileLocator.find(bundle, path, null);
		InputStream jar_is = fileUrl.openStream();
		File jar_f = new File( targetDirectory + File.separator + JolieEppUtils.JFW );

		byte[] b = new byte[4096];
		OutputStream jar_os = new FileOutputStream(jar_f);
		for (int rB = jar_is.read(b); rB > 0; rB = jar_is.read(b)) {
			jar_os.write(b, 0, rB);
		}
		jar_is.close();
		jar_os.close();
		JarFile jarFile = new JarFile(jar_f.getAbsolutePath());
		Enumeration<JarEntry> files = jarFile.entries();
		while (files.hasMoreElements()) {
			JarEntry e = files.nextElement();
			if (e.isDirectory()) {
				File dir = new File(destFolder + File.separator + e.getName());
				if (!dir.exists())
					dir.mkdirs();
			} else if (!e.equals(null) && !e.getName().contains(".MF")) {
				File file = new File(destFolder + File.separator + e.getName());
				file.createNewFile();
				InputStream in = jarFile.getInputStream(e);
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader r = new BufferedReader(isr);
				PrintWriter w = new PrintWriter(file);
				for (String line = ""; line != null; line = r.readLine()) {
					w.println(line);
				}
				w.close();
				r.close();
				isr.close();
				in.close();
			}
		}
		jarFile.close();
		File meta = new File(destFolder + File.separator + "META-INF");
		if (meta.exists()) {
			meta.delete();
		}
		if (jar_f.exists()) {
			jar_f.delete();
		}
	}

	private static int variableCounter = 0;
	private static final String VARIABLE_NAME = "var";
	
	public static String getFreshOperation(){
		return OPERATION_VARIABLE + operationCounter++;
	}
	
	private static int operationCounter = 0;
	private static final String OPERATION_VARIABLE = "op";
	
	public static String getCookie(){
		return UUID.randomUUID().toString();
	}
	
	public static String getOperationFromUUID(String s){
		return "_" + s.replace("-", "");
	}
	
	public static VariablePathNode toPath( String variable ) 
	{
		if ( variable == null ) {
			return null;
		}
		VariablePathNode ret = new VariablePathNode( JolieEppUtils.PARSING_CONTEXT, VariablePathNode.Type.NORMAL );
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, variable ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		return ret;
	}
	
	public static VariablePathNode toGlobalPath( String variable )
	{
		if ( variable == null ) {
			return null;
		}
		VariablePathNode ret = new VariablePathNode( JolieEppUtils.PARSING_CONTEXT, VariablePathNode.Type.GLOBAL );
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, variable ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		return ret;
	}

	public static String getSimpleAiocVariable( EObject e )
	{
		if ( e != null ) {
			if ( e instanceof ExpressionBasicTerm ) {
				return ((ExpressionBasicTerm)e).getVariable();
			} else if ( e instanceof Expression ){
				EList< EObject > list = ((Expression)e).getSumExpression().getChildren();
				if ( list.size() == 1 ) {
					return ((ExpressionBasicTerm)list.get( 0 )).getVariable();
				}
			}
		}
		return null;
	}

	public static void appendSubNode( VariablePathNode path, String nodeName )
	{
		path.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( PARSING_CONTEXT, nodeName ),
			new ConstantIntegerExpression( PARSING_CONTEXT, 0 )
		));
	}

	public final static String TID_VARNAME = "tid";
	public final static String CONTENT_VARNAME = "content";
	public final static String MESSAGEHANDLER_NAME = "MH";
	public final static String MESSAGEHANDLER_FILENAME = "mh.ol";
	public final static String MH_EMBEDDING_PREFIX_FOLDER = "__activity_manager" + File.separator + "activities";
	public final static String ACTIVITY_REDIRECTION = "Activity";
	public final static String JOLIE_TYPE = "Jolie";
	public final static String GET_PREFIX = "get_";
	public final static String JFW = "Client_JFW.jar";
	public final static String JFW_server = "Server_JFW.jar";
	public final static String JFW_ADAPTATIONMANAGER = "adaptation_manager.jar";
	public final static String JFW_ENVIRONMENT = "environment.jar";
	public final static String JFW_ROLESUPPORTER = "role_supporter.jar";
	public final static String TMP_VARNAME = "_tmp";
	public final static String DELEGATION_TMP_VARNAME = "_delegation_tmp";
	public final static String CALL_TMP_VARNAME = "_call_tmp";
	public final static String RULE_KEYPLACEHOLDER = "Adapt__KPH__";
	//public final static String DELEGATION_DESCRIPTOR_VARNAME = "delegatedSessionDescriptor";
	public final static String SELF_INPUT_PORT_NAME = "MyInputPort";
	public final static String DEFAULT_MESSAGE_TYPE = "AiocType";
	public final static String MAIN_SCOPE = "MAIN_SCOPE";
	public final static String INITSTART_OPERATION = "initStartProcedure";
	public final static String INITSTART_OPERATION_PATH = "startRequest";
	public final static String START_OPERATION = "joinStart";
	public final static String ACK_OPERATION = "joinAck";
	public final static String SESSION_DESCRIPTOR = "_sessionDescriptor";
	public final static VariablePathNode SELFREF_VARPATH = toPath( "_myRef" );
	public final static VariablePathNode SELFREF_TID_VARPATH = toPath( "_myRef" );
	public final static VariablePathNode SELFREF_BINDING_VARPATH = toPath( "_myRef" );
	public final static VariablePathNode SELF_INPUT_PORT = new VariablePathNode( PARSING_CONTEXT, VariablePathNode.Type.GLOBAL );
	public final static VariablePathNode EXPRESSION_VARPATH = toPath( TMP_VARNAME );
	public final static VariablePathNode EXPRESSION_TID_VARPATH = toPath( TMP_VARNAME );
	
	public final static String SEMICOLON = ";";
	public final static String PIPE = "|";
	public static final String OUTPUT_PORT_NAME = "OutputPort";
	
	static {
		JolieEppUtils.appendSubNode( JolieEppUtils.SELFREF_TID_VARPATH, TID_VARNAME );
	
		JolieEppUtils.appendSubNode( JolieEppUtils.SELFREF_BINDING_VARPATH, "binding" );
	
		JolieEppUtils.appendSubNode( JolieEppUtils.SELF_INPUT_PORT, "inputPorts" );
		JolieEppUtils.appendSubNode( JolieEppUtils.SELF_INPUT_PORT, SELF_INPUT_PORT_NAME );
	
		JolieEppUtils.appendSubNode( JolieEppUtils.EXPRESSION_TID_VARPATH, TID_VARNAME );
	}
	

	public final static TypeInlineDefinition TYPE_OpType = 
			new TypeInlineDefinition(JolieEppUtils.PARSING_CONTEXT,	"OpType", NativeType.VOID, new Range(1, 1));
	
	static {
		TYPE_OpType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "msgID", NativeType.STRING, new Range(1, 1) ) );
		TYPE_OpType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "content", NativeType.RAW, new Range(0, 1) ) );
	}
	
	public final static TypeInlineDefinition TYPE_JoinType = 
			new TypeInlineDefinition(JolieEppUtils.PARSING_CONTEXT,	"JoinType", NativeType.VOID, new Range(1, 1));
	
	static {
		TYPE_JoinType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "sid", NativeType.STRING, new Range(1, 1) ) );
	}
	

	public final static TypeInlineDefinition TYPE_CoordType = 
			new TypeInlineDefinition(JolieEppUtils.PARSING_CONTEXT,	"CoordType", NativeType.VOID, new Range(1, 1));
	
	static {
		TYPE_CoordType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "sid", NativeType.STRING, new Range(1, 1) ) );
		TYPE_CoordType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "rolesNum", NativeType.INT, new Range(1, 1) ) );
		TYPE_CoordType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "hasAck", NativeType.BOOL, new Range(0, 1) ) );
	}
	
	private final static String JOINSTARTCOUNTER= "joinStartCounter";
	private final static IfStatement startBehaviour = new IfStatement( PARSING_CONTEXT );
	static {
		startBehaviour.addChild( 
           new Pair<OLSyntaxNode, OLSyntaxNode>( 
		     new CompareConditionNode(PARSING_CONTEXT, 
			   new PreDecrementStatement( PARSING_CONTEXT, toPath( JOINSTARTCOUNTER )), 
			   new ConstantIntegerExpression( PARSING_CONTEXT, 0), jolie.lang.parse.Scanner.TokenType.RANGLE
		     ), 
		     new DefinitionCallStatement( PARSING_CONTEXT, START_OPERATION )));
	}

	public final static DefinitionNode JoinStartDefinition = new DefinitionNode( PARSING_CONTEXT, START_OPERATION, 
			new RequestResponseOperationStatement( PARSING_CONTEXT, START_OPERATION, null, null, startBehaviour	)
	);

	
	private final static String JOINACKCOUNTER= "joinAckCounter";
	private final static IfStatement ackBehaviour = new IfStatement( PARSING_CONTEXT );
	static {
		ackBehaviour.addChild( 
           new Pair<OLSyntaxNode, OLSyntaxNode>( 
		     new CompareConditionNode(PARSING_CONTEXT, 
			   new PreDecrementStatement( PARSING_CONTEXT, toPath( JOINACKCOUNTER )), 
			   new ConstantIntegerExpression( PARSING_CONTEXT, 0), jolie.lang.parse.Scanner.TokenType.RANGLE
		     ), 
		     new DefinitionCallStatement( PARSING_CONTEXT, ACK_OPERATION )));
	}
	
	public final static DefinitionNode JoinAckDefinition = new DefinitionNode( PARSING_CONTEXT, ACK_OPERATION, 
			new RequestResponseOperationStatement( PARSING_CONTEXT, ACK_OPERATION, null, null, ackBehaviour	)
	);
	
	
	private final static SequenceStatement initStartProcedureBody = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
	
	static {
		initStartProcedureBody.addChild( 
          new AssignStatement( PARSING_CONTEXT, toPath( JOINSTARTCOUNTER ), 
			new AssignStatement( PARSING_CONTEXT, toPath( JOINACKCOUNTER ), toPath( INITSTART_OPERATION_PATH + ".rolesNum" ))));
		initStartProcedureBody.addChild( new DefinitionCallStatement( PARSING_CONTEXT, START_OPERATION ));
		
		IfStatement ifStm = new IfStatement( PARSING_CONTEXT );
		ifStm.addChild(new Pair<OLSyntaxNode, OLSyntaxNode>(
				toPath( INITSTART_OPERATION_PATH + ".hasAck"),
				new DefinitionCallStatement( PARSING_CONTEXT, ACK_OPERATION  )
				) 
		);
		initStartProcedureBody.addChild( ifStm );
	}
	
	public final static Pair<OLSyntaxNode, OLSyntaxNode> initStartProcedureND = new Pair<OLSyntaxNode, OLSyntaxNode>(
		new OneWayOperationStatement( 
				JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.INITSTART_OPERATION, 
				JolieEppUtils.toPath( JolieEppUtils.INITSTART_OPERATION_PATH )), 
		initStartProcedureBody	
	);
	
	
}
