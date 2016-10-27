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

outputPort A {
	Location: "socket://localhost:10500"
	Protocol: sodep
	Interfaces: LeaderInterface
}

outputPort B {
Location: "socket://localhost:10501/!/Activity/779c2922-6ed4-4985-9e80-01f4c31f01d6"
Protocol: sodep
Interfaces: AdaptActivityInterface
RequestResponse:
	msg(OpType)(undefined)
}

// UNNECESSARY FOR THIS CASE <---
// inputPort MyInputPort {
// Location: "local"
// Protocol: sodep
// Aggregates: MH
// }

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
	var4.sid = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
	var4.rolesNum = 2;
	var4.hasAck = true;
	initStartProcedure@A( var4 );
	undef( var4.rolesNum );
	undef( var4.hasAck );
	joinStart@A(var4)();
	aReq.properties.scopeName.value = "hello_world";
	startSR.name = "execute";
	acquire@SemaphoreUtils(startSR)();
	aReq.client = "socket://localhost:10500/";
	aReq.ports.A.address = "socket://localhost:10500/";
	aReq.ports.B.address = "socket://localhost:10501/";
	checkForUpdate@AdaptationManager(aReq)(aRes);
	if (is_defined(aRes)) {
		var3.msgID = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
		for ( c = 0, c < #aRes.A.code, c++ ){
			embed_scope@ActivityManager(aRes.A.code[ c ])()
		};
		adaptRequest.cookie = var3.msgID;
		adaptRequest.code << aRes.B.code;				// THIS SHALL BE CHANGED TO COMPRISE ALSO NEW ROLES
		var6.sid = adaptRequest.main_key = aRes.main_key;
		println@Console( "initiating procedure for: " + var6.sid )();
		var6.rolesNum = 3; // THIS MUST BE A PARAMETER WITHIN aRes
		var6.hasAck = true;
		initStartProcedure@A( var6 ); // LAUNCHES THE INITSTARTPROCEDURE FOR THE NEW RULE
		adapt@B(adaptRequest)();
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
		var5.sid = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
		joinAck@A(var5)()
	};
	startActivity@ActivityManager("779c2922-6ed4-4985-9e80-01f4c31f01d6");
	startSR.name = "done";
	release@SemaphoreUtils(startSR)()
}

