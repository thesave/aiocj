/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
 *   Copyright (C) 2013-2014 by Saverio Giallorenzo <sgiallor@cs.unibo.it> *
 *   Copyright (C) 2013-2014 by Ivan Lanese <lanese@cs.unibo.it>           *
 *   Copyright (C) 2013-2014 by Jacopo Mauro <jmauro@cs.unibo.it>          *
 *   Copyright (C) 2017-2018 by Arnaldo Cesco <arnaldo.cesco@gmail.com>    *
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
import jolie.lang.NativeType;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.ParallelStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.TypeCastExpressionNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.WhileStatement;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.util.Pair;

import org.aioc.Choreography;
import org.aioc.IfThenElse;
import org.aioc.Interaction;
import org.aioc.LocalAskCommand;
import org.aioc.LocalAssignmentCommand;
import org.aioc.LocalShowCommand;
import org.aioc.NestedChoreography;
import org.aioc.Scope;
import org.aioc.SeqBlock;
import org.aioc.Skip;
import org.aioc.While;
import org.aioc.util.AiocSwitch;
import org.epp.EndpointProjectionException;
import org.epp.impl.merging.MergingException;


public class StatelessThreadProjector extends AiocSwitch<ThreadProjectionResult> {

	private final String thread;
	private Exception errorException = null;
	private final NameCollector collector;
//	private boolean adaptation;
	private StatelessThreadProjector(String thread, NameCollector collector ) {
		this.thread = thread;
		this.collector = collector;
		//System.out.println("Scope number:" + collector.getScopes().size());
	}

	/**
	 * The thread projection method
	 * 
	 * @param thread
	 *            - a thread in the choreography
	 * @param choreography
	 *            - the choreography
	 * @return
	 * @throws EndpointProjectionException
	 * @throws MergingException
	 */
	public static ThreadProjectionResult projectThread( 
	String thread,
	Choreography choreography, 
	NameCollector collector
	) throws EndpointProjectionException, MergingException{
		return projectThread(thread, choreography, collector, JolieEppUtils.MAIN_SCOPE);
	}
	
	public static ThreadProjectionResult projectThread(
			String thread,
			Choreography choreography, 
			NameCollector collector,
			String scopeKey )
					throws 
					EndpointProjectionException,
					MergingException 
	{	
		StatelessThreadProjector projector = new StatelessThreadProjector(thread, collector);
		ThreadProjectionResult ret;
		if( choreography != null ){
			ret = projector.doSwitch( choreography );
		} else {
			ret = projector.caseChoreography( choreography );
		}

		if (projector.errorException != null) {
			throw new EndpointProjectionException(projector.errorException);
		}
		
		//add OutputPorts towards functions 
		ret.addOutputPorts( collector.getRoleOutputPorts( thread, scopeKey ) );
		
		return ret;
	}
	
