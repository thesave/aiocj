constants {
	Location_Client = "socket://localhost:10500/",
	Location_Folder = "A",
	ROLE = "A"
}

execution { single }

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

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "mh.ol" in MH
}

include "AbstractClient.iol"
main
{
	var0.msgID = "f835d29d-1b4d-4d89-9678-ab580d518987";
	start@MH(var0)();
	start_A@MH(var0)();
	run@ActivityManager("779c2922-6ed4-4985-9e80-01f4c31f01d6")()
}