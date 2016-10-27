include "runtime.iol"
include "semaphore_utils.iol"
include "console.iol"

execution { concurrent }

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	pass(OpType)(undefined), get_pass(OpType)(undefined)
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

main
{
	[ pass(c)() {
		println@Console( "received message from C" )();
		get_pass()(c) {
		nullProcess	
	}
} ] {
		nullProcess
	}
	[ get_pass(c)(c1) {
	pass(c1)(	) {
		nullProcess	
	}
} ] {
		nullProcess
	}
}

