include "semaphore_utils.iol"
include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	get_log(OpType)(undefined), log(OpType)(undefined)
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "__activity_manager/activities/Adapt__KPH__/mh.ol" in MH
}

outputPort B {
Location: "RPH__B!/Activity/Adapt__KPH__"
Protocol: sodep
RequestResponse:
	pass(OpType)(undefined)
}

inputPort MyInputPort {
Location: "local"
Protocol: sodep
Interfaces: AdaptActivityInterface
Aggregates: MH
}


define onRun
{
	var9.msgID = "8e725aa2-8577-4789-9252-c77acc933499";
	get_log@MH(var9)(var9);
	msg = var9.content;
	var10.value = msg;
	var10 = "msg";
	set@State(var10)();
	get@State("msg")(msg);
	var11.content = msg;
	var11.msgID = "b0bde86a-e516-4513-bee6-4ca07b292b23";
	pass@B(var11)()
}

define start
{
	nullProcess
}

