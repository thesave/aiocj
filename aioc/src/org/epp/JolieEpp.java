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

package org.epp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jolie.lang.NativeType;
import jolie.lang.Constants.EmbeddedServiceType;
import jolie.lang.Constants.ExecutionMode;
import jolie.lang.parse.Scanner;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.CompareConditionNode;
import jolie.lang.parse.ast.CorrelationSetInfo;
import jolie.lang.parse.ast.CorrelationSetInfo.CorrelationAliasInfo;
import jolie.lang.parse.ast.CorrelationSetInfo.CorrelationVariableInfo;
import jolie.lang.parse.ast.DefinitionNode;
import jolie.lang.parse.ast.ExecutionInfo;
import jolie.lang.parse.ast.ForEachSubNodeStatement;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.InputPortInfo;
import jolie.lang.parse.ast.InputPortInfo.AggregationItemInfo;
import jolie.lang.parse.ast.DeepCopyStatement;
import jolie.lang.parse.ast.ForStatement;
import jolie.lang.parse.ast.EmbeddedServiceNode;
import jolie.lang.parse.ast.InterfaceDefinition;
import jolie.lang.parse.ast.NDChoiceStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.OutputPortInfo;
import jolie.lang.parse.ast.PostIncrementStatement;
import jolie.lang.parse.ast.RequestResponseOperationDeclaration;
import jolie.lang.parse.ast.RequestResponseOperationStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.UndefStatement;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.ConstantBoolExpression;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.IsTypeExpressionNode;
import jolie.lang.parse.ast.expression.IsTypeExpressionNode.CheckType;
import jolie.lang.parse.ast.types.TypeInlineDefinition;
import jolie.lang.parse.ast.expression.SumExpressionNode;
import jolie.util.Pair;
import jolie.util.Range;

import org.aioc.Aioc;
import org.aioc.AiocJ;
import org.aioc.AssignmentSet;
import org.aioc.Choreography;
import org.aioc.LocationDefinition;
import org.aioc.Rule;
import org.epp.impl.ExpressionProjector;
import org.epp.impl.FileUtils;
import org.epp.impl.JolieEppUtils;
import org.epp.impl.JolieProcessPrettyPrinter;
import org.epp.impl.LaunchScripts;
import org.epp.impl.NameCollector;
import org.epp.impl.RuleVarCollector;
import org.epp.impl.NameCollector.ScopeStructure;
import org.epp.impl.ThreadProjectionResult;
import org.epp.impl.ThreadProjector;
import org.epp.impl.WhereConditionProjector;
import org.epp.impl.merging.MergingException;

public class JolieEpp {
	private final File srcGenDirectory;
	private File targetDirectory;
	private final Map<String, URI> rolesLocations = new HashMap<String, URI>();
	private int threadTcpPort = 10500;

	/**
	 * JolieEpp creator
	 * 
	 * @param srcGenDirectory
	 *          - the directory of the project
	 */
	public JolieEpp(File srcGenDirectory) {
		if (srcGenDirectory.exists() == false) {
			srcGenDirectory.mkdirs();
		}
		this.srcGenDirectory = srcGenDirectory;
	}

	private URI getLocationURI(String location) {
		URI uri = null;
		location = "socket://" + location + "/";
		try { uri = URI.create(location); } 
		catch ( IllegalArgumentException e ){};
		return uri;
	}

	private void setRuleRoleLocation(Set<String> roles) {
		for ( String role : roles ) {
			rolesLocations.put(role, URI.create("RPH__" + role));
		}
	}

	private void collectLocations( LocationDefinition l ) {
		if (l != null) {
			if (l.getContinuation() != null) {
				collectLocations(l.getContinuation());
			};
			URI uri = getLocationURI(l.getLocation());
			if (uri != null) {
				rolesLocations.put(l.getRole(), uri);
			} else {
				System.out.println("Malformed Location " + l.getLocation()
						+ " for role " + l.getRole() + ". Assigning a fresh one.");
				rolesLocations.put(l.getRole(), getFreshInputLocation());
			}
		}
	}

	private URI getRoleLocation(String role) {
		URI location = rolesLocations.get(role);
		if (location == null) {
			location = getFreshInputLocation();
			rolesLocations.put(role, location);
		}
		return location;
	}

	private URI getFreshInputLocation() {
		return URI.create("socket://localhost:" + threadTcpPort++ + "/");
	}

	private String embedMessageHandler(
			String thread,
			jolie.lang.parse.ast.Program jolieProgram, 
			ThreadProjectionResult result,
			Boolean starter, 
			NameCollector collector, 
			String key ) throws IOException {

		Set<String> additionalOperations = new HashSet<String>();

		if ( starter ) {
			// add also ack and get_Ack
			additionalOperations.add( JolieEppUtils.START_OPERATION );
			additionalOperations.add( JolieEppUtils.ACK_OPERATION );
//			innerstartBlock = getInnerStartBlock( thread, collector );
//			startBlock = getStartBlock();
		}

		if ( result.uncorrelatedInputOperations().isEmpty() && additionalOperations.isEmpty() ) {
			// adds type definition
			jolieProgram.addChild( JolieEppUtils.TYPE_OpType );
			jolieProgram.addChild( JolieEppUtils.TYPE_JoinType );
			OutputPortInfo embedderOutputPort = new OutputPortInfo(
					JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.MESSAGEHANDLER_NAME);
			jolieProgram.addChild(embedderOutputPort);
			return "";
		} else {
			// createsMessageHandler
			jolie.lang.parse.ast.Program mh = new jolie.lang.parse.ast.Program(
					JolieEppUtils.PARSING_CONTEXT);

			mh.addChild( new ExecutionInfo(JolieEppUtils.PARSING_CONTEXT, ExecutionMode.CONCURRENT ) );

			// adds OpType definition
			mh.addChild( JolieEppUtils.TYPE_OpType );
			mh.addChild( JolieEppUtils.TYPE_CoordType );
			mh.addChild( JolieEppUtils.TYPE_JoinType );

			// adds inputPort
			InputPortInfo mhInputPort = new InputPortInfo(
					JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.SELF_INPUT_PORT_NAME,
					URI.create("local"), null, null, null, null);

			// adds interface definition
			InterfaceDefinition mh_interface = new InterfaceDefinition(
					JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.MESSAGEHANDLER_NAME
							+ "Interface");

			for ( String operation : result.uncorrelatedInputOperations() ) {
				mh_interface.addOperation( JolieEppUtils.getMHOperationDeclaration( operation ) );
				mh_interface.addOperation( JolieEppUtils.getMHOperationDeclaration( JolieEppUtils.GET_PREFIX + operation ) );
			}

			mh_interface.addOperation( JolieEppUtils.INITSTART_OPERATIONDECLARATION );
			mh_interface.addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
			mh_interface.addOperation( JolieEppUtils.ACK_OPERATIONDECLARATION );
			
			mhInputPort.addInterface(mh_interface);

			mh.addChild(mh_interface);
			mh.addChild(mhInputPort);

			// embed message handler, set outputPort, and add Aggregation to inputPort
			// type and interface must be integrated into the embedding thread (i.e., the role)
			jolieProgram.addChild( JolieEppUtils.TYPE_OpType );
			jolieProgram.addChild( JolieEppUtils.TYPE_CoordType );
			jolieProgram.addChild( JolieEppUtils.TYPE_JoinType );
			jolieProgram.addChild( mh_interface );

			OutputPortInfo embedderOutputPort = new OutputPortInfo(
					JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.MESSAGEHANDLER_NAME);
			embedderOutputPort.addInterface( mh_interface );
			jolieProgram.addChild( embedderOutputPort );

			String embeddingPath = JolieEppUtils.MESSAGEHANDLER_FILENAME;
			if (key != null) {
				embeddingPath = JolieEppUtils.MH_EMBEDDING_PREFIX_FOLDER
						+ File.separator + key + File.separator + embeddingPath;
			}

			EmbeddedServiceNode embed = new EmbeddedServiceNode(
					JolieEppUtils.PARSING_CONTEXT, EmbeddedServiceType.JOLIE,
					embeddingPath, JolieEppUtils.MESSAGEHANDLER_NAME);
			jolieProgram.addChild(embed);
			// --------------------------------------------------------------

			// adds correlation set definition
			List<CorrelationVariableInfo> csetVars = new ArrayList<CorrelationVariableInfo>();
			List<CorrelationAliasInfo> aliases = new ArrayList<CorrelationAliasInfo>();

			VariablePathNode msg_cset = JolieEppUtils
					.toPath("msgID");

			aliases.add(new CorrelationAliasInfo("OpType", msg_cset));
			csetVars.add(new CorrelationVariableInfo(JolieEppUtils
					.toPath("msgID"), aliases));
			CorrelationSetInfo cSetInfo = new CorrelationSetInfo(
					JolieEppUtils.PARSING_CONTEXT, csetVars);

			mh.addChild(cSetInfo);
			
			csetVars = new ArrayList<CorrelationVariableInfo>();
			aliases = new ArrayList<CorrelationAliasInfo>();

			VariablePathNode sid_cset = JolieEppUtils.toPath("sid");

			aliases.add(new CorrelationAliasInfo("CoordType", sid_cset));
			aliases.add(new CorrelationAliasInfo("JoinType", sid_cset));
			csetVars.add(new CorrelationVariableInfo(JolieEppUtils
					.toPath("sid"), aliases));
			cSetInfo = new CorrelationSetInfo( JolieEppUtils.PARSING_CONTEXT, csetVars );

			mh.addChild(cSetInfo);

			// adds the definition of joinStart and joinAck procedures
			mh.addChild( JolieEppUtils.JoinStartDefinition );
			mh.addChild( JolieEppUtils.JoinAckDefinition );

			// adds main body
			// for each incoming operation there is a synchronising non-deterministic
			// block
			NDChoiceStatement choiceBlock = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			// adds initStartProcedure operation
			choiceBlock.addChild( JolieEppUtils.initStartProcedureND );

			for (String inputOperation : result.uncorrelatedInputOperations()) {
				choiceBlock = buildSyncBlock(choiceBlock, inputOperation);
			}
			

			// adds syncBlock to the main procedure
			OLSyntaxNode jolieMainNode = new DefinitionNode(
					JolieEppUtils.PARSING_CONTEXT, "main", choiceBlock);
			mh.addChild(jolieMainNode);

			// deployMessageHandler
			StringWriter w = new StringWriter();
//			w.write("include \"runtime.iol\"\n");
//			w.write("include \"semaphore_utils.iol\"\n");
//			w.write('\n');
			JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter(w, mh);
			printer.run();
			return w.toString();
		}
	}

