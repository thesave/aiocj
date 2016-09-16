include "ui/swing_ui.iol"
include "../AbstractActivity.iol"

// type OpType:void {
// 	.msgID:string
// 	.content?:undefined
// }

inputPort MyInputPort {
	Location: "local"
	Protocol: sodep
	Interfaces: AdaptActivityInterface
}

define onRun
{
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