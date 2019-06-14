include "ui/swing_ui.iol"
include "semaphore_utils.iol"
include "../AbstractActivity.iol"

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
  msg( OpType )( undefined ), get_msg( OpType )( undefined ), joinAck( JoinType )( void ), joinStart( JoinType )( void )
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "__activity_manager/activities/34145b01-56a1-442c-beff-ac6fc15bc9e0/mh.ol" in MH
}

outputPort Leader {
Protocol: sodep
RequestResponse:
  joinAck( JoinType )( void ), joinStart( JoinType )( void )
}

inputPort MyInputPort {
Location: "local"
Protocol: sodep
Interfaces: AdaptActivityInterface
Aggregates: MH
}


define onRun
{
  csets.cookie = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
  var123.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
  Leader.location = "socket://localhost:10500/";
  joinStart@Leader( var123 )(  );
  [ adapt( eReq )(  ) {
  for ( c = 0, c < #eReq.code, c++ ){
    embed_scope@ActivityManager( eReq.code[ c ] )(  )
  }
} ] {
    var122.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0_adapt";
    joinStart@Leader( var122 )(  );
    run@ActivityManager( eReq.main_key )(  )
  }
  [ noAdapt(  ) ] {
    var116.msgID = "4f241441-fb77-4e41-8809-ab7423f2244e";
    get_msg@MH( var116 )( var116 );
    var117 = var116.content;
    var118.value = var117;
    var118 = "x";
    set@State( var118 )(  );
    get@State( "x" )( var119 );
    showMessageDialog@SwingUI( "B: " + string( var119 ) )(  );
    var121.value = var120;
    var121 = "null";
    set@State( var121 )(  )
  };
  var124.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
  joinAck@Leader( var124 )(  )
}

define start
{
  nullProcess
}

