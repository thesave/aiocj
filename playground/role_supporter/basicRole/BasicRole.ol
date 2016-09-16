constants {
	Location_Client = "local"
}

execution { single }

include "AbstractClient.iol"
main
{
	setConstants( cns );
	Location_Folder = cns.Location_Folder;
	ROLE = cns.ROLE;

	run@ActivityManager( "basicActivity" )()
}

