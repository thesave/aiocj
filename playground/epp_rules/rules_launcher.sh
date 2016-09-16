#!/bin/bash
launcher(){
	if [ "$(uname)" == "Darwin" ]; then
osascript <<END
	tell application "Terminal"
		do script "$1"
	end tell
END
	else
		xterm -hold -e "$1" &
	fi
}

dir=$(cd `dirname "${BASH_SOURCE[0]}"` && pwd)
adaptation_server_launcher="cd $dir/__adaptation_server/servers/server; jolie AdaptationServer.ol"
launcher "$adaptation_server_launcher"