include "runtime.iol"
include "semaphore_utils.iol"

execution { concurrent }

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	get_log(OpType)(undefined), log(OpType)(undefined)
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
	[ log(c)() {
	get_log()(c	) {
		nullProcess	
	}
} ] {
		nullProcess
	}
	[ get_log(c)(c1) {
	log(c1)(	) {
		nullProcess	
	}
} ] {
		nullProcess
	}
}

