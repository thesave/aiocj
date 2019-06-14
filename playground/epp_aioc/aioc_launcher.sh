#!/bin/bash
launcher(){
	if [ "$(uname)" == "Darwin" ]; then
osascript <<END
	tell application "Terminal"
		do script "$1"
	end tell
END
	else
		xterm -e "$1; echo 'execution terminated, press a key to close.'; read" &
	fi
}

dir=$(cd `dirname "${BASH_SOURCE[0]}"` && pwd)
A_launcher="cd $dir/A; jolie A.ol"
launcher "$A_launcher"
read -p "Launched the starter role, press [Enter] to continue..."
read -p "Launching the last role, press [Enter] to start the choreography..."
B_launcher="cd $dir/B; jolie B.ol"
launcher "$B_launcher"