constants {
	Location_Client = "socket://localhost:10501/",
	Location_Folder = "B",
	ROLE = "B"
}

execution { single }

outputPort MH {}

type CoordType: void {
  .sid: string
  .rolesNum: int
}

type JoinType: void {
  .sid: string
}

outputPort A {
Location: "socket://localhost:10500/"
Protocol: sodep
RequestResponse:
	joinStart( JoinType )( void )
}

include "AbstractClient.iol"


main
{
	var1.sid = "f835d29d-1b4d-4d89-9678-ab580d518987";
	joinStart@A(var1)();
	run@ActivityManager("779c2922-6ed4-4985-9e80-01f4c31f01d6")()
}

