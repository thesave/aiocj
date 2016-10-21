include "semaphore_utils.iol"
include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
OneWay:
	innerstart(string)
RequestResponse:
	start(OpType)(undefined), ack(OpType)(undefined), get_ack(OpType)(undefined), start_B(OpType)(undefined), start_A(OpType)(undefined)
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "__activity_manager/activities/779c2922-6ed4-4985-9e80-01f4c31f01d6/mh.ol" in MH
}

outputPort B {
Location: "socket://localhost:10501/!/Activity/779c2922-6ed4-4985-9e80-01f4c31f01d6"
Protocol: sodep
Interfaces: AdaptActivityInterface
RequestResponse:
	msg(OpType)(undefined)
}

inputPort MyInputPort {
Location: "local"
Protocol: sodep
Aggregates: MH
}


define onRun
{
	onRunSR.name = "execute";
	release@SemaphoreUtils(onRunSR)();
	onRunSR.name = "done";
	acquire@SemaphoreUtils(onRunSR)()
}

include "console.iol"

define start
{
	var4.msgID = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
	ledRoles = 1; // THIS SETS THE NUMBER OF ledRoles in the original scope
	start@MH(var4)();
	start_A@MH(var4)();
	startSR.name = "execute";
	acquire@SemaphoreUtils(startSR)();
	aReq.client = "socket://localhost:10500/";
	aReq.ports.A.address = "socket://localhost:10500/";
	aReq.ports.B.address = "socket://localhost:10501/";
	checkForUpdate@AdaptationManager(aReq)(aRes);
	if (is_defined(aRes)) {
		var3.msgID = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
		start@MH(var3)();
		for ( c = 0, c < #aRes.A.code, c++ ){
			embed_scope@ActivityManager(aRes.A.code[ c ])()
		};
		ledRoles = aRes.ledRoles; // THIS OVERWRITES ledRoles
		adaptRequest.cookie = var3.msgID;
		adaptRequest.code << aRes.B.code;
		adaptRequest.main_key = aRes.main_key;
		adapt@B(adaptRequest)();
		start_A@MH(var3)();
		run@ActivityManager(aRes.main_key)()
	} else {
		eReq.cookie = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
		noAdapt@B(eReq);
		_tmp = "hello";
		var2.content = _tmp;
		var2.msgID = "58fb25ca-8677-4423-9d31-2830128bb94a";
		msg@B(var2)()
	};
	{
		var5.msgID = "A";
		var5.content.ledRoles = ledRoles;  // COMMUNICATES NUMBER OF LED ROLES TO MH
		println@Console( "ledRoles contains: " + var5.content.ledRoles )();
		get_ack@MH(var5)()
	};
	startActivity@ActivityManager("779c2922-6ed4-4985-9e80-01f4c31f01d6");
	startSR.name = "done";
	release@SemaphoreUtils(startSR)()
}

