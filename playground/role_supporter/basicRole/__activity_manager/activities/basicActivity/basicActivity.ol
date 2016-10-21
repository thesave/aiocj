include "../AbstractActivity.iol"

type OpType:void {
	.msgID:string
	.content?:undefined
}

cset { msgID:	OpType.msgID }

inputPort MyInputPort {
	Location: "local"
	Protocol: sodep
	Interfaces: AdaptActivityInterface
	RequestResponse: hello( OpType )( undefined )
}

define onRun
{
	csets.cookie = "basicActivity";
	
	// FOR TESTING PURPOSES
	csets.msgID = "basicActivity";
	hello( s )( s.content+s.content );
	// FOR TESTING PURPOSES

	adapt( eReq )(){ 
		for ( c = 0, c < #eReq.code, c++ ){
			embed_scope@ActivityManager(eReq.code[ c ])()
		}
	};
	run@ActivityManager(eReq.main_key)()
}

define start
{
	nullProcess 
}