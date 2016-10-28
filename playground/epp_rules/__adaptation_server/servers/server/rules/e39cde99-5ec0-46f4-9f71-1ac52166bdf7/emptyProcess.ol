include "../AbstractActivity.iol"

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

define onRun {
  var1.sid = "Adapt__KPH__";
  joinStart@Leader( var1 )();
  var12.sid = "Adapt__KPH__";
  joinAck@Leader( var12 )()
}

define start{ nullProcess }