	public ThreadProjectionResult caseChoreography( Choreography n ){
		ThreadProjectionResult result = new ThreadProjectionResult();

		if( n != null ){
		ThreadProjectionResult seqBlockResult = doSwitch( n.getSeqBlock() );
		
		if( seqBlockResult.jolieNode() != null ){
			result = seqBlockResult;
		}
		
		if( n.getPar() != null ){
			NameCollector nextNC = new NameCollector();
			nextNC.collect( n.getPar(), null);
			if( nextNC.getRoles().contains( thread ) ){
				ThreadProjectionResult nextResult = doSwitch( n.getPar() );
				result.mergeNamesOnly( nextResult );
				if(	seqBlockResult.jolieNode() != null ){
					ParallelStatement p = new ParallelStatement( JolieEppUtils.PARSING_CONTEXT );
					p.addChild( new jolie.lang.parse.ast.Scope(JolieEppUtils.PARSING_CONTEXT, 
							null, result.jolieNode() ));
					p.addChild( new jolie.lang.parse.ast.Scope( JolieEppUtils.PARSING_CONTEXT,
							null, nextResult.jolieNode() ));
					result.setJolieNode( p );
				} else {
				result = nextResult;
					}
				}
			}
		} else { 
			result.setJolieNode( new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT ) );
		}
		return result;
	}
	
	public ThreadProjectionResult caseSeqBlock( SeqBlock n ){
		ThreadProjectionResult result = new ThreadProjectionResult();
		ThreadProjectionResult seqBlockResult = doSwitch( n.getEvent() );
		
		if( seqBlockResult.jolieNode() != null ){
			result = seqBlockResult;
		}
		
		if( n.getNext() != null ){
			ThreadProjectionResult nextResult = doSwitch( n.getNext() );
			if( nextResult.jolieNode() != null ){
				if( seqBlockResult.jolieNode() != null ){
					SequenceStatement s = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
					s.addChild( seqBlockResult.jolieNode() );
					result.mergeNamesOnly( nextResult );
					s.addChild( nextResult.jolieNode() );
					result.setJolieNode( s );
				} else {
					result = nextResult;
				}
			}
		}
		return result;
	}
	
	public ThreadProjectionResult caseSkip( Skip n ) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		result.setJolieNode( new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT ));
		return result;
	}

	public ThreadProjectionResult caseInteraction( Interaction n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		Boolean participates = false;
		String sid = collector.getInteractionSID( n );
		// if the projected thread is a SENDER
		if ( n.getSender().equals( thread ) ) {
			participates = true;
			VariablePathNode sStructVarPath, sStructVarPathRole, sStructVarPathContent, outVarPath, roleVarPath;
			String sStruct = JolieEppUtils.getFreshVariable();
			sStructVarPath = JolieEppUtils.toPath( sStruct );
			sStructVarPathRole = JolieEppUtils.toPath( sStruct );
			sStructVarPathContent = JolieEppUtils.toPath( sStruct );
			
			String varName = JolieEppUtils.getSimpleAiocVariable( n.getSenderExpression() );
			if ( varName != null ) {
				// It's a simple variable
				outVarPath = JolieEppUtils.toPath( varName );
				roleVarPath = JolieEppUtils.toPath( varName );
				JolieEppUtils.appendSubNode( roleVarPath, "msgID" );
			} else {
				// It's an expression
				outVarPath = JolieEppUtils.EXPRESSION_VARPATH;
				roleVarPath = JolieEppUtils.EXPRESSION_TID_VARPATH;
				if ( n.getSenderExpression() != null ) {
					VarCollector vc = new VarCollector();
					vc.collect( n.getSenderExpression() );
					seq.addChild( new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						outVarPath,
						ExpressionProjector.project( n.getSenderExpression() )
					));
				}
			}
	
			JolieEppUtils.appendSubNode( sStructVarPathContent, JolieEppUtils.CONTENT_VARNAME );
			
			seq.addChild( 
					new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					sStructVarPathContent, 
					outVarPath
			));
			
			JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
			
			seq.addChild( new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT,
					sStructVarPathRole, 
//					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getSender() )
					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, sid )
			));
	
			seq.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT,
					n.getOperation(),
					getOutputPortNameForOutput( n.getReceiver() ),
					sStructVarPath, null, null
				));
			
			result.addRRToOutputPort( getOutputPortNameForOutput( n.getReceiver() ), n.getOperation() );
			
			// if the projected thread is a RECEIVER
		} else if ( n.getReceiver().equals( thread ) ) {
			participates = true;			
			result.uncorrelatedInputOperations().add( n.getOperation() );
						
			VariablePathNode sStructVarPath, sStructVarPathRole, sStructVarPathContent;
			String sStruct = JolieEppUtils.getFreshVariable();
			sStructVarPath = JolieEppUtils.toPath( sStruct );
			sStructVarPathRole = JolieEppUtils.toPath( sStruct );
			sStructVarPathContent = JolieEppUtils.toPath( sStruct );
			
			JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
	
			seq.addChild( new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT,
					sStructVarPathRole, 
//					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getSender() )
					new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, sid )
			));
	
			seq.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.GET_PREFIX + n.getOperation(),
					JolieEppUtils.MESSAGEHANDLER_NAME,
					sStructVarPath, JolieEppUtils.toPath( sStruct ), null
			));
			
			JolieEppUtils.appendSubNode( sStructVarPathContent, JolieEppUtils.CONTENT_VARNAME );
			
			// if the receiver variable is null
			if( n.getReceiverVariable() != null ){
				seq.addChild( new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.toPath( n.getReceiverVariable() ),
						sStructVarPathContent
					));
			}
		}			
		if( participates ){
			result.setJolieNode( seq );			
		}
		return result;
	}

	public ThreadProjectionResult caseScope(Scope n) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement(
				JolieEppUtils.PARSING_CONTEXT);
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null);
		HashSet< String > additionalRoles = new HashSet<String>();
		if( n.getRoles() != null ){
			for( String role : n.getRoles().getRoles() ){
				additionalRoles.add( role );
			}			
		}
		if( thread.equals( n.getThread() ) || 
				nc.getRoles().contains(thread) ||  
				additionalRoles.contains( thread )
				) {
			seq.addChild(
					new SolicitResponseOperationStatement(
							JolieEppUtils.PARSING_CONTEXT,
							"run",
							"ActivityManager",
							new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getKey() ),
							null, null
							));			
			result.setJolieNode(seq);
		}
		return result;
	}
	
	public ThreadProjectionResult caseNestedChoreography( NestedChoreography n ){
		ThreadProjectionResult result = new ThreadProjectionResult();
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null );
		if( nc.getRoles().contains( thread )){
			result = doSwitch( n.getChoreography() );
			result.setJolieNode( new jolie.lang.parse.ast.Scope(
					JolieEppUtils.PARSING_CONTEXT,
					null, 
					result.jolieNode()));
		}
		return result;
	}

	public ThreadProjectionResult caseIfThenElse(IfThenElse n) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		ThreadProjectionResult resThen = null, resElse = null;
		NameCollector nameCollector = new NameCollector();
		
		Boolean hasThen = false;
		Boolean hasElse = false;
		
		String leader = n.getThread();
		nameCollector.collect( n.getThen(), null );
		
		// obtains the THEN branch only for roles involved in the
		// sub-choreography
		if( nameCollector.getRoles().contains( thread ) ){
			resThen = doSwitch( n.getThen() );
			result.mergeNamesOnly( resThen );
			hasThen = true;
		}
		
		if ( n.getElse() != null ) {
			NameCollector enc = new NameCollector();
			// nameCollector collects the whole if (then and else branches)
			nameCollector.collect( n.getElse(), null );
			enc.collect( n.getElse(), null );
			if( enc.getRoles().contains( thread ) ){
				resElse = doSwitch( n.getElse() );
				result.mergeNamesOnly( resElse );
				hasElse = true;
			}
		}
		
		// create a unique variable and assign the evaluation of condition
		// its is also used as input/output operation for synchronisation
		// It takes the same name as the key of the if block
