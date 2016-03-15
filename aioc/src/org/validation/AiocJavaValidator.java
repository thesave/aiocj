/***************************************************************************
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

package org.validation;

import java.util.HashSet;
import java.util.TreeSet;

import org.aioc.Aioc;
import org.aioc.AiocPackage;
import org.aioc.Choreography;
import org.aioc.ExpressionBasicTerm;
import org.aioc.Function;
import org.aioc.FunctionLocation;
import org.aioc.Interaction;
import org.aioc.LocalAssignmentCommand;
import org.aioc.Rule;
import org.aioc.SeqBlock;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.epp.impl.NameCollector;
import org.validation.CausalitySafety.CSInteraction;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class AiocJavaValidator extends org.validation.AbstractAiocJavaValidator {
	
	@Check
	public void checkCausalitySafety( Choreography n ){
		if( n.getNext() != null ){
			TreeSet< CSInteraction > leftInteractions = 
					new CausalitySafety().getInteractions( n.getSeqBlock() );
			TreeSet< CSInteraction > rightInteractions =
					new CausalitySafety().getInteractions( n.getNext() );
			TreeSet< CSInteraction > intersection = 
					new TreeSet< CSInteraction >( rightInteractions );
			intersection.retainAll( leftInteractions );
			if( intersection.size() > 0 ){
				CSInteraction tmp = intersection.first();
				intersection.removeAll( intersection );
				intersection.add( tmp );
				leftInteractions.retainAll( intersection );
				error("Multiple parallel operations with the same signature",
						leftInteractions.first().getInteraction(),
						AiocPackage.Literals.INTERACTION.getEIDAttribute());
				rightInteractions.retainAll( intersection );
				error("Multiple parallel operations with the same signature",
						rightInteractions.first().getInteraction(),
						AiocPackage.Literals.INTERACTION.getEIDAttribute());
				}
			}
		}
	
	@Check
	public void checkVariableName( ExpressionBasicTerm n ){
		if( n.getVariable() != null ){
			HashSet< String > roles = getRoles( n );
			if( roles.contains( n.getVariable() ) ){
				error("Variables cannot have the same name as roles",
						n,
						AiocPackage.Literals.EXPRESSION_BASIC_TERM__VARIABLE);
			}
		}
	}
	
	@Check void checkInteractionReceptionAssignment( Interaction n ){
		if( n.getReceiverVariable() != null ){
			HashSet< String > roles = getRoles( n );
			if( roles.contains( n.getReceiverVariable() ) ){
				error("Variables cannot have the same name as roles",
						n,
						AiocPackage.Literals.INTERACTION__RECEIVER_VARIABLE);
			}
		}
	}
	
	@Check
	public void checkLocalAssignment( LocalAssignmentCommand n ){
		if ( n.getVariable() != null ){
			HashSet< String > roles = getRoles( n );
			if( roles.contains( n.getVariable() ) ){
				error("Variables cannot have the same name as roles",
						n,
						AiocPackage.Literals.LOCAL_ASSIGNMENT_COMMAND__VARIABLE);
			}
		}
	}
	
	private HashSet< String > getRoles( EObject n ){
		GetRoles gRoles = new GetRoles();
		return gRoles.getRoles( getChoreography( n ) );
	}
	
	private Choreography getChoreography( EObject n ){
		Choreography c = null;
		if( n.eContainer() != null ){
			if( n.eContainer() instanceof Aioc ){
				Aioc aioc = ( Aioc ) n.eContainer();
				c = aioc.getChoreography();
			} else if ( n.eContainer() instanceof Rule ){
				Rule rule = ( Rule ) n.eContainer();
				c = rule.getChoreography();
			} else {
				c = getChoreography( n.eContainer() );
			}
		}
		return c;
	}
	
	@Check
	public void checkConnectednessForSequence( SeqBlock n ) {
		Boolean isConnected = true;
		if( n.getNext() != null ){
			TransF transF = new TransF();
			HashSet< String > transFRoles = transF.getRoles( n );
			TransI transI = new TransI();
			HashSet< String > transIRoles = transI.getRoles( n.getNext() );
			isConnected = isNonEmptyIntersect( transIRoles, transFRoles );
			if( !isConnected ){
				error("The sequence is not connected",
						n.getNext(),
						AiocPackage.Literals.SEQ_BLOCK__EVENT);
			}
		}
	}
	
	@Check
	public void checkSelfInteraction( Interaction n ){
		if( n.getSender().equals( n.getReceiver() ) ){
			error("Interactions are allowed only between different roles", 
					AiocPackage.Literals.INTERACTION.getEIDAttribute() );
		}
	}


	@Check
	public void checkAdditionalRoles( org.aioc.Scope n ){
		NameCollector nc = new NameCollector();
		nc.collect( n.getChoreography(), null );
		if( n.getRoles() != null ){
			for( String role : n.getRoles().getRoles() ){
				if( role.equals(n.getThread()) ){
					error("The role \"" + role + "\" is the leader of the scope, cannot be an additional role", 
							n.getRoles(), AiocPackage.Literals.ROLES.getEIDAttribute() );
				}
				else if( nc.getRoles().contains( role ) ){
					warning("The role \"" + role + "\" inserted is already present in the scope", 
							n.getRoles(), AiocPackage.Literals.ROLES.getEIDAttribute() );
				}
			}
		}
	}
	
	@Check
	public void checkFunctionUsage( Function n ){
		HashSet< String > fl = getFunctionList( n );
		if( !fl.contains( n.getName() ) ){
			error("Function \"" + n.getName() + "\" not included", 
					n, AiocPackage.Literals.FUNCTION__NAME );
		}
	}
	
	private HashSet< String > getFunctionList( EObject n ){
		if( n instanceof Aioc ){
			HashSet< String > fl = new HashSet< String >();
			for( FunctionLocation floc : ( ( Aioc ) n ).getFunctionLocation() ){
				for( String f : floc.getFunctions().getFunctionName() ){
					fl.add( f );
				}
			}
			return fl;
		} else if ( n instanceof Rule ){
			HashSet< String > fl = new HashSet< String >();
			for( FunctionLocation floc : ( ( Rule ) n ).getFunctionLocation() ){
				for( String f : floc.getFunctions().getFunctionName() ){
					fl.add( f );
				}
			}
			return fl;
		} else {
			return getFunctionList( n.eContainer() );
			}
	}
	
	@Check
	public void checkAdditionalRolesRules( Rule n ){
		CheckAddRules c = new CheckAddRules();
		HashSet< org.aioc.Scope > scopes = c.findAddRoles( n.getChoreography() );
		for( org.aioc.Scope scope : scopes ){
			error("New roles cannot be specified in rules", 
					scope.getRoles(), 
					AiocPackage.Literals.ROLES.getEIDAttribute());
		}
	}
	
	private Boolean isNonEmptyIntersect( 
			HashSet< String > transIRoles, 
			HashSet< String > transFRoles ){
		Boolean isNonEmpty = false;
		if( transFRoles.size() == 0 || transIRoles.size() == 0 ){
			isNonEmpty = true;
		} else {
			for( String role : transIRoles ){
				isNonEmpty = isNonEmpty || transFRoles.contains( role );
			}			
		}
		return isNonEmpty;
	}
	
}
