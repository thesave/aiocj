include "ui/swing_ui.iol"
include "semaphore_utils.iol"
include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
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

interface MHInterface {
RequestResponse:
	msg(OpType)(undefined), get_msg(OpType)(undefined)
}

outputPort Leader {
	Location: "socket://localhost:10500"
	Protocol: sodep
	Interfaces: LeaderInterface
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "__activity_manager/activities/779c2922-6ed4-4985-9e80-01f4c31f01d6/mh.ol" in MH
}

inputPort MyInputPort {
Location: "local"
Protocol: sodep
Interfaces: AdaptActivityInterface
Aggregates: MH
}

include "console.iol"

define onRun
{
	csets.cookie = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
	var10.sid = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
	joinStart@Leader(var10)();
	[ adapt(eReq)() {
	for ( c = 0, c < #eReq.code, c++ ){
		embed_scope@ActivityManager(eReq.code[ c ])()
	}
} ] {
		run@ActivityManager(eReq.main_key)()
	}
	[ noAdapt() ] {
		var6.msgID = "58fb25ca-8677-4423-9d31-2830128bb94a";
		get_msg@MH(var6)(var6);
		x = var6.content;
		var7.value = x;
		var7 = "x";
		set@State(var7)();
		get@State("x")(x);
		showMessageDialog@SwingUI(string(x))(r);
		var8.value = r;
		var8 = "r";
		set@State(var8)()
	};
	var11.sid = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
	joinAck@Leader(var11)()
}

define start
{
	nullProcess
}

