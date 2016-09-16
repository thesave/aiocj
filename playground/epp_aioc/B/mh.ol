include "runtime.iol"
include "semaphore_utils.iol"

execution { concurrent }

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	msg(OpType)(undefined), get_msg(OpType)(undefined)
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
	[ msg(c)() {
	get_msg()(c	) {
		nullProcess	
	}
} ] {
		nullProcess
	}
	[ get_msg(c)(c1) {
	msg(c1)(	) {
		nullProcess	
	}
} ] {
		nullProcess
	}
}