//		String bVar = "_" + n.getKey().toString().replace("-", "");
		String bVar = JolieEppUtils.getFreshVariable();
//		String ifOp = JolieEppUtils.getOperationFromUUID( n.getKey() );
//		String ifOp = JolieEppUtils.getFreshOperation();
		String ifOp = collector.getIfOperation( n );
		VariablePathNode bVarPath = JolieEppUtils.toPath( bVar );
		
		// IF IT IS THE LEADER
		if ( leader.equals( thread ) ) {
			
			SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			VarCollector vc = new VarCollector();
			vc.collect( n.getCondition() );

			
			seq.addChild(
					new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							bVarPath, 
							ConditionProjector.project( n.getCondition() ))
					);
			// adds the operation to the outputPort of each led role
			// and sends the evaluation to all led roles
			for( String role : nameCollector.getRoles() ){
				if ( !role.equals(leader ) ){
					result.addRRToOutputPort( getOutputPortNameForOutput( role ), ifOp );
					
					String sStruct = JolieEppUtils.getFreshVariable();
					VariablePathNode sStructVarPath = JolieEppUtils.toPath( sStruct );
					VariablePathNode sStructVarPathRole = JolieEppUtils.toPath( sStruct );
					JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
					VariablePathNode sStructVarPathContent = JolieEppUtils.toPath( sStruct );
					JolieEppUtils.appendSubNode( sStructVarPathContent, JolieEppUtils.CONTENT_VARNAME );
					
					seq.addChild( 
							new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							sStructVarPathRole, 
//							new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, leader)
							new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getKey() )
					));
					seq.addChild( 
								new AssignStatement(
								JolieEppUtils.PARSING_CONTEXT, 
								sStructVarPathContent, 
								bVarPath
						));
					seq.addChild( new SolicitResponseOperationStatement(
									JolieEppUtils.PARSING_CONTEXT,
									ifOp,
									role,
									sStructVarPath, null, null
							));
				}
			}
					
			// THE IF STATEMENT FOR THE LEADER
			if( hasThen || hasElse ){
				IfStatement ifStatement = new IfStatement(
						JolieEppUtils.PARSING_CONTEXT );
				if( hasThen ){
					ifStatement.addChild(
							new Pair< OLSyntaxNode, OLSyntaxNode>( 
									bVarPath, resThen.jolieNode() ) );
					} else if ( hasElse ) {
						ifStatement.addChild(
								new Pair<OLSyntaxNode, OLSyntaxNode>( 
										bVarPath, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )));						
					}
				// if the ELSE branch is not null sets the THEN branch to NullProcess
				// and adds the ELSE procedure
				if( hasElse ) {
					ifStatement.setElseProcess( resElse.jolieNode() );
					}
				seq.addChild( ifStatement );
				}
			
			result.setJolieNode(seq);
		}
		
		// FOR LED ROLES
		else if ( nameCollector.getRoles().contains( thread ) ){
			SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			result.uncorrelatedInputOperations().add( ifOp );
			
			// receive the evaluation of variable
			String sStruct = JolieEppUtils.getFreshVariable();
			VariablePathNode sStructVarPath = JolieEppUtils.toPath( sStruct );
			VariablePathNode sStructVarPathRole = JolieEppUtils.toPath( sStruct );
			JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
				
				seq.addChild( 
						new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						sStructVarPathRole, 
						new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getKey() )
//						new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, leader)
				));
				seq.addChild( new SolicitResponseOperationStatement(
								JolieEppUtils.PARSING_CONTEXT,
								JolieEppUtils.GET_PREFIX + ifOp,
								JolieEppUtils.MESSAGEHANDLER_NAME,
								sStructVarPath, sStructVarPath, null
						));
				
			VariablePathNode sStructVarPathContent = JolieEppUtils.toPath( sStruct );
			JolieEppUtils.appendSubNode( sStructVarPathContent, JolieEppUtils.CONTENT_VARNAME );
			
			IfStatement ifStatement = new IfStatement(
						JolieEppUtils.PARSING_CONTEXT );
			if( hasThen ){
					ifStatement.addChild(new Pair< OLSyntaxNode, OLSyntaxNode>( 
							sStructVarPathContent, resThen.jolieNode() ) );					
			} else if( hasElse ){
				ifStatement.addChild(new Pair< OLSyntaxNode, OLSyntaxNode>( 
						sStructVarPathContent, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )));
				}
			if( hasElse ){
				ifStatement.setElseProcess( resElse.jolieNode() );
			}
			
			seq.addChild( ifStatement );
			
			result.setJolieNode(seq);
		}
		
		return result;
	}
	
	public ThreadProjectionResult caseWhile(While n) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		ThreadProjectionResult choreography = null;
		NameCollector nameCollector = new NameCollector();
		
		String leader = n.getThread();
		choreography = doSwitch( n.getChoreography() );
		nameCollector.collect( n.getChoreography(), null );
		result.mergeNamesOnly( choreography );
		
		// create a unique variable and assign the evaluation of condition
		// its is also used as input/output operation for synchronisation
		// It takes the same name as the key of the if block
