package org.epp.impl;

import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import org.aioc.Aioc;
import org.aioc.Choreography;
import org.aioc.FunctionLocation;
import org.aioc.IfThenElse;
import org.aioc.LocalAssignmentCommand;
import org.aioc.NestedChoreography;
import org.aioc.Scope;
import org.aioc.SeqBlock;
import org.aioc.While;
import org.aioc.util.AiocSwitch;
import org.eclipse.emf.common.util.EList;

import jolie.lang.NativeType;
import jolie.lang.parse.ast.OutputPortInfo;
import jolie.lang.parse.ast.RequestResponseOperationDeclaration;
import jolie.lang.parse.ast.types.TypeInlineDefinition;
import jolie.util.Range;

public class FunctionCollector extends AiocSwitch< Boolean >{
	
	private final HashMap< String, HashMap< String, HashSet< OutputPortInfo > > > roleScopePorts =
			new HashMap< String, HashMap< String, HashSet< OutputPortInfo > > >();
	private HashMap< String, OutputPortInfo > functionPorts =
			new HashMap< String, OutputPortInfo >();
	private String scope;
	
	public FunctionCollector(){}
	
	public void collect( Choreography choreography, Aioc aioc ){
		if( aioc != null ){
			assignOutputPorts( aioc.getFunctionLocation() );			
			this.scope=JolieEppUtils.MAIN_SCOPE;
		}
		if( choreography != null ){ doSwitch( choreography ); }
	}
	
	public void collectRule( Choreography choreography, EList< FunctionLocation > fl ){
		if( fl != null ){
			assignOutputPorts( fl );
			this.scope = JolieEppUtils.MAIN_SCOPE;
		}
		if( choreography != null ){ doSwitch( choreography ); }
	}
	
	public HashMap< String, HashMap< String, HashSet< OutputPortInfo > > > 
	collectScope( 
			Choreography choreography,
			HashMap< String, OutputPortInfo > functionPorts,
			String scopeKey ){
		this.scope=scopeKey;
		this.functionPorts = functionPorts;
		collect( choreography, null);
		return roleScopePorts;
	}
	
	public Boolean caseScope( Scope scope ){
//		System.out.println( "Visiting scope \"" + scope.getKey() + "\"" );
		FunctionCollector fc = new FunctionCollector();
		fc.setFunctionOutputPort( functionPorts );
		fc.collectScope( scope.getChoreography(), functionPorts, scope.getKey() );
		mergeRoleScopePorts( fc.getRoleScopePorts() );
		return true;
	}
	
	public Boolean caseChoreography( Choreography n ){
		doSwitch( n.getSeqBlock() );
		if( n.getPar() != null ){ doSwitch( n.getPar() ); }
		return true;
	}
	
	public Boolean caseNestedChoreography( NestedChoreography n ){
		doSwitch( n.getChoreography() );
		return true;
	}
	
	public Boolean caseSeqBlock( SeqBlock n ){
		doSwitch( n.getEvent() );
		if ( n.getNext() != null ){ doSwitch( n.getNext() ); }
		return true;
	}
	
	public Boolean caseWhile( While n ){
		doSwitch( n.getChoreography() );
		return true;
	}
	
	public Boolean caseIfThenElse( IfThenElse n ){
		doSwitch( n.getThen() );
		if( n.getElse() != null ){
			doSwitch( n.getElse() );
		}
		return true;
	}
	
	public Boolean caseLocalAssignmentCommand( LocalAssignmentCommand n ){
		if( n.getFunction() !=null ){
			if( !roleScopePorts.containsKey( n.getThread() ) ){
				HashMap< String, HashSet< OutputPortInfo > > sout = 
						new HashMap< String, HashSet< OutputPortInfo > >();
				sout.put( scope, new HashSet< OutputPortInfo >());
				roleScopePorts.put( n.getThread(), sout);
			}
			if( !roleScopePorts.get( n.getThread() ).containsKey( scope ) ){
				roleScopePorts.get( n.getThread() ).put( scope, new HashSet< OutputPortInfo >() );
			}
//			System.out.println( "adding to " + n.getThread() );
//			System.out.println( "in scope \"" + this.scope + "\"" );	
//			System.out.println( "checking the presence of thread " + n.getThread() + ": " + roleScopePorts.get( n.getThread() ));
//			System.out.println( "checking the presence of scope " + scope + " for the thread: " + roleScopePorts.get( n.getThread() ).get( scope ));
//			OutputPortInfo o = functionPorts.get( n.getFunction().getName() );
//			System.out.println( "everything went well, adding port " +	o  + " for function " +  n.getFunction().getName() );
//			if( o == null ){
//				System.out.println( "Warning. " + o + " is null" );
//			}
			
			roleScopePorts.get( n.getThread() ).get( scope ).add( 
					functionPorts.get(	n.getFunction().getName() ));
		}
		return true;
	}

