include "semaphore_utils.iol"
include "console.iol"
include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

outputPort MH {
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
  Location: "RPH__ADAPTATION_LEADER"
  Protocol: sodep
  Interfaces: LeaderInterface
}

outputPort C {
Location: "RPH__C!/Activity/Adapt__KPH__"
Protocol: sodep
RequestResponse:
	log(OpType)(undefined)
}

define onRun
{
  var1.sid = "Adapt__KPH__";
  joinStart@Leader( var1 )();
  get@State("msg")(msg);
  var6.content = msg;
  var6.msgID = "8e725aa2-8577-4789-9252-c77acc933499";
  println@Console( "CONTACTING C" )();
  log@C(var6)();
  var7.sid = "Adapt__KPH__";
  joinAck@Leader( var7 )()
}

define start
{
	nullProcess
}

