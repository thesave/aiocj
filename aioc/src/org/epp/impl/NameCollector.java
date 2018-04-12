/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.Set;

import jolie.lang.parse.ast.OneWayOperationDeclaration;
import jolie.lang.parse.ast.OperationDeclaration;
import jolie.lang.parse.ast.OutputPortInfo;

import org.aioc.Aioc;
import org.aioc.AssignmentSet;
import org.aioc.FunctionLocation;
import org.aioc.IfThenElse;
import org.aioc.Interaction;
import org.aioc.LocalCode;
import org.aioc.NestedChoreography;
import org.aioc.SeqBlock;
import org.aioc.While;
import org.aioc.Choreography;
import org.aioc.Scope;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * Utility class for collecting some name sets and maps from programs.
 * 
 * @author Fabrizio Montesi
 *
 */
public class NameCollector extends AiocSwitch< Boolean >
{
	/*
	 * Collects the input operations used by each receiver thread.
	 */

	public static class ThreadOperations {
		
		// thread -> operation -> operation type
		private final Map< String, Map< String, OperationDeclaration > > operationMap =
			new HashMap< String, Map< String, OperationDeclaration > >();

		private void checkInteraction( Interaction n )
		{
			Map< String, OperationDeclaration > operations = operationMap.get( n.getReceiver() );
			if ( operations == null ) {
				operations = new HashMap< String, OperationDeclaration >();
				operationMap.put( n.getReceiver(), operations );
			}
			operations.put(
				n.getOperation(),
				new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, n.getOperation() )
			);
		}
	}
	
	/*
	 * Collects the scopes, its leader and roles
	 */
	public static class ScopeStructure {
		
		private final String key;
		private final String leader;
		private final HashSet< String > ledRoles;
		private final Choreography choreography;
		private final AssignmentSet assignmentSet;
		
		public ScopeStructure(String key, 
				String leader, 
				HashSet<String> ledRoles, 
				Choreography choreography, 
				AssignmentSet assignmentSet){
			this.key = key;
			this.leader = leader;
			this.ledRoles = ledRoles;
			this.choreography = choreography;
			this.assignmentSet = assignmentSet;
		}
		
		public String getKey() { return this.key; }
		public String getLeader() { return this.leader; }
		public HashSet< String > getLedRoles(){ return this.ledRoles; }
		public Choreography getChoreography(){ return this.choreography; }
		public AssignmentSet getAssignmentSet(){ return this.assignmentSet; }
	}
	
	private final HashSet< String > roles = new HashSet< String >();
	private final ThreadOperations threadOperations = new ThreadOperations();
	private final Set< ScopeStructure > scopes = new HashSet< ScopeStructure >();
	private final HashMap< Interaction, String > interactionIDs = 
			new HashMap< Interaction, String >();
	private final FunctionCollector functionCollector = new FunctionCollector();
	
	private final HashMap<IfThenElse, String> ifOperations = new HashMap< IfThenElse, String>();
	private final HashMap<While, String> whileOperations = new HashMap< While, String>();
	
	private int interactionsId = 0;
		
	public void addInteraction( Interaction i ) {
		if( !interactionIDs.containsKey( i ) ){
			interactionIDs.put(	i, String.valueOf(interactionsId) );
			interactionsId++;
		}
	}
	
	public void addRoles( EList< String > additionalRoles ){
		for( String role : additionalRoles ){
			roles.add( role );			
		}
	}

	public void addRoles( Set< String > additionalRoles ){
		for( String role : additionalRoles ){
			roles.add( role );
		}
	}
	
	public void addRole( String role ){
		roles.add( role );
	}

	public Boolean caseChoreography( Choreography n ){
		doSwitch( n.getSeqBlock() );
		doSwitchIfNotNull( n.getPar() );
		return true;
	}
	
	public Boolean caseSeqBlock( SeqBlock n ){
		doSwitch( n.getEvent() );
		doSwitchIfNotNull( n.getNext() );
		return true;
	}
	
	public Boolean caseLocalCode( LocalCode n )
	{
		roles.add( n.getThread() );
		return true;
	}
	
	public Boolean caseInteraction( Interaction n )
	{
		roles.add( n.getSender() );
		roles.add( n.getReceiver() );
		threadOperations.checkInteraction( n );
		addInteraction( n );
		return true;
	}
	
	public Boolean caseScope( Scope n )
	{
		doSwitchIfNotNull( n.getChoreography() );
		
		String leader = n.getThread();
		
		roles.add( leader );
		
		NameCollector collector = new NameCollector();
		Choreography choreography = n.getChoreography();
		AssignmentSet assignmentSet = n.getProperties();
		collector.collect( n.getChoreography(), null );
		
		HashSet< String > ledRoles = collector.getRoles();
		if ( ledRoles.contains( leader ) ){
			ledRoles.remove( leader );
		}
		for( String lR : ledRoles ){
			roles.add( lR );
		}
		
		// adds additionalRoles
		if( n.getRoles() != null ){
			for( String role : n.getRoles().getRoles() ){
				roles.add( role );
				if( !role.equals( leader ) ){
					ledRoles.add( role );
				}
			}
		}
		
		String key = "";
		if( !isUUID( n.getKey() )){
			key = UUID.randomUUID().toString();
			// changes the label to identify the scope uniquely
			n.setKey( key );
		} else { key = n.getKey(); }
		scopes.add(
				new ScopeStructure(
						key, leader, ledRoles, 
						choreography, assignmentSet ) );		
		return true;
	}
	
	public Boolean caseNestedChoreography(NestedChoreography n) {
		doSwitch( n.getChoreography() );
		return true;
	}
	
	public Boolean caseIfThenElse( IfThenElse n )
	{	
		ifOperations.put( n, JolieEppUtils.getFreshOperation() );
		roles.add( n.getThread() );
		if( !isUUID( n.getKey() )){
			String key = UUID.randomUUID().toString();
			n.setKey( key );
		}
		doSwitchIfNotNull( n.getThen() );
		doSwitchIfNotNull( n.getElse() );
		return true;
	}
	
	public Boolean caseWhile( While n )
	{	
		whileOperations.put( n , JolieEppUtils.getFreshOperation() );
		roles.add( n.getThread() );
		if( !isUUID( n.getKey() )){
			String key = UUID.randomUUID().toString();
			n.setKey( key );
		}
		doSwitchIfNotNull( n.getChoreography() );
		return true;
	}
	
	public void collect(Choreography choreography, Aioc aioc) 
	{	
		if( choreography != null ) {
			doSwitch( choreography );
		}
		if( aioc != null ){
			functionCollector.collect( choreography, aioc );			
		}
	}
	
	public void collectRule( Choreography choreography, EList< FunctionLocation > fl ){
		if( choreography != null ){
			doSwitch( choreography );
		}
		if( fl != null ){
			functionCollector.collectRule( choreography, fl );
		}
	}

	private Boolean doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return true;
	}

	/**
	 * Returns the set of roles
	 */
	public HashSet< String > getRoles(){
		return roles;
	}

	public Set< ScopeStructure > getScopes(){
		return scopes;
	}

	public String getInteractionSID( Interaction i ){
		return interactionIDs.get( i );
	}
	
	public String getIfOperation( IfThenElse i ){
		return ifOperations.get( i );
	}
	
	public String getWhileOperation( While i ){
		return whileOperations.get( i );
	}

	private Boolean isUUID( String s ){
		if( s != null ){
			Boolean t = s.matches("[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}");
			return t;
		} else { return false; }
	}

	public ThreadOperations threadOperations(){
		return threadOperations;
	}
	
	public OutputPortInfo getFunctionOutputPort( String function ) {
		return functionCollector.getFunctionOutputPort( function );
	}

	public Set<OutputPortInfo> getRoleOutputPorts( String role, String scopeKey ) {
		return functionCollector.getScopeOutputPorts( role, scopeKey );
	}
	
	public void printRoleOutputPorts(){
		functionCollector.printRolesOutputPorts();
	}
		
}