	public HashSet< OutputPortInfo > getRoleOutputPorts( String role ){
		return roleScopePorts.get( role ).get( JolieEppUtils.MAIN_SCOPE );
	}
	
	public HashSet< OutputPortInfo > getScopeOutputPorts( String role, String scopeKey ){
//		System.out.println( "Getting ports of scope " + scopeKey + " of role " + role );
		if( roleScopePorts.containsKey( role ) ){
//			System.out.println( roleScopePorts.get( role ).get( scopeKey ) );
//			System.out.println( roleScopePorts );
			return roleScopePorts.get( role ).get( scopeKey );
		} else {
			return new HashSet< OutputPortInfo >();
		}
	}
	
	public OutputPortInfo getFunctionOutputPort( String function ){
		return functionPorts.get( function );
	}
	
	public void setFunctionOutputPort( HashMap< String, OutputPortInfo > functionPorts ){
		this.functionPorts = functionPorts;
	}
	
	public HashMap< String, HashMap< String, HashSet< OutputPortInfo > > > getRoleScopePorts(){
		return roleScopePorts;
	}

	private void mergeRoleScopePorts(
			HashMap< String, HashMap< String, HashSet< OutputPortInfo > > > rsp ){
		for( String role : rsp.keySet() ){
			if( !roleScopePorts.containsKey( role ) ){
				roleScopePorts.put( role, new HashMap< String, HashSet< OutputPortInfo >>() );
			}
			for( String scopeKey: rsp.get( role ).keySet() ){
//				System.out.println( "Adding " + rsp.get( role ).get( scopeKey )
//						+ " to " + role + " in scope \"" + scopeKey + "\"" );
				roleScopePorts.get( role ).put( scopeKey, rsp.get( role ).get( scopeKey ) );
//				System.out.println( roleScopePorts );
			}
		}
	}

	private void assignOutputPorts( EList<FunctionLocation> functionLocation ) {
		if( functionLocation != null ){
			for( FunctionLocation fl : functionLocation ){
				OutputPortInfo o = new OutputPortInfo( 
						JolieEppUtils.PARSING_CONTEXT,
						"Port" + functionLocation.indexOf( fl ) );
				o.setLocation( URI.create( fl.getLocation() ) );
				if( fl.getProtocol() != null ){
					o.setProtocolId( fl.getProtocol() );
				} else {
					o.setProtocolId( "soap" );
				}
				for( String fs : fl.getFunctions().getFunctionName() ){									
					RequestResponseOperationDeclaration r = new RequestResponseOperationDeclaration(
							JolieEppUtils.PARSING_CONTEXT, 
							fs,
							new TypeInlineDefinition(
								JolieEppUtils.PARSING_CONTEXT, 
								"undefined", NativeType.ANY,
								new Range(1, 1)), 
							new TypeInlineDefinition(
								JolieEppUtils.PARSING_CONTEXT, 
								"undefined", NativeType.ANY,
								new Range(1, 1)), 
								null);
					o.addOperation( r );
					functionPorts.put( fs , o );
				}
			}
		}
//		System.out.println("Assigned ports to functions" + functionPorts.toString() );
	}

	public void printRolesOutputPorts() {
		for( String role : roleScopePorts.keySet() ){
			System.out.println( "Role: " + role );
			for( String scope : roleScopePorts.get( role ).keySet() ){
				System.out.println( "\tScope: " + scope );
				for( OutputPortInfo o : roleScopePorts.get( role ).get( scope ) ){
					System.out.println("\t\t Port: " + o.id() );
				}
			}
		}
	}

}
