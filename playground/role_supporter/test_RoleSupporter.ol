include "console.iol"
include "./config/locations.iol"
include "./interfaces/RoleSupporterInterface.iol"

outputPort RoleSupporter {
	Location: Location_RoleSupporter
	Protocol: sodep
	Interfaces: RoleSupporterInterface
}

type OpType:void {
  .msgID:string
  .content?: undefined
}

outputPort ActivityAtRole {
	Protocol: sodep
  RequestResponse: hello( OpType )( undefined )
}

main
{
  createRole@RoleSupporter( "C" )( path );
  // BasicRole.location = Location_RoleSupporter + "/!/" + path; // THIS IS THE PATH OF THE BASIC ROLE
  ActivityAtRole.location = Location_RoleSupporter + "/!/" + path + "/Activity/basicActivity"; // THIS IS THE PATH OF THE BASIC ACTIVITY
  hello@ActivityAtRole( { .msgID = "basicActivity", .content = "ciao" } )( s );
  println@Console( s )()
}