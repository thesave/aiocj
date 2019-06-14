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
  joinAck( JoinType )( void ), joinStart( JoinType )( void )
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "__activity_manager/activities/34145b01-56a1-442c-beff-ac6fc15bc9e0/mh.ol" in MH
}

outputPort Leader {
Protocol: sodep
OneWay:
  initStartProcedure( CoordType )
RequestResponse:
  joinAck( JoinType )( void ), joinStart( JoinType )( void )
}

outputPort LedRole {
Protocol: sodep
Interfaces: AdaptActivityInterface
RequestResponse:
  coord( OpType )( void )
}

outputPort B {
Location: "socket://localhost:10501/!/Activity/34145b01-56a1-442c-beff-ac6fc15bc9e0"
Protocol: sodep
Interfaces: AdaptActivityInterface
RequestResponse:
  msg( OpType )( undefined )
}

inputPort MyInputPort {
Location: "local"
Protocol: sodep
Aggregates: MH
}


define onRun
{
  onRunSR.name = "execute";
  release@SemaphoreUtils( onRunSR )(  );
  onRunSR.name = "done";
  acquire@SemaphoreUtils( onRunSR )(  )
}

define start
{
  var114.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
  var114.rolesNum = 2;
  var114.hasAck = true;
  Leader.location = "socket://localhost:10500/";
  initStartProcedure@Leader( var114 );
  undef( var114.rolesNum );
  undef( var114.hasAck );
  startSR.name = "execute";
  acquire@SemaphoreUtils( startSR )(  );
  joinStart@Leader( var114 )(  );
  aReq.client = "socket://localhost:10500/";
  aReq.ports.A.address = "socket://localhost:10500/";
  aReq.ports.B.address = "socket://localhost:10501/";
  checkForUpdate@AdaptationManager( aReq )( aRes );
  if ( is_defined( aRes ) ) {
    for (   c = 0, c < #aRes.roles.A.code, c++ ){
      embed_scope@ActivityManager( aRes.roles.A.code[ c ] )(  )
    };
    var113.sid =     adaptRequest.main_key = aRes.main_key;
    foreach ( r : aRes.roles ){
      var113.rolesNum++
    };
    var113.hasAck = true;
    initStartProcedure@Leader( var113 );
    var113.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0_adapt";
    undef( var113.hasAck );
    initStartProcedure@Leader( var113 );
    undef( var113.rolesNum );
    undef( aRes.roles.A );
    foreach ( roleName : aRes.roles ){
      if ( is_defined( aRes.roles.( roleName ).cookie ) ) {
        adaptRequest.cookie = aRes.roles.( roleName ).cookie;
        LedRole.location = aRes.roles.( roleName ).location;
        op18.msgID = adaptRequest.cookie;
        op18.content.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0_adapt";
        op18.content.leader = Leader.location;
        coord@LedRole( op18 )(  )
      } else {
        adaptRequest.cookie = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
        LedRole.location = aRes.roles.( roleName ).location + "!/Activity/34145b01-56a1-442c-beff-ac6fc15bc9e0"
      };
      adaptRequest.code << aRes.roles.( roleName ).code;
      adapt@LedRole( adaptRequest )(  );
      undef( adaptRequest.code )
    };
    joinStart@Leader( var113 )(  );
    run@ActivityManager( aRes.main_key )(  )
  } else {
    eReq.cookie = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
    noAdapt@B( eReq );
    _tmp = "hello";
    var112.content = _tmp;
    var112.msgID = "4f241441-fb77-4e41-8809-ab7423f2244e";
    msg@B( var112 )(  )
  };
  var115.sid = "34145b01-56a1-442c-beff-ac6fc15bc9e0";
  joinAck@Leader( var115 )(  );
  startActivity@ActivityManager( "34145b01-56a1-442c-beff-ac6fc15bc9e0" );
  startSR.name = "done";
  release@SemaphoreUtils( startSR )(  )
}

