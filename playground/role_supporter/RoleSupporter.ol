include "./config/locations.iol"
include "./interfaces/RoleSupporterInterface.iol"
include "runtime.iol"
include "console.iol"
include "file.iol"

inputPort RoleSupporter {
	Location: Location_RoleSupporter
	Protocol: sodep
	Interfaces: RoleSupporterInterface
}

type NewRoleConstantsType: void {
  .Location_Folder: string
  .Role: string
}

outputPort NewRole {
	OneWay: setConstants( NewRoleConstantsType )
}

execution{ concurrent }

main
{
  createRole( roleName )( roleID ){
  	synchronized( counter ){
  		roleID = "role_" + global.roleCounter++
  		// create a new copy of basicRole and rename it roleID
  	};
		copyDir@File( { .to = roleID, .from = "basicRole" } )(); // replace with unzip 
  	// embed the new basicRole
		loadEmbeddedService@Runtime( { .filepath = roleID + "/BasicRole.ol", .type = "Jolie" } )( roleLocation );
		// create an outputPort
		setOutputPort@Runtime( { .location = roleLocation, .name = roleID } )();
		//
		NewRole.location = roleLocation;
		setConstants@NewRole( { .Location_Folder = roleID, .Role = roleName  } );
		// redirect RoleSupporter to OutputPort
		setRedirection@Runtime( {
	    .inputPortName = "RoleSupporter",
	    .outputPortName = roleID,
	    .resourceName = roleID
		 } )();
		 // we keep a single location folder since updates are uniquely identified  
		 println@Console( "created role " + roleID )()
  }
}