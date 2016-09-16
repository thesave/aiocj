
constants {
	Location_Client = "socket://localhost:10501/",
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

outputPort B {
Location: "socket://localhost:10500/"
Protocol: sodep
RequestResponse:
	msg(OpType)(undefined)
}

include "AbstractClient.iol"
main
{
	var1.msgID = "a5d42a6a-faa8-4d21-a68d-0da15b683645";
	start@MH(var1)();
	start_A@MH(var1)();
	_tmp = "hello";
	var0.content = _tmp;
	var0.msgID = "0b4ec88c-a96b-43de-98eb-8581ec207e3e";
	msg@B(var0)()
}

