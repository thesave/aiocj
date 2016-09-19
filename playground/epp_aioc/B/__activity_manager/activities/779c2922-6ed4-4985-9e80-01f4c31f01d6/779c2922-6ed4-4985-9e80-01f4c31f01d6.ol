include "ui/swing_ui.iol"
include "semaphore_utils.iol"
include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	msg(OpType)(undefined), get_msg(OpType)(undefined)
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "__activity_manager/activities/779c2922-6ed4-4985-9e80-01f4c31f01d6/mh.ol" in MH
}

outputPort A {
Location: "socket://localhost:10500/!/Activity/779c2922-6ed4-4985-9e80-01f4c31f01d6"
Protocol: sodep
RequestResponse:
	ack(OpType)(undefined), start_B(OpType)(undefined)
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
	var10.msgID = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
	start_B@A(var10)();
	[ adapt(eReq)() {
	for ( 	c = 0, c < #eReq.code, c++ ){
		embed_scope@ActivityManager(eReq.code[ c ])()
	}
} ] {
		var9.msgID = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
		start_B@A(var9)();
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
	var11.msgID = "B";
	ack@A(var11)()
}

define start
{
	nullProcess
}

