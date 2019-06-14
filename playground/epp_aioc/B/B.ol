
constants {
	Location_Client = "socket://localhost:10501/",
	Location_Folder = "B",
	ROLE = "B"
}
execution { single }

type OpType:void {
  .msgID:string
  .content?:undefined
}

type JoinType:void {
  .sid:string
}

outputPort MH {
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
  var111.sid = "e0e258bc-a043-4e77-9a84-b975b3ba76ff";
  joinStart@A( var111 )(  );
  run@ActivityManager( "34145b01-56a1-442c-beff-ac6fc15bc9e0" )(  )
}

