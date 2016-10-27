include "semaphore_utils.iol"
include "console.iol"
include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

outputPort MH {
}

outputPort C {
Location: "RPH__C!/Activity/Adapt__KPH__"
Protocol: sodep
RequestResponse:
	log(OpType)(undefined)
}


define onRun
{
	get@State("msg")(msg);
	var6.content = msg;
	var6.msgID = "8e725aa2-8577-4789-9252-c77acc933499";
  println@Console( "CONTACTING C" )();
	log@C(var6)()
}

define start
{
	nullProcess
}

