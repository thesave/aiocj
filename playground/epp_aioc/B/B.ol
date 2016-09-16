include "ui/swing_ui.iol"

constants {
	Location_Client = "socket://localhost:10500/",
	Location_Folder = "B",
	ROLE = "B"
}
execution { single }

type OpType:void {
	.msgID:string
	.content?:undefined
}

interface MHInterface {
RequestResponse:
	msg(OpType)(undefined), get_msg(OpType)(undefined)
}

outputPort MH {
Interfaces: MHInterface
}

embedded {
Jolie : "mh.ol" in MH
}

outputPort A {
Location: "socket://localhost:10501/"
Protocol: sodep
RequestResponse:
	start_B(OpType)(undefined)
}

include "AbstractClient.iol"
main
{
	var5.msgID = "a5d42a6a-faa8-4d21-a68d-0da15b683645";
	start_B@A(var5)();
	var2.msgID = "0b4ec88c-a96b-43de-98eb-8581ec207e3e";
	get_msg@MH(var2)(var2);
	x = var2.content;
	var3.value = x;
	var3 = "x";
	set@State(var3)();
	get@State("x")(x);
	showMessageDialog@SwingUI(string(x))(r);
	var4.value = r;
	var4 = "r";
	set@State(var4)()
}

