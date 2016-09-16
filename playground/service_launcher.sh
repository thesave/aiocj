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
# services contains the names of the services that implement
# functions of the choreography. E.g., Provided you have two 
# services 'Service1.ol' and 'Service2.ol' in the same folder of this script,
# variable services should look like this 'services=("Service1.ol" "Service2.ol")'
services=()
for i in "${services[@]}"; do
launcher "cd $dir; jolie $i"
done