//		String bVar = "_" + n.getKey().toString().replace("-", "");
		String bVar = JolieEppUtils.getFreshVariable();
//		String whileOp = JolieEppUtils.getOperationFromUUID( n.getKey() );
		String whileOp = collector.getWhileOperation( n );
		VariablePathNode bVarPath = JolieEppUtils.toPath( bVar );

		if ( leader.equals( thread ) ) {
			
			SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			VarCollector vc = new VarCollector();
			vc.collect( n.getCondition() );
			
			seq.addChild(
					new AssignStatement(JolieEppUtils.PARSING_CONTEXT, bVarPath, ConditionProjector.project( n.getCondition() ))
					);
			// adds the operation to the outputPort of each led role
			// and send the evaluation to all led roles
			SequenceStatement notificationSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			for( String role : nameCollector.getRoles() ){
				if ( !role.equals( leader ) ){
					result.addRRToOutputPort( getOutputPortNameForOutput( role ), whileOp );
					
					String sStruct = JolieEppUtils.getFreshVariable();
					VariablePathNode sStructVarPath = JolieEppUtils.toPath( sStruct );
					VariablePathNode sStructVarPathRole = JolieEppUtils.toPath( sStruct );
					JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
					VariablePathNode sStructVarPathContent = JolieEppUtils.toPath( sStruct );
					JolieEppUtils.appendSubNode( sStructVarPathContent, JolieEppUtils.CONTENT_VARNAME );
					
					notificationSequence.addChild( 
							new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							sStructVarPathRole,
							new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getKey() )
//							new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, leader)
					));
					notificationSequence.addChild( 
								new AssignStatement(
								JolieEppUtils.PARSING_CONTEXT, 
								sStructVarPathContent, 
								bVarPath
						));
					notificationSequence.addChild( new SolicitResponseOperationStatement(
									JolieEppUtils.PARSING_CONTEXT,
									whileOp,
									role,
									sStructVarPath, null, null
							));
				}
			}
			
			if ( !notificationSequence.children().isEmpty() ){
				seq.addChild( notificationSequence );
			}
			
			SequenceStatement ackSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			for( String role : nameCollector.getRoles() ){
				if ( !role.equals( leader ) ){
					result.addUncorrelatedInputOperation( whileOp );
					
					String sStruct = JolieEppUtils.getFreshVariable();
					VariablePathNode sStructVarPath = JolieEppUtils.toPath( sStruct );
					VariablePathNode sStructVarPathRole = JolieEppUtils.toPath( sStruct );
					JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
					
					ackSequence.addChild( 
							new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT, 
							sStructVarPathRole,
							new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, role)
					));
					ackSequence.addChild( new SolicitResponseOperationStatement(
									JolieEppUtils.PARSING_CONTEXT,
									JolieEppUtils.GET_PREFIX + whileOp,
									JolieEppUtils.MESSAGEHANDLER_NAME,
									sStructVarPath, null, null
							));
				}
			}
			
			SequenceStatement whileNode = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			whileNode.addChild( choreography.jolieNode() );
			if( !ackSequence.children().isEmpty() ){
				whileNode.addChild( ackSequence );
			}

			whileNode.addChild( new AssignStatement(JolieEppUtils.PARSING_CONTEXT, bVarPath, ConditionProjector.project( n.getCondition() )));
			
			if ( !notificationSequence.children().isEmpty() ){
				whileNode.addChild( notificationSequence );
			}
			
			bVarPath = JolieEppUtils.toPath( bVar );
			seq.addChild( new WhileStatement(
					JolieEppUtils.PARSING_CONTEXT, bVarPath, whileNode));
			result.setJolieNode(seq);
		} else if ( nameCollector.getRoles().contains( thread ) ){
			SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			
			result.uncorrelatedInputOperations().add( whileOp );
			result.addRRToOutputPort(getOutputPortNameForOutput( leader ), whileOp );
			
			// receive the evaluation of variable
			String sStruct = JolieEppUtils.getFreshVariable();
			VariablePathNode sStructVarPath = JolieEppUtils.toPath( sStruct );
			VariablePathNode sStructVarPathRole = JolieEppUtils.toPath( sStruct );
			JolieEppUtils.appendSubNode( sStructVarPathRole, "msgID" );
				
			seq.addChild( 
						new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						sStructVarPathRole,
						new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getKey() )
//						new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, leader)
				));
			seq.addChild( new SolicitResponseOperationStatement(
								JolieEppUtils.PARSING_CONTEXT,
								JolieEppUtils.GET_PREFIX + whileOp,
								JolieEppUtils.MESSAGEHANDLER_NAME,
								sStructVarPath, sStructVarPath, null
						));
				
			VariablePathNode sStructVarPathContent = JolieEppUtils.toPath( sStruct );
			JolieEppUtils.appendSubNode( sStructVarPathContent, JolieEppUtils.CONTENT_VARNAME );
			
			SequenceStatement whileNode = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			whileNode.addChild( choreography.jolieNode() );
			
			String vStruct = JolieEppUtils.getFreshVariable();
			VariablePathNode vStructVarPath = JolieEppUtils.toPath( vStruct );
			VariablePathNode vStructVarPathRole = JolieEppUtils.toPath( vStruct );
			JolieEppUtils.appendSubNode( vStructVarPathRole, "msgID" );
			
			whileNode.addChild( 
					new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT, 
					vStructVarPathRole, 
					new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, thread)
			));
			whileNode.addChild( new SolicitResponseOperationStatement(
							JolieEppUtils.PARSING_CONTEXT,
							whileOp,
							leader,
							vStructVarPath, null, null
					));
			
			whileNode.addChild( 
						new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						sStructVarPathRole,
						new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getKey() )
//						new ConstantStringExpression(JolieEppUtils.PARSING_CONTEXT, leader)
				));
			whileNode.addChild( new SolicitResponseOperationStatement(
								JolieEppUtils.PARSING_CONTEXT,
								JolieEppUtils.GET_PREFIX + whileOp,
								JolieEppUtils.MESSAGEHANDLER_NAME,
								sStructVarPath, sStructVarPath, null
						));
			
			seq.addChild( new WhileStatement( JolieEppUtils.PARSING_CONTEXT, sStructVarPathContent, whileNode ));
			result.setJolieNode(seq);
		}
		return result;
	}

	public ThreadProjectionResult caseLocalAskCommand(LocalAskCommand n) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement(
				JolieEppUtils.PARSING_CONTEXT);
		if ( n.getThread().equals(thread) ) {
			VarCollector vc = new VarCollector();
			vc.collect( n.getQuestion() );

			seq.addChild(new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, "showInputDialog",
					"SwingUI", 
					JolieEppUtils.getSumExpression(
						new jolie.lang.parse.ast.expression.ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, this.thread + ": " ),
						ExpressionProjector.project( n.getQuestion() ) 
					),
					JolieEppUtils.toPath( n.getResultVariable()), null) );
			result.addInclude("ui/swing_ui");
			result.setJolieNode(seq);
		}
		return result;
	}
	
	public ThreadProjectionResult caseLocalAssignmentCommand(
			LocalAssignmentCommand n) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement(
				JolieEppUtils.PARSING_CONTEXT);
		if ( n.getThread().equals( thread ) ) {
			// the sequence in case it is an expression
			if ( n.getExpression() != null ){
				VarCollector vc = new VarCollector();
				vc.collect( n.getExpression() );

				seq.addChild(new AssignStatement(JolieEppUtils.PARSING_CONTEXT,
							JolieEppUtils.toPath(n
									.getVariable()), ExpressionProjector.project(n
											.getExpression())));
				// sets variable @State
				// the sequence in case it is a function
			} else if ( n.getFunction() != null ){
				// get all the variables in the expressions ...
				VarCollector vc = new VarCollector();
				for( org.aioc.Expression e : n.getFunction().getParams() ){
					vc.collect( e );
				}
				// ... and get all their values from the State


				// prepare the message for the external service 
				// ( evaluates expressions of parameters )
				String funVar = JolieEppUtils.getFreshVariable();					
				for( org.aioc.Expression e : n.getFunction().getParams() ){
					int index = n.getFunction().getParams().indexOf( e );
					seq.addChild( 
						new AssignStatement( 
							JolieEppUtils.PARSING_CONTEXT,
							JolieEppUtils.toPath(
									funVar + ".p[" + index + "]" ), 
									ExpressionProjector.project( e ))
					);
					}
				// sends the request to the service
				
				seq.addChild( new SolicitResponseOperationStatement(
						JolieEppUtils.PARSING_CONTEXT, 
						n.getFunction().getName(), 
						collector.getFunctionOutputPort( n.getFunction().getName() ).id(), 
						JolieEppUtils.toPath( funVar ), 
						JolieEppUtils.toPath( n.getVariable() ), 
						null )
				);
				// updates the value of the variable in State 
	      }

			result.setJolieNode(seq);
	}
		return result;
	}

	public ThreadProjectionResult caseLocalShowCommand(LocalShowCommand n) {
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement(
				JolieEppUtils.PARSING_CONTEXT);
		if ( n.getThread().equals( thread ) ) {
			VarCollector vc = new VarCollector();
			vc.collect( n.getExpression() );

			// add name of the role
			seq.addChild(new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, "showMessageDialog",
					"SwingUI",
					JolieEppUtils.getSumExpression(
						new jolie.lang.parse.ast.expression.ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, this.thread + ": " ),
						new TypeCastExpressionNode(
							JolieEppUtils.PARSING_CONTEXT, NativeType.STRING,
							ExpressionProjector.project( n.getExpression() ) )
					),
					JolieEppUtils.toPath( n.getVariable() ), null));
			result.addInclude("ui/swing_ui");
			result.setJolieNode(seq);
		}
		return result;
	}

	private String getOutputPortNameForOutput(String role) {
		return role;
	}

}
