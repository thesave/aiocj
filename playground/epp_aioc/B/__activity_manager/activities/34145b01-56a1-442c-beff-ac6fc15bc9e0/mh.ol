execution { concurrent }

type OpType:void {
  .msgID:string
  .content?:undefined
}

type CoordType:void {
  .rolesNum:int
  .hasAck?:bool
  .sid:string
}

type JoinType:void {
  .sid:string
}

interface MHInterface {
OneWay:
  initStartProcedure( CoordType )
RequestResponse:
  msg( OpType )( undefined ), get_msg( OpType )( undefined ), joinAck( JoinType )( void ), joinStart( JoinType )( void )
}

inputPort MyInputPort {
Location: "local"
Interfaces: MHInterface
}

cset { 
msgID:
  OpType.msgID
}

cset { 
sid:
  CoordType.sid JoinType.sid
}

define joinStart
{
  joinStart(  )( 	 ) {
    if (     --joinStartCounter > 0 ) {
      joinStart
    }	
  }
}

define joinAck
{
  joinAck(  )( 	 ) {
    if (     --joinAckCounter > 0 ) {
      joinAck
    }	
  }
}

main
{
  [ initStartProcedure( startRequest ) ] {
    joinStartCounter =     joinAckCounter = startRequest.rolesNum;
    joinStart;
    if ( startRequest.hasAck ) {
      joinAck
    }
  }
  [ msg( c )(  ) {
  get_msg(  )( c	 ) {
    nullProcess	
  }
} ] {
    nullProcess
  }
  [ get_msg( c )( c1 ) {
  msg( c1 )( 	 ) {
    nullProcess	
  }
} ] {
    nullProcess
  }
}