	private NDChoiceStatement buildSyncBlock(NDChoiceStatement choice,
			String inputOperation) {
		// sequence for send
		SequenceStatement seq = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);

		seq.addChild(new RequestResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.GET_PREFIX
						+ inputOperation, null, JolieEppUtils
						.toPath("c"), new NullProcessStatement(
						JolieEppUtils.PARSING_CONTEXT)));

		choice
				.addChild(new Pair<OLSyntaxNode, OLSyntaxNode>(
						new RequestResponseOperationStatement(
								JolieEppUtils.PARSING_CONTEXT, inputOperation, JolieEppUtils
										.toPath("c"), null, seq),
						new NullProcessStatement(JolieEppUtils.PARSING_CONTEXT)));
		// sequence for receive
		seq = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);

		seq.addChild(new RequestResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, inputOperation, JolieEppUtils
						.toPath("c1"), null,
				new NullProcessStatement(JolieEppUtils.PARSING_CONTEXT)));

		choice.addChild(new Pair<OLSyntaxNode, OLSyntaxNode>(
				new RequestResponseOperationStatement(JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.GET_PREFIX + inputOperation, JolieEppUtils
								.toPath("c"), JolieEppUtils
								.toPath("c1"), seq),
				new NullProcessStatement(JolieEppUtils.PARSING_CONTEXT)));

		return choice;
	}

	private void addInputInterfaceAndPort(
			jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result,
			URI location, Boolean leader) {
		// aggregation for messageHandler
		String[] aggregatedPorts = new String[1];
		aggregatedPorts[0] = JolieEppUtils.MESSAGEHANDLER_NAME;
		AggregationItemInfo[] mhAggregation = new AggregationItemInfo[1];
		mhAggregation[0] = new AggregationItemInfo(aggregatedPorts, null);

		InputPortInfo port = new InputPortInfo(JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.SELF_INPUT_PORT_NAME, location, "sodep", null,
				mhAggregation, null);

		InterfaceDefinition iface = new InterfaceDefinition(
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.SELF_INPUT_PORT_NAME
						+ "Interface");

		for ( String operation : result.uncorrelatedInputOperations() ) {
			iface.addOperation( JolieEppUtils.getMHOperationDeclaration( operation ) );
		}

		if (!leader) {
			// add adapt and noAdapt operations via interface
			port.addInterface( new InterfaceDefinition(JolieEppUtils.PARSING_CONTEXT, "AdaptActivityInterface" ) );
		}

		if (leader) {
			iface.addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
		}

//		port.addInterface( iface );

		if (!iface.operationsMap().isEmpty()) {
			// jolieProgram.addChild( iface );
			jolieProgram.addChild(port);
		}
	}

	// this is for the thread
	private void addOutputInterfacesAndPorts(
			Aioc aioc, jolie.lang.parse.ast.Program jolieProgram, 
			ThreadProjectionResult result, NameCollector nameCollector) {
		for ( OutputPortInfo port : result.outputPorts().values() ) {
			if ( nameCollector.getRoles().contains( port.id() ) ) {
				port.setLocation( getRoleLocation( port.id() ) );
			}
			jolieProgram.addChild(port);
		}
	}

	// this is for the scope
	private void addOutputInterfacesAndPortsScope( 
			jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result,
			NameCollector nameCollector, String label, Boolean leader ) {
		
		OutputPortInfo leaderOutputPort = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.LEADER_NAME );
		leaderOutputPort.setProtocolId( "sodep" );
		leaderOutputPort.addOperation( JolieEppUtils.ACK_OPERATIONDECLARATION );
		leaderOutputPort.addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
		if ( leader ) { leaderOutputPort.addOperation( JolieEppUtils.INITSTART_OPERATIONDECLARATION ); }
		jolieProgram.addChild( leaderOutputPort );
				
		if ( leader ){
			OutputPortInfo ledRoleOutputPort = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, "LedRole" );
			ledRoleOutputPort.setProtocolId( "sodep" );
			ledRoleOutputPort.addInterface( new InterfaceDefinition( JolieEppUtils.PARSING_CONTEXT, "AdaptActivityInterface") );
			ledRoleOutputPort.addOperation( new RequestResponseOperationDeclaration(
					  JolieEppUtils.PARSING_CONTEXT, "coord", new TypeInlineDefinition(
								JolieEppUtils.PARSING_CONTEXT, "OpType", NativeType.ANY,
								new Range(1, 1)), new TypeInlineDefinition(
								JolieEppUtils.PARSING_CONTEXT, "void", NativeType.ANY,
								new Range(1, 1)), null));
			jolieProgram.addChild( ledRoleOutputPort );
		}
		
		for ( OutputPortInfo port : result.outputPorts().values() ) {
//			 System.out.println( "SCOPE Looking for " + port.id() );
//			 System.out.println( nameCollector.getRoles().contains( port.id() ) );
			if ( nameCollector.getRoles().contains( port.id() ) ) {
				String scopeLocation = getRoleLocation( port.id() ) + "!/"
						+ JolieEppUtils.ACTIVITY_REDIRECTION + "/" + label;
				// System.out.println( "Found on " + scopeLocation );

				port.setLocation( URI.create( scopeLocation ) );
				if ( leader ) {
					port.addInterface( new InterfaceDefinition( JolieEppUtils.PARSING_CONTEXT, "AdaptActivityInterface") );
				}
			}
			jolieProgram.addChild(port);
		}
	}

	private void addOutputInterfacesAndPortsRule(
			jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result,
			NameCollector nameCollector, String label, Boolean leader ) {
		
		OutputPortInfo leaderOutputPort = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.LEADER_NAME );
		leaderOutputPort.setProtocolId( "sodep" );
		leaderOutputPort.addOperation( JolieEppUtils.ACK_OPERATIONDECLARATION );
		leaderOutputPort.addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
		if ( leader ) { leaderOutputPort.addOperation( JolieEppUtils.INITSTART_OPERATIONDECLARATION ); }
		jolieProgram.addChild( leaderOutputPort );
		
		if ( leader ){
			OutputPortInfo ledRoleOutputPort = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, "LedRole" );
			ledRoleOutputPort.setProtocolId( "sodep" );
			ledRoleOutputPort.addInterface( new InterfaceDefinition( JolieEppUtils.PARSING_CONTEXT, "AdaptActivityInterface") );
			ledRoleOutputPort.addOperation( new RequestResponseOperationDeclaration(
					  JolieEppUtils.PARSING_CONTEXT, "coord", new TypeInlineDefinition(
								JolieEppUtils.PARSING_CONTEXT, "OpType", NativeType.ANY,
								new Range(1, 1)), new TypeInlineDefinition(
								JolieEppUtils.PARSING_CONTEXT, "void", NativeType.ANY,
								new Range(1, 1)), null));
			jolieProgram.addChild( ledRoleOutputPort );
		}
		
		for (OutputPortInfo port : result.outputPorts().values()) {
			if (nameCollector.getRoles().contains(port.id())) {
				String scopeLocation = "RPH__" + port.id() + "!/"
						+ JolieEppUtils.ACTIVITY_REDIRECTION + "/" + label;
				port.setLocation(URI.create(scopeLocation));
				if (leader) {
					port.addInterface( new InterfaceDefinition(
							JolieEppUtils.PARSING_CONTEXT, "AdaptActivityInterface"));
				}
			}
			jolieProgram.addChild(port);
		}
	}

	private void writeIncludes( Writer w, ThreadProjectionResult result ) throws IOException {
		for ( String include : result.includes() ) {
			w.write("include \"" + include + ".iol\"\n");
		}
		w.write('\n');
	}

	private void writeConstants( Writer w, String thread ) throws IOException {
		w.write("constants {\n");
		w.write("\tLocation_Client = \"" + getRoleLocation(thread) + "\",\n");
		w.write("\tLocation_Folder = \"" + thread + "\",\n");
		w.write("\tROLE = \"" + thread + "\"\n");
		w.write("}\n");
	}

	/**
	 * The EPP procedure
	 * 
	 * @param aioc
	 *          the AIOC described in the IDE
	 * @throws EndpointProjectionException
	 * @throws IOException
	 */
	public void epp( AiocJ aiocJ ) throws EndpointProjectionException, IOException {
		LaunchScripts ls = new LaunchScripts();
		targetDirectory = new File(srcGenDirectory.getAbsolutePath());
		try {
			JolieEppUtils.deployAdaptationManager( targetDirectory.getAbsolutePath() );
			JolieEppUtils.deployEnvironment( targetDirectory.getAbsolutePath() );
			ls.writeMidLaunchScript(targetDirectory);
			ls.writeServiceLauncherScript(targetDirectory);
			ls.writeChoreographyLauncherScript(targetDirectory);
		} catch (Exception e) {
			throw new EndpointProjectionException( 
					"EPP exception on Adaptation Manager and Environment deployment: " + e );
		}
		if ( aiocJ.getAioc() != null ) {
			targetDirectory = new File(targetDirectory + File.separator + "epp_aioc");
			FileUtils.deleteDirectory(targetDirectory);
			targetDirectory.mkdir();

			try {
				collectLocations( aiocJ.getAioc().getPreamble().getLocDefinition() );
				projectThreads( aiocJ.getAioc() );
				ls.writeAIOCLaunchScript( aiocJ.getAioc(), targetDirectory );
			} catch (MergingException e) {
				throw new EndpointProjectionException(e);
			}
		} else if ( aiocJ.getRuleSet() != null ) {
			System.out.println( "Found rule set, projecting...");
			targetDirectory = new File(targetDirectory + File.separator + "epp_rules");
			FileUtils.deleteDirectory(targetDirectory);
			targetDirectory.mkdir();
			JolieEppUtils.deployJorbaServerFramework( targetDirectory );
			ls.writeRulesLaunchScript( targetDirectory );
			JolieEppUtils.deployRoleSupporter( targetDirectory.getParent() );
			ls.writeRoleSuppoterLaunchScript( new File( targetDirectory.getParent() ) );
			targetDirectory = new File(srcGenDirectory.getAbsolutePath()
					+ File.separator + "epp_rules" + File.separator
					+ "__adaptation_server" + File.separator + "servers" + File.separator
					+ "server" + File.separator + "rules");
			FileUtils.deleteDirectory(targetDirectory);
			targetDirectory.mkdir();
			for ( Rule rule : aiocJ.getRuleSet() ) {
				System.out.println( "Projecting rule " + aiocJ.getRuleSet().indexOf( rule ));
				NameCollector nameCollector = new NameCollector();
				
				nameCollector.collectRule( rule.getChoreography(), rule.getFunctionLocation() );
				HashSet<String> ledRoles = new HashSet<String>();
				for ( String role : nameCollector.getRoles() ) {
						ledRoles.add(role);
				}
				try {
					ScopeStructure ruleStructure = new ScopeStructure(
							JolieEppUtils.getCookie(),
							null, 
							ledRoles,
							rule.getChoreography(), null);
					projectRule( rule, ruleStructure, nameCollector.getScopes() );
					setRuleRoleLocation(nameCollector.getRoles());
					for (String role : nameCollector.getRoles()) {
						// System.out.println( "projecting rule for " + role );
						projectRuleChoreography(
								role,
								ruleStructure,
								rule,
								nameCollector);
					}
					// projects the scopes for that rule
					for ( ScopeStructure scope : nameCollector.getScopes() ) {
						projectRuleScope(
								scope.getLeader(), 
								scope, 
								scope.getChoreography(),
								true,
								nameCollector, 
								ruleStructure.getKey()
						);
						for (String ledRole : scope.getLedRoles()) {
							projectRuleScope(
									ledRole, 
									scope, 
									scope.getChoreography(), 
									false,
									nameCollector, 
									ruleStructure.getKey()
							);
						}
					}
				} catch (MergingException e) {
					throw new EndpointProjectionException(e);
				}
			}
		}
	}

	/**
	 * Reads the threads list and calls the ProjectThread on each
	 * 
	 * @param aioc
	 * @throws EndpointProjectionException
	 * @throws IOException
	 * @throws MergingException
	 */
	// private void projectThreads( Aioc aioc, NameCollector nameCollector )
	private void projectThreads(Aioc aioc) throws EndpointProjectionException,
			IOException, MergingException {
		NameCollector nameCollector = new NameCollector();
		nameCollector.collect( aioc.getChoreography(), aioc );

		String start_key = JolieEppUtils.getCookie();
		for ( String thread : nameCollector.getRoles( )) {
			projectThread( thread, aioc, nameCollector, start_key );
		}

		for (ScopeStructure scope : nameCollector.getScopes()) {
			// System.out.println( "Projecting scope " + scope.getKey() );
			projectScope( scope.getLeader(), scope, scope.getChoreography(), true, nameCollector );
			for (String ledRole : scope.getLedRoles()) {
				projectScope(ledRole, scope, scope.getChoreography(), false,
						nameCollector);
			}
		}
	}

	private void projectRule(
			Rule rule, 
			ScopeStructure ruleStructure,
			Set<ScopeStructure> scopes
			) throws IOException {
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program(
				JolieEppUtils.PARSING_CONTEXT
		);

		// THIS IS FOR COMPATIBILITY, SHALL BE REMOVED
		// onGetStateUpdate definition
		jolieProgram.addChild(
				new DefinitionNode(
						JolieEppUtils.PARSING_CONTEXT,
						"onGetStateUpdate", 
						new NullProcessStatement(	JolieEppUtils.PARSING_CONTEXT )
		));

		IfStatement ifS = new IfStatement( JolieEppUtils.PARSING_CONTEXT );

		ifS.addChild(
				new Pair<OLSyntaxNode, OLSyntaxNode>(
						WhereConditionProjector.project( rule.getWhere() ),
				new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						JolieEppUtils.toPath( "response" ),
						new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 1 ))
				));

		ifS.setElseProcess(
				new AssignStatement( 
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath( "response" ),
						new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));

		// onEvaluateConstaint
		jolieProgram.addChild(
				new DefinitionNode(
						JolieEppUtils.PARSING_CONTEXT,
						"onEvaluateConstraint", 
						ifS
		));

		// dataInit
		SequenceStatement dataInitSequence = new SequenceStatement(
				JolieEppUtils.PARSING_CONTEXT);
		// label
		// dataInitSequence.addChild( new AssignStatement(
		// JolieEppUtils.PARSING_CONTEXT,
		// JolieEppUtils.variableNameToJolieVariablePath( "rule.activityName" ),
		// new ConstantStringExpression(
		// JolieEppUtils.PARSING_CONTEXT,
		// rule.getLabel())));
		// activityDirectory
		dataInitSequence.addChild(
				new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath( "rule.activityDirectory" ),
						new ConstantStringExpression( 
								JolieEppUtils.PARSING_CONTEXT,
								ruleStructure.getKey())
		));

		RuleVarCollector rvc = new RuleVarCollector();
		rvc.collect( rule.getWhere().getWhereCondition() );
		// stateVariables
		for ( String v : rvc.getStateVarNames() ) {
			dataInitSequence.addChild(
					new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT,
							JolieEppUtils.toPath(
									"rule.stateVariables.name[ #rule.stateVariables.name ]"
							),
					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, v )
		));
		}
		// propertyVariables
		for ( String v : rvc.getPropertiesVarNames() ) {
			dataInitSequence.addChild(
					new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath(
								"rule.properties.name[ #rule.properties.name ]"
						),
						new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, v )
			));
		}
		// environmentVariables
		for ( String v : rvc.getEnvironmentVarNames() ){
			dataInitSequence.addChild(
					new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath(
								"rule.envVariables.name[ #rule.envVariables.name ]"
						),
						new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, v)
			));
		}
		// newRoles
		for ( String newRole : rule.getNewRoles() ){
			dataInitSequence.addChild(
					new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath(
								"rule.newRoles[ #rule.newRoles ]"
						),
						new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, newRole)
			));
		}
		// scope keys
		for ( ScopeStructure scope : scopes ){
			dataInitSequence.addChild(
				new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.toPath(
							"rule.subscopes.name[ #rule.subscopes.name ]"
					),
					new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT, 
							scope.getKey())));
		}

		jolieProgram.addChild(
				new DefinitionNode(
						JolieEppUtils.PARSING_CONTEXT,
						"dataInit", 
						dataInitSequence
				)
		);

		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter(
				w,
				jolieProgram);
		w.write("include \"../../../__rule/AbstractRule.iol\"\n");
		printer.run();

		// creates the folder for the activities
		File activityFolder = new File(	targetDirectory.getAbsolutePath() );
		if ( activityFolder.exists() == false ) {
			activityFolder.mkdirs();
		}
		// writes the scope
		OutputStream ostream = new FileOutputStream(
				activityFolder + File.separator	+ ruleStructure.getKey() + "Rule.ol");
		Writer fileWriter = new OutputStreamWriter(ostream);
		fileWriter.write( w.toString() );
		fileWriter.flush();
		ostream.close();

		writeEmptyProcess(
				new File(activityFolder + File.separator + ruleStructure.getKey()),
				ruleStructure.getLeader());
	}

	private void writeEmptyProcess(File folder, String leader) throws IOException {

		String process = "include \"../AbstractActivity.iol\"\n";
		process = process + "define onRun {\n";
		process = process + "nullProcess \n}\n";
		process = process + "define start{ nullProcess }";

		// creates the folder for the activities
		if (folder.exists() == false) {
			folder.mkdirs();
		}
		// writes the scope
		OutputStream ostream = new FileOutputStream(folder + File.separator
				+ "emptyProcess.ol");
		Writer fileWriter = new OutputStreamWriter(ostream);
		fileWriter.write(process);
		fileWriter.flush();
		ostream.close();
	}

	private void projectRuleChoreography(
			String thread,
			ScopeStructure ruleStructure, 
			Rule rule,
			NameCollector collector) 
					throws IOException, EndpointProjectionException,MergingException {

		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program(
				JolieEppUtils.PARSING_CONTEXT);

		ThreadProjectionResult result = ThreadProjector.projectThread(
				thread,
				rule.getChoreography(),
				collector
		);

		NameCollector nc = new NameCollector();
		nc.collect( rule.getChoreography(), null );
		String mh = embedMessageHandler(
				thread, 
				jolieProgram,
				result,
				false,
				nc,
				JolieEppUtils.RULE_KEYPLACEHOLDER
		);

		// Add the onRun procedure
		OLSyntaxNode jolieMainNode = result.jolieNode();

		addOutputInterfacesAndPortsRule(
				jolieProgram, 
				result, 
				collector,
				JolieEppUtils.RULE_KEYPLACEHOLDER, 
				false);

		// scopeLocation is local as it is redirected from the activityManager
		// String scopeLocation = getRoleLocation( thread ) + "!/" +
		// JolieEppUtils.ACTIVITY_REDIRECTION + "/" + scope.getKey();
		String scopeLocation = "local";
		addInputInterfaceAndPort(
				jolieProgram, 
				result, 
				URI.create( scopeLocation ),
				false
		);

		jolieMainNode = new DefinitionNode(
				JolieEppUtils.PARSING_CONTEXT,
					"onRun", 
					jolieMainNode
		);
		jolieProgram.addChild( jolieMainNode );
		jolieProgram.addChild(
				new DefinitionNode( 
						JolieEppUtils.PARSING_CONTEXT,
						"start", 
						new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT) )
		);

		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter(
				w,
				jolieProgram
		);
		result.addInclude( "semaphore_utils" );
		result.addInclude( "../AbstractActivity" );
		writeIncludes( w, result );
		printer.run();

		// creates the folder for the activities
		File activityFolder = new File( 
				targetDirectory.getAbsolutePath()	+ File.separator + 
				ruleStructure.getKey() + File.separator + thread
		);
		if ( activityFolder.exists() == false ) {
			activityFolder.mkdirs();
		}
		// write the scope
		OutputStream ostream = new FileOutputStream(
				activityFolder + File.separator + thread + ".ol"
		);
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( w.toString() );
		fileWriter.flush();
		ostream.close();
		// write its message handler
		if ( mh.length() > 0 ) {
			ostream = new FileOutputStream( 
					activityFolder + File.separator	+ JolieEppUtils.MESSAGEHANDLER_FILENAME
			);
			fileWriter = new OutputStreamWriter( ostream );
			fileWriter.write( mh );
			fileWriter.flush();
			ostream.close();
		}
	}

	/**
	 * Scope projection procedure
	 * 
	 * @param scope
	 * @param aioc
	 * @throws EndpointProjectionException
	 * @throws IOException
	 * @throws MergingException
	 */
	private void projectRuleScope(
			String thread, 
			ScopeStructure scope,
			Choreography choreography, 
			Boolean leader, 
			NameCollector collector,
			String ruleKey ) 
					throws EndpointProjectionException, IOException, MergingException {
		
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		
		ThreadProjectionResult result = ThreadProjector.projectThread(
				thread,
				choreography,
				collector,
				scope.getKey()
		);

		NameCollector nc = new NameCollector();

		nc.collect( choreography, null );
		if ( !nc.getRoles().contains( scope.getLeader() )){
			nc.addRole( scope.getLeader() );
		}

		nc.addRoles( scope.getLedRoles() );
		String mh = embedMessageHandler( thread, jolieProgram, result, leader,	nc,	scope.getKey() );

		// Add the onRun procedure
		OLSyntaxNode jolieMainNode = result.jolieNode();
		
		// add led port
		if ( leader ) {
			for (String role : scope.getLedRoles()) {
				if (!result.outputPorts().containsKey(role)) {
					result.addRRToOutputPort(role, "dummy");
				}
			}
		}

		// add start procedure
		if ( leader ) {
			// add adapt procedure after the start procedure
			jolieMainNode = getStarterProcedure(
					getLeaderAdaptProcedure( scope, result, jolieMainNode ),
					scope.getKey(), 
					thread,
					nc.getRoles().size(),
					true,
					"RPH__" + thread
			);
		} else {
//			result.getOutputPort( scope.getLeader() ).addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
			jolieMainNode = getLedStartProcedure(
					getLedAdaptProcedure( jolieMainNode, thread, scope ),
					thread, 
					scope.getKey(), 
					"RPH__" + scope.getLeader(), 
					true
			);
			SequenceStatement s = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);
			s.addChild(
					new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							JolieEppUtils.toPath( "csets.cookie" ),
					new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT, 
							scope.getKey())
			));
			
			s.addChild( jolieMainNode );

			// add the ack procedure
			String ackVar = JolieEppUtils.getFreshVariable();
		      s.addChild(new AssignStatement(JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( ackVar + ".sid" ),
		        new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, scope.getKey())));
		      s.addChild(new SolicitResponseOperationStatement(
		        JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.ACK_OPERATION, 
		        JolieEppUtils.LEADER_NAME, JolieEppUtils.toPath( ackVar ), null, null));
		      jolieMainNode = s;
		}
		
		addOutputInterfacesAndPortsRule( jolieProgram, result, nc, scope.getKey(), leader );
		
		// scopeLocation is local as it is redirected from the activityManager
		String scopeLocation = "local";
		addInputInterfaceAndPort( jolieProgram, result, URI.create( scopeLocation ), leader );

		if ( leader ) {
			// add onRun procedure
			// execute = true;
			// set while( !done ){ nullProcess }
			SequenceStatement onRunProc = new SequenceStatement(
					JolieEppUtils.PARSING_CONTEXT);
			onRunProc.addChild( new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "onRunSR.name" ), 
					new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, "execute" )));
			onRunProc.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"release",
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "onRunSR" ), 
					null, null ));
			onRunProc.addChild( new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "onRunSR.name" ), 
					new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, "done" )));
			onRunProc.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"acquire",
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "onRunSR" ), 
					null, null ));
			jolieProgram.addChild(new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"onRun", onRunProc));
			// add start procedure
			SequenceStatement s = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);
			// ADAPTATION SYNTAX NODE <---------------------------------------------
			s.addChild(jolieMainNode);
			// add done = true
