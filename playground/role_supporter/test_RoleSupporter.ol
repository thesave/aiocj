include "console.iol"
include "./config/locations.iol"
include "./interfaces/RoleSupporterInterface.iol"

outputPort RoleSupporter {
	Location: Location_RoleSupporter
	Protocol: sodep
	Interfaces: RoleSupporterInterface
}

outputPort BasicRole {
	Protocol: sodep
	OneWay: hello( void )
}

main
{
  createRole@RoleSupporter( "C" )( path );
  BasicRole.location = Location_RoleSupporter + "/!/" + path;
  hello@BasicRole()
}