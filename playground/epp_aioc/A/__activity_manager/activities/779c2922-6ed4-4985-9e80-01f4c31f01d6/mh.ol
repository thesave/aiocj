include "runtime.iol"
include "semaphore_utils.iol"

execution { concurrent }

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

inputPort MyInputPort {
Location: "local"
Interfaces: MHInterface
}

outputPort Self {
Location: "local"
Interfaces: MHInterface
}

cset { 
msgID:
	OpType.msgID
}

init
{
	getLocalLocation@Runtime()(Self.location)
}

include "console.iol"

main
{
	[ ack()() {
		ackSemaphore.name = "ack";
		ackSemaphore.permits = 1;
		release@SemaphoreUtils( ackSemaphore )() 
} ] { 
	nullProcess 
}
	[ get_ack( c )() {
		ackSemaphore.name = "ack";
		ackSemaphore.permits = c.content.ledRoles;
		acquire@SemaphoreUtils( ackSemaphore )()
} ] {
		nullProcess
	}
	[ start(c)() {
	innerstart@Self(c.msgID);
	outer.name = "outer" + c.msgID;
	acquire@SemaphoreUtils(outer)()
} ] {
		nullProcess
	}
	[ innerstart(c) ] {
		csets.msgID = c;
		outer.name = "outer" + c;
		joinRelease.name = "join" + c;
		joinAcquire.name = "join" + c;
		joinedRelease.name = "joined" + c;
		joinedAcquire.name = "joined" + c;
		joinAcquire.permits = 2;
		joinedRelease.permits = 2;
		release@SemaphoreUtils(outer)();
		{
			{
				acquire@SemaphoreUtils(joinAcquire)();
				release@SemaphoreUtils(joinedRelease)()
			}
			|
			start_A()() {
				release@SemaphoreUtils(joinRelease)();
				acquire@SemaphoreUtils(joinedAcquire)()			
			}
			|
			start_B()() {
				release@SemaphoreUtils(joinRelease)();
				acquire@SemaphoreUtils(joinedAcquire)()			
			}
		}

	}
}