//			
			String ackVar = JolieEppUtils.getFreshVariable();
			s.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( ackVar + ".sid" ), 
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, scope.getKey() )));
			s.addChild( new SolicitResponseOperationStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.ACK_OPERATION, JolieEppUtils.LEADER_NAME, JolieEppUtils.toPath( ackVar ), null, null 
			));
			
			s.addChild(new NotificationOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, "startActivity", "ActivityManager",
					new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT, 
							scope.getKey())
			));
			s.addChild( new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "startSR.name" ), 
					new ConstantStringExpression(	JolieEppUtils.PARSING_CONTEXT, "done" )));
			s.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"release", 
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "startSR" ), 
					null, null ));
			jolieMainNode = new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"start", s);
			jolieProgram.addChild(jolieMainNode);
		} else {
			jolieMainNode = new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"onRun", jolieMainNode);
			jolieProgram.addChild(jolieMainNode);
			jolieProgram.addChild(new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"start", new NullProcessStatement(JolieEppUtils.PARSING_CONTEXT)));
		}

		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter(w,
				jolieProgram);
		result.addInclude( "semaphore_utils" );
		result.addInclude("../AbstractActivity");
		writeIncludes(w, result);
		printer.run();

		// creates the folder for the activities
		File activityFolder = new File(targetDirectory.getAbsolutePath()
				+ File.separator + ruleKey + File.separator + thread + File.separator
				+ scope.getKey());
		if (activityFolder.exists() == false) {
			activityFolder.mkdirs();
		}
		// write the scope
		OutputStream ostream = new FileOutputStream(activityFolder + File.separator
				+ scope.getKey() + ".ol");
		Writer fileWriter = new OutputStreamWriter(ostream);
		fileWriter.write(w.toString());
		fileWriter.flush();
		ostream.close();

		// System.out.println( "Written scope " + scope.getKey() + " for role " +
		// thread );

		// write its message handler
		if (mh.length() > 0) {
			ostream = new FileOutputStream(activityFolder + File.separator
					+ JolieEppUtils.MESSAGEHANDLER_FILENAME);
			fileWriter = new OutputStreamWriter(ostream);
			fileWriter.write(mh);
			fileWriter.flush();
			ostream.close();
		}
	}

	/**
	 * Scope projection procedure
	 * 
	 * @param scope
	 * @param aioc
	 * @throws EndpointProjectionException
	 * @throws IOException
	 * @throws MergingException
	 */
	private void projectScope(String thread, ScopeStructure scope,
			Choreography choreography, Boolean leader, NameCollector collector)
			throws EndpointProjectionException, IOException, MergingException {
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program(
				JolieEppUtils.PARSING_CONTEXT);

		ThreadProjectionResult result = 
				ThreadProjector.projectThread( thread, choreography, collector, scope.getKey() );

		NameCollector nc = new NameCollector();
		nc.collect( choreography, null );

		if ( !nc.getRoles().contains( scope.getLeader() ) ) {
			nc.addRole( scope.getLeader() );
		}

		nc.addRoles( scope.getLedRoles() );
		String mh = embedMessageHandler( thread, jolieProgram, result, leader, nc, scope.getKey() );

		// Add the onRun procedure
		OLSyntaxNode jolieMainNode = result.jolieNode();

		// add led port
		if ( leader ) {
			for ( String role : scope.getLedRoles() ) {
				if ( !result.outputPorts().containsKey( role ) ) {
					result.addRRToOutputPort( role, "dummy" );
				}
			}
		}

		// ADAPTATION BRANCH ----------------------------
		// add start procedure
		if ( leader ) {
			// add adapt procedure after the start procedure
			jolieMainNode = getStarterProcedure(
					getLeaderAdaptProcedure( scope, result, jolieMainNode ),
					scope.getKey(), 
					thread,
					nc.getRoles().size(), true, getRoleLocation( thread ).toString() );
		} else {
//			result.getOutputPort( scope.getLeader() ).addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
			jolieMainNode = getLedStartProcedure(
					getLedAdaptProcedure( 
							jolieMainNode, 
							thread, 
							scope),
					thread, 
					scope.getKey(), 
					getRoleLocation( scope.getLeader() ).toString(), 
					true);

			SequenceStatement s = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);

			// csets.cookie = KEY
			// VariablePathNode csets = JolieEppUtils.variableNameToJolieVariablePath(
			// "csets.cookie" );
			// JolieEppUtils.appendSubNode( csets, "cookie" );
			s.addChild(new AssignStatement(JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.toPath("csets.cookie"),
					new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, scope
							.getKey())));

			s.addChild(jolieMainNode);

			// add the ack procedure
			String ackVar = JolieEppUtils.getFreshVariable();
			s.addChild(new AssignStatement(JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( ackVar + ".sid" ),
				new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, scope.getKey())));
			s.addChild(new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.ACK_OPERATION, 
				JolieEppUtils.LEADER_NAME, JolieEppUtils.toPath( ackVar ), null, null));
			jolieMainNode = s;
