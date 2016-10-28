constants {
	Location_Client = "socket://localhost:10500/",
	Location_Folder = "A",
	ROLE = "A"
}

execution { single }

type CoordType: void {
  .sid: string
  .rolesNum: int
  .hasAck?: bool
}

type JoinType: void {
  .sid: string
}

interface MHInterface {
OneWay:
	initStartProcedure( CoordType )
RequestResponse:
	joinStart( JoinType )( void ), joinAck( JoinType )( void )
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "mh.ol" in MH
}

include "AbstractClient.iol"

main
{
	var0.sid = "f835d29d-1b4d-4d89-9678-ab580d518987";
	var0.rolesNum = 2;
	initStartProcedure@MH(var0);
	undef( var0.rolesNum );
	joinStart@MH(var0)();
	run@ActivityManager("779c2922-6ed4-4985-9e80-01f4c31f01d6")()
}