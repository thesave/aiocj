include "semaphore_utils.iol"
include "../AbstractActivity.iol"
include "console.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	pass(OpType)(undefined), get_pass(OpType)(undefined)
}

outputPort MH {
Interfaces: MHInterface
}


embedded {
Jolie : "__activity_manager/activities/Adapt__KPH__/mh.ol" in MH
}

type CoordType: void {
  .sid: string
  .rolesNum: int
  .hasAck?: bool
}

type JoinType: void {
  .sid: string
}

interface LeaderInterface {
OneWay:
  initStartProcedure( CoordType )
RequestResponse:
  joinStart( JoinType )( void ), joinAck( JoinType )( void )
}

outputPort Leader {
  Location: "socket://localhost:15000"
  Protocol: sodep
  Interfaces: LeaderInterface
}

inputPort MyInputPort {
Location: "local"
Protocol: sodep
Interfaces: AdaptActivityInterface
Aggregates: MH
}


define onRun
{
	var1.sid = "Adapt__KPH__";
	joinStart@Leader( var1 )();
	var7.msgID = "b0bde86a-e516-4513-bee6-4ca07b292b23";
	println@Console( "WAITING FOR THE MESSAGE FROM C" )();
	get_pass@MH(var7)(var7);
	msg = var7.content;
	var8.value = msg;
	println@Console( "RECEIVED" + msg  )();
	var8 = "msg";
	set@State(var8)();
	var9.sid = "Adapt__KPH__";
	joinAck@Leader( var9 )()
}

define start
{
	nullProcess
}