//			result.addRRToOutputPort(scope.getLeader(), "ack");
		}

		addOutputInterfacesAndPortsScope( jolieProgram, result, nc, scope.getKey(), leader );

		// scopeLocation is local as it is redirected from the activityManager
		String scopeLocation = "local";
		addInputInterfaceAndPort( jolieProgram, result, URI.create(scopeLocation), leader );

		if ( leader ) {
			// add onRun procedure
			// execute = true;
			// set while( !done ){ nullProcess }
			
			SequenceStatement onRunProc = new SequenceStatement(
					JolieEppUtils.PARSING_CONTEXT);
			onRunProc.addChild( new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "onRunSR.name" ), 
					new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, "execute" )));
			onRunProc.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"release",
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "onRunSR" ), 
					null, null ));
			onRunProc.addChild( new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "onRunSR.name" ), 
					new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, "done" )));
			onRunProc.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"acquire",
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "onRunSR" ), 
					null, null ));
			jolieProgram.addChild(new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"onRun", onRunProc));
			// add start procedure
			SequenceStatement s = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);
			// ADAPTATION SYNTAX NODE <---------------------------------------------
			s.addChild(jolieMainNode);

			String ackVar = JolieEppUtils.getFreshVariable();
			s.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( ackVar + ".sid" ), 
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, scope.getKey() )));
			s.addChild(new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.ACK_OPERATION, JolieEppUtils.LEADER_NAME,
					JolieEppUtils.toPath( ackVar ), null, null
			));

			s.addChild(new NotificationOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, "startActivity", "ActivityManager",
					new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT, 
							scope.getKey())
			));
			s.addChild( new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "startSR.name" ), 
					new ConstantStringExpression(	JolieEppUtils.PARSING_CONTEXT, "done" )));
			s.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"release", 
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "startSR" ), 
					null, null ));
			jolieMainNode = new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"start", s);
			jolieProgram.addChild(jolieMainNode);
		} else {
			jolieMainNode = new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"onRun", jolieMainNode);
			jolieProgram.addChild(jolieMainNode);
			jolieProgram.addChild(new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
					"start", new NullProcessStatement(JolieEppUtils.PARSING_CONTEXT)));
		}

		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter(w,
				jolieProgram);
		result.addInclude( "semaphore_utils" );
		result.addInclude("../AbstractActivity");
		writeIncludes(w, result);
		printer.run();

		// creates the folder for the activities
		File activityFolder = new File(targetDirectory.getAbsolutePath()
				+ File.separator + thread + File.separator + "__activity_manager"
				+ File.separator + "activities" + File.separator + scope.getKey());
		if (activityFolder.exists() == false) {
			activityFolder.mkdirs();
		}
		// write the scope
		OutputStream ostream = new FileOutputStream(activityFolder + File.separator
				+ scope.getKey() + ".ol");
		Writer fileWriter = new OutputStreamWriter(ostream);
		fileWriter.write(w.toString());
		fileWriter.flush();
		ostream.close();

		// System.out.println( "Written scope " + scope.getKey() + " for role " +
		// thread );

		// write its message handler
		if (mh.length() > 0) {
			ostream = new FileOutputStream(activityFolder + File.separator
					+ JolieEppUtils.MESSAGEHANDLER_FILENAME);
			fileWriter = new OutputStreamWriter(ostream);
			fileWriter.write(mh);
			fileWriter.flush();
			ostream.close();
		}
	}

	private OLSyntaxNode getStarterProcedure(
			OLSyntaxNode jolieNode,
			String start_key, 
			String role,
			int rolesNumber, boolean isScopeOrRule, String leaderAddres ) {
		SequenceStatement seq = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);
		String defaultCoordinator = JolieEppUtils.MESSAGEHANDLER_NAME;
		String sStruct = JolieEppUtils.getFreshVariable();
		seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.toPath( sStruct + ".sid" ),
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, start_key ) ) );
		seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.toPath( sStruct + ".rolesNum" ),
				new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, rolesNumber ) ) );
		if ( isScopeOrRule ){
			seq.addChild( new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.toPath( sStruct + ".hasAck" ),
					new ConstantBoolExpression( JolieEppUtils.PARSING_CONTEXT, true ) ) );
			defaultCoordinator = JolieEppUtils.LEADER_NAME;
		}
		if ( isScopeOrRule ){
			seq.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( "Leader.location" ), 
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, leaderAddres ) ) );
		}
		seq.addChild( new NotificationOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.INITSTART_OPERATION,
				defaultCoordinator, 
				JolieEppUtils.toPath( sStruct )
				)
		);
		seq.addChild( new UndefStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.toPath( sStruct + ".rolesNum" )
				) ); 
		if( isScopeOrRule ) {
			seq.addChild( new UndefStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.toPath( sStruct + ".hasAck" )
				) ); 
			seq.addChild( new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "startSR.name" ) , 
					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, "execute")));
			seq.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"acquire", 
					"SemaphoreUtils", 
					JolieEppUtils.toPath( "startSR" ), 
					null, null ));
		}
		
		seq.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.START_OPERATION,
				defaultCoordinator, 
				JolieEppUtils.toPath( sStruct ), 
				null, null)
		);
		if ( jolieNode != null ) {
			seq.addChild( jolieNode );
		}
		return seq;
	}

	private OLSyntaxNode getLedStartProcedure(OLSyntaxNode jolieNode,
			String thread, String start_key, String leaderNameOrAddress, boolean isRuleOrScope ) {
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		String defaultCoordinator = leaderNameOrAddress;
		VariablePathNode sStructVarPath, sStructVarPathRole;
		String sStruct = JolieEppUtils.getFreshVariable();
		sStructVarPath = JolieEppUtils.toPath( sStruct );
		sStructVarPathRole = JolieEppUtils.toPath( sStruct );
		JolieEppUtils.appendSubNode(sStructVarPathRole, "sid");
		seq.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT,
				sStructVarPathRole, new ConstantStringExpression(
						JolieEppUtils.PARSING_CONTEXT, start_key ) ) );
		if ( isRuleOrScope ){
			seq.addChild( new AssignStatement(JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.toPath( "Leader.location" ), new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT, leaderNameOrAddress)));			
			defaultCoordinator = JolieEppUtils.LEADER_NAME;
		}
		seq.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.START_OPERATION, defaultCoordinator,
				sStructVarPath, null, null ) );
		seq.addChild( jolieNode );
		return seq;
	}

	private OLSyntaxNode getSetPropertiesProcedure(AssignmentSet assignmentSet) {
		SequenceStatement s = new SequenceStatement(JolieEppUtils.PARSING_CONTEXT);
		// aReq.properties.dummy.value = 1;
		VariablePathNode v = JolieEppUtils
				.toPath("aReq.properties."
						+ assignmentSet.getAssignment().getVariable() + ".value");
		s.addChild(new AssignStatement(JolieEppUtils.PARSING_CONTEXT, v,
				ExpressionProjector.project(assignmentSet.getAssignment()
						.getExpression())));
		if ( assignmentSet.getContinuation() != null ) {
			s.addChild(getSetPropertiesProcedure( assignmentSet.getContinuation() ) );
		}
		return s;
	}

	private OLSyntaxNode getLeaderAdaptProcedure(
			ScopeStructure scope,
			ThreadProjectionResult result, 
			OLSyntaxNode jolieMainProgram ) {
		SequenceStatement s = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		if ( scope.getAssignmentSet() != null ) {
			s.addChild( getSetPropertiesProcedure( scope.getAssignmentSet() ) );
		}

		// aReq.client = leader_port
		s.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( "aReq.client" ),
				new ConstantStringExpression(
						JolieEppUtils.PARSING_CONTEXT,
						getRoleLocation( scope.getLeader() ).toString() )
				));

		s.addChild(
				new AssignStatement( 
					JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "aReq.ports." + scope.getLeader() + ".address"),
					new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT,
							getRoleLocation( scope.getLeader() ).toString() )
					));

		for ( String role : scope.getLedRoles() ) {			
			s.addChild(
					new AssignStatement( 
						JolieEppUtils.PARSING_CONTEXT, 
						JolieEppUtils.toPath( "aReq.ports." + role + ".address"),
						new ConstantStringExpression(
							JolieEppUtils.PARSING_CONTEXT, 
							getRoleLocation( role ).toString() )
						));
		}

		// checkForUpdate@AdaptationManager( aReq )( aRes );
		s.addChild(
				new SolicitResponseOperationStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						"checkForUpdate", 
						"AdaptationManager",
						JolieEppUtils.toPath( "aReq" ),
						JolieEppUtils.toPath( "aRes" ),
						null)
				);

		// ASSEMBLING THE "THEN" BRANCH
		SequenceStatement ifBranch = new SequenceStatement(	JolieEppUtils.PARSING_CONTEXT );
		
		// defines the adaptation cookie
