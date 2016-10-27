include "runtime.iol"
include "semaphore_utils.iol"

execution { concurrent }

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

interface MHInterface {
OneWay:
	initStartProcedure( CoordType )
RequestResponse:
	joinStart( JoinType )( void ), joinAck( JoinType )( void )
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
sid: CoordType.sid JoinType.sid
}

init
{
	getLocalLocation@Runtime()(Self.location)
}

define joinStart {
  joinStart()(){
  	if( --joinStartCounter > 0 ){
  		joinStart
  	}
  }
}

define joinAck {
	joinAck()(){
		if( --joinAckCounter > 0 ) {
		  joinAck()()
		}
	}
}

main
{
	initStartProcedure( startRequest );
	joinStartCounter = joinAckCounter = startRequest.rolesNum;
	joinStart;
  if ( startRequest.hasAck ){
	 joinAck
  }
}

