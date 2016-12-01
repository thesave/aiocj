package org.epp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestLambda {
	
	
	private class NewRole {
		private final NewRole nextRole;
		private final String name;
		
		public NewRole( String name, NewRole nextRole ) {
			this.nextRole = nextRole;
			this.name = name;
		}
		
		public NewRole( String name ) {
			this.nextRole = null;
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public NewRole getNextRole() {
			return nextRole;
		}
	}
	
	public static void main( String[] args ) {
		NewRole newRole = new TestLambda().
			new NewRole( "r1", new TestLambda().
				new NewRole( "r2", new TestLambda().
					new NewRole( "r3" ) ) );
		Function< NewRole, HashSet< String > > toMap = ( NewRole n ) -> { 
			HashSet< String > hashSet = new HashSet< String >();
			for ( NewRole r = newRole;  r != null ; r = r.getNextRole() ) {
				hashSet.add( r.getName() );
			}
			return hashSet;
		};
		toMap.apply( newRole );
	}

}