//		ifBranch.addChild(
//				new AssignStatement(
//					JolieEppUtils.PARSING_CONTEXT, 
//					JolieEppUtils.variableNameToJolieVariablePath( "eReq.cookie" ),
//					new ConstantStringExpression( 
//							JolieEppUtils.PARSING_CONTEXT, 
//							scope.getKey())
//					));

		// LEADER code embedding procedure ----------------------------------
		// for( c = 0, c < #aRes.LEADER.code, c++ ){
		//		embed_scope@ActivityManager( aRes.LEADER.code[ c ] )()
		// };
		ifBranch.addChild(
				new ForStatement( 
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
										"#aRes.roles." + scope.getLeader() + ".code"), 
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
										"aRes.roles." + scope.getLeader()	+ ".code[ c ]"), 
										null, null)
						)
		);
		
		String adaptRequestVariable = JolieEppUtils.getFreshVariable();
		
		ifBranch.addChild(
				new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath( adaptRequestVariable + ".sid" ),
						new AssignStatement( 
							JolieEppUtils.PARSING_CONTEXT, 
							JolieEppUtils.toPath( "adaptRequest.main_key" ),
							JolieEppUtils.toPath( "aRes.main_key" ) 
		)));
		
//		ifBranch.addChild( new AssignStatement( 
//			JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( adaptRequestVariable + ".rolesNum" ), 
//			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 1)));
		
		ifBranch.addChild( 
			new ForEachSubNodeStatement( 
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( "r" ), 
				JolieEppUtils.toPath( "aRes.roles" ), 
				new PostIncrementStatement( JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( adaptRequestVariable + ".rolesNum" )) 
		));
		
		ifBranch.addChild( new AssignStatement( 
			JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( adaptRequestVariable + ".hasAck" ), 
			new ConstantBoolExpression( JolieEppUtils.PARSING_CONTEXT, true)));
		
		ifBranch.addChild( new NotificationOperationStatement( 
			JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.INITSTART_OPERATION,JolieEppUtils.LEADER_NAME, 
			JolieEppUtils.toPath( adaptRequestVariable )
		));
		
		// INIT START COORDINATION FOR ADAPTED SCOPE
		ifBranch.addChild( new AssignStatement( 
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( adaptRequestVariable + ".sid" ), 
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, scope.getKey() + "_adapt" )));
		ifBranch.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( adaptRequestVariable + ".hasAck" )));
		ifBranch.addChild( new NotificationOperationStatement( 
				JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.INITSTART_OPERATION,JolieEppUtils.LEADER_NAME, 
				JolieEppUtils.toPath( adaptRequestVariable )
			));
		ifBranch.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( adaptRequestVariable + ".rolesNum" )));
		// ------
		
	    // REMOVES scope leader's CODE FROM aRes
		ifBranch.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( "aRes.roles." + scope.getLeader() )));
		
		
		IfStatement ifForeachStatement = new IfStatement( JolieEppUtils.PARSING_CONTEXT ); 
		SequenceStatement tmpSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		
		tmpSequence.addChild( 
			new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( "adaptRequest.cookie" ), JolieEppUtils.toPath( "aRes.roles.( roleName ).cookie" ) ) );
		
		tmpSequence.addChild( 
				new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "LedRole.location" ), JolieEppUtils.toPath( "aRes.roles.( roleName ).location" ) ) );
		
		String coordVar = JolieEppUtils.getFreshOperation();
		
		tmpSequence.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
			JolieEppUtils.toPath( coordVar + ".msgID" ), JolieEppUtils.toPath( "adaptRequest.cookie" ) ) );
		
		
		tmpSequence.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( coordVar + ".content.sid" ),
				new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, scope.getKey() + "_adapt" ) ) );
			
			
		tmpSequence.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( coordVar + ".content.leader" ), JolieEppUtils.toPath( "Leader.location" ) ) );
		
		tmpSequence.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, 
				"coord", "LedRole", 
				JolieEppUtils.toPath( coordVar ), null, null ));
				
		ifForeachStatement.addChild( new Pair<OLSyntaxNode, OLSyntaxNode>(
			new IsTypeExpressionNode(
			  JolieEppUtils.PARSING_CONTEXT,
		      CheckType.DEFINED, 
			JolieEppUtils.toPath( "aRes.roles.( roleName ).cookie" ) ),
			tmpSequence
		));
		
		tmpSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		
		tmpSequence.addChild( 
				new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
					JolieEppUtils.toPath( "adaptRequest.cookie" ), 
					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, scope.getKey() ) ) );
		
		SumExpressionNode sumExpressionNode = new SumExpressionNode( JolieEppUtils.PARSING_CONTEXT );
		sumExpressionNode.add( JolieEppUtils.toPath( "aRes.roles.( roleName ).location" ) );
		sumExpressionNode.add( new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, 
				"!/" + JolieEppUtils.ACTIVITY_REDIRECTION + "/" + scope.getKey() ) );		
		
		tmpSequence.addChild( 
			new AssignStatement( JolieEppUtils.PARSING_CONTEXT, 
			JolieEppUtils.toPath( "LedRole.location" ),
			sumExpressionNode
		));
		
		ifForeachStatement.setElseProcess( tmpSequence );
		
		SequenceStatement foreachSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		foreachSequence.addChild( ifForeachStatement );
		foreachSequence.addChild( new DeepCopyStatement( JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.toPath( "adaptRequest.code" ), JolieEppUtils.toPath( "aRes.roles.( roleName ).code" )));
		foreachSequence.addChild( new SolicitResponseOperationStatement(JolieEppUtils.PARSING_CONTEXT, 
				"adapt", "LedRole", JolieEppUtils.toPath( "adaptRequest" ), null, null) );
		foreachSequence.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( "adaptRequest.code" )));
		
		ifBranch.addChild( new ForEachSubNodeStatement( 
			JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.toPath( "roleName" ), 
			JolieEppUtils.toPath( "aRes.roles"), foreachSequence 
		));
		
		ifBranch.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.START_OPERATION,
				JolieEppUtils.LEADER_NAME, 
				JolieEppUtils.toPath( adaptRequestVariable ), // <-- contains scope.key() + "_adapt"
				null, null
		));
		
		ifBranch.addChild(
				new SolicitResponseOperationStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						"run", 
						"ActivityManager", 
						JolieEppUtils.toPath( "aRes.main_key" ), 
						null, null)
		);

		IfStatement ifStatament = new IfStatement(JolieEppUtils.PARSING_CONTEXT);

		// CHECK IF THE RESPONSE aRES IS DEFINED
		ifStatament.addChild(
				new Pair<OLSyntaxNode, OLSyntaxNode>(
						new IsTypeExpressionNode(
								JolieEppUtils.PARSING_CONTEXT,
								CheckType.DEFINED, 
								JolieEppUtils.toPath( "aRes" )), 
								ifBranch)
		);

		// ASSEMBLING THE "ELSE" BRANCH
		SequenceStatement elseBranch = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		elseBranch.addChild(
				new AssignStatement( 
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath( "eReq.cookie" ), 
						new ConstantStringExpression( 
								JolieEppUtils.PARSING_CONTEXT, 
								scope.getKey())
						)
		);
		
		for ( String ledRole : scope.getLedRoles() ) {
			elseBranch.addChild(
					new NotificationOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"noAdapt", 
					ledRole, 
					JolieEppUtils.toPath( "eReq" ))
			);
		}
		
		if ( jolieMainProgram == null ) {
			jolieMainProgram = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		}
		elseBranch.addChild( jolieMainProgram );
		ifStatament.setElseProcess( elseBranch );

		s.addChild( ifStatament );
		return s;
	}

	private OLSyntaxNode getLedAdaptProcedure(OLSyntaxNode jolieMainProgram, String thread, ScopeStructure scope) {
		SequenceStatement adaptSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );

		// adapt sequence
		adaptSequence
			.addChild( 
					new ForStatement(
					JolieEppUtils.PARSING_CONTEXT,
					// c = 0
					new AssignStatement( 
						JolieEppUtils.PARSING_CONTEXT, 
						JolieEppUtils.toPath( "c" ),
						new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
					),
					// c < #eReq.code
					new CompareConditionNode(
							JolieEppUtils.PARSING_CONTEXT,
							JolieEppUtils.toPath( "c" ),
							JolieEppUtils.toPath( "#eReq.code" ),
							Scanner.TokenType.LANGLE
					), 
					// c++
					new PostIncrementStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							JolieEppUtils.toPath( "c" )
					),
					// for body
					new SolicitResponseOperationStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							"embed_scope",
							"ActivityManager", 
							JolieEppUtils.toPath( "eReq.code[ c ]" ), 
							null,	null)
					)
		);

		NDChoiceStatement choice = new NDChoiceStatement(	JolieEppUtils.PARSING_CONTEXT );
		
		SequenceStatement adaptChoice = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		String adaptRequestVariable = JolieEppUtils.getFreshVariable();
		adaptChoice.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.toPath( adaptRequestVariable + ".sid" ), 
				new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, scope.getKey()  + "_adapt" )
		));
		adaptChoice.addChild(new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT, 
				JolieEppUtils.START_OPERATION,
				JolieEppUtils.LEADER_NAME, 
				JolieEppUtils.toPath( adaptRequestVariable ), 
				null, null
		));
		adaptChoice.addChild(
			new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					"run", 
					"ActivityManager",
					JolieEppUtils.toPath( "eReq.main_key" ), 
					null,	null)	
		);
		
		choice.addChild( 
				new Pair<OLSyntaxNode, OLSyntaxNode>(
						new RequestResponseOperationStatement(
								JolieEppUtils.PARSING_CONTEXT,
								"adapt", 
								JolieEppUtils.toPath( "eReq" ),
								null, 
								adaptSequence ), 
						adaptChoice)
		);

		if (jolieMainProgram == null) {
			jolieMainProgram = new NullProcessStatement(JolieEppUtils.PARSING_CONTEXT);
		}

		choice.addChild(
				new Pair<OLSyntaxNode, OLSyntaxNode>(
				new OneWayOperationStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						"noAdapt",
						null), 
				jolieMainProgram)
		);

		return choice;
	}

	/**
	 * Thread projection procedure
	 * 
	 * @param thread
	 * @param aioc
	 * @throws EndpointProjectionException
	 * @throws IOException
	 * @throws MergingException
	 */
	private void projectThread( String thread, Aioc aioc, NameCollector collector, String start_key ) 
			throws EndpointProjectionException, IOException, MergingException {
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		jolieProgram.addChild( new ExecutionInfo( JolieEppUtils.PARSING_CONTEXT, ExecutionMode.SINGLE ) );

		ThreadProjectionResult result = ThreadProjector.projectThread( thread, aioc.getChoreography(), collector );

		String starter = aioc.getPreamble().getStarter();

		if ( starter.equals( thread ) ) {
			result.setJolieNode( getStarterProcedure( result.jolieNode(), start_key, thread, collector.getRoles().size(), false, null ) );
		} else {
			result.getOutputPort( starter ).addOperation( JolieEppUtils.START_OPERATIONDECLARATION );
			result.setJolieNode( 
				getLedStartProcedure(result.jolieNode(), thread, start_key, starter, false)
			);
		}

		// creates the folder for the role/thread and sets in JFW
		File roleFolder = new File(targetDirectory.getAbsolutePath()
				+ File.separator + thread);
		if (roleFolder.exists() == false) {
			roleFolder.mkdirs();
			JolieEppUtils.deployJorbaFramework( targetDirectory.getAbsolutePath(), roleFolder );
		}

		String mh = embedMessageHandler(thread, jolieProgram, result,
				starter.equals(thread), collector, null);
		if (mh.length() > 0) {
			OutputStream ostream = new FileOutputStream(
					targetDirectory.getAbsolutePath() + "/" + thread + "/"
							+ File.separator + JolieEppUtils.MESSAGEHANDLER_FILENAME);
			Writer fileWriter = new OutputStreamWriter(ostream);
			fileWriter.write(mh);
			fileWriter.flush();
			ostream.close();
		}

		addOutputInterfacesAndPorts(aioc, jolieProgram, result, collector);

		// Add the main procedure
		OLSyntaxNode jolieMainNode = result.jolieNode();
		jolieMainNode = new DefinitionNode(JolieEppUtils.PARSING_CONTEXT,
				"thread_main", jolieMainNode);
		jolieProgram.addChild(jolieMainNode);

		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter(w,
				jolieProgram);
		// result.addInclude("./AbstractClient");
		writeIncludes(w, result);
		writeConstants(w, thread);
		printer.run();

		OutputStream ostream = new FileOutputStream(
				targetDirectory.getAbsolutePath() + "/" + thread + "/" + File.separator
						+ thread + ".ol");
		Writer fileWriter = new OutputStreamWriter(ostream);
		fileWriter.write(w.toString());
		fileWriter.flush();
		ostream.close();

	}

}
