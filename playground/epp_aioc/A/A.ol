
constants {
	Location_Client = "socket://localhost:10500/",
	Location_Folder = "A",
	ROLE = "A"
}
execution { single }

type OpType:void {
  .msgID:string
  .content?:undefined
}

type CoordType:void {
  .rolesNum:int
  .hasAck?:bool
  .sid:string
}

type JoinType:void {
  .sid:string
}

interface MHInterface {
OneWay:
  initStartProcedure( CoordType )
RequestResponse:
  joinAck( JoinType )( void ), joinStart( JoinType )( void )
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
  var110.sid = "e0e258bc-a043-4e77-9a84-b975b3ba76ff";
  var110.rolesNum = 2;
  initStartProcedure@MH( var110 );
  undef( var110.rolesNum );
  joinStart@MH( var110 )(  );
  run@ActivityManager( "34145b01-56a1-442c-beff-ac6fc15bc9e0" )(  )
}

