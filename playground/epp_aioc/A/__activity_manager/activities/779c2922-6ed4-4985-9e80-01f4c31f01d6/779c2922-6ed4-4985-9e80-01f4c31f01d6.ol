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

outputPort Leader {
	Location: "socket://localhost:10500"
	Protocol: sodep
	Interfaces: LeaderInterface
}

// ADD IF LEADER, USED TO PARAMETRICALLY RANGE OVER LED ROLES
outputPort LedRole {
  Protocol: sodep
  Interfaces: AdaptActivityInterface
}

outputPort B {
Location: "socket://localhost:10501/!/Activity/779c2922-6ed4-4985-9e80-01f4c31f01d6"
Protocol: sodep
Interfaces: AdaptActivityInterface
RequestResponse:
	msg(OpType)(undefined)
}

// NOT NEEDED UNLESS THE SCOPE HAS TO RECEIVE FROM OTHER ROLES
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
  // THIS GOES HERE TO WAIT FOR OTHER ROLES
	initStartProcedure@Leader( var4 );
	undef( var4.rolesNum );
	undef( var4.hasAck );
  startSR.name = "execute";
  acquire@SemaphoreUtils(startSR)();
	joinStart@Leader(var4)();
  aReq.properties.scopeName.value = "hello_world";
	aReq.client = "socket://localhost:10500/";
	aReq.ports.A.address = "socket://localhost:10500/";
	aReq.ports.B.address = "socket://localhost:10501/";
	checkForUpdate@AdaptationManager(aReq)(aRes);
	if (is_defined(aRes)) {
    for ( c = 0, c < #aRes.roles.A.code, c++ ){
      embed_scope@ActivityManager(aRes.roles.A.code[ c ])()
    };
    var6.sid = adaptRequest.main_key = aRes.main_key;
    var6.rolesNum=1; foreach ( r : aRes.roles ) { var6.rolesNum++ }; 
    var6.hasAck = true;
    println@Console( "initiating procedure for: " + var6.sid )();
    // LAUNCHES THE INITSTARTPROCEDURE FOR THE NEW RULE
    initStartProcedure@Leader( var6 ); 
    // ADAPTS ALL LED ROLES ( ALREADY-PRESENT AND NEW ONES )
    // REMOVES OWN CODE FROM aRes
    undef( aRes.roles.A );
    foreach ( roleName : aRes.roles ) {
      if( is_defined( aRes.roles.( roleName ).cookie ) ){
        adaptRequest.cookie = aRes.roles.( roleName ).cookie;
        LedRole.location = aRes.roles.( roleName ).location
      } else {
		    adaptRequest.cookie = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
        LedRole.location = aRes.roles.( roleName ).location + "!/Activity/779c2922-6ed4-4985-9e80-01f4c31f01d6"
      };
      adaptRequest.code << aRes.roles.( roleName ).code;
      println@Console( "SENDING ADAPTATION TO ROLE: " + roleName )();
      adapt@LedRole( adaptRequest )();
      undef( adaptRequest.code )
    };

    // EVERYONE ELSE IS ADAPTED, NOW THE LEADER CAN START TOO
		run@ActivityManager(aRes.main_key)()
	} else {
		eReq.cookie = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
    // THIS REMAINS STATICALLY SPECIFIED
    noAdapt@B(eReq);
		_tmp = "hello";
		var2.content = _tmp;
		var2.msgID = "58fb25ca-8677-4423-9d31-2830128bb94a";
		msg@B(var2)()
	};
	{
		var5.sid = "779c2922-6ed4-4985-9e80-01f4c31f01d6";
		joinAck@Leader(var5)()
	};
	startActivity@ActivityManager("779c2922-6ed4-4985-9e80-01f4c31f01d6");
	startSR.name = "done";
	release@SemaphoreUtils(startSR)()
}

