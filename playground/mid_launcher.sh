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
adaptation_manager_launcher="cd $dir/adaptation_manager; jolie main_adaptationManager.ol"
launcher "$adaptation_manager_launcher"
environment_launcher="cd $dir/environment; jolie environment.ol"
launcher "$environment_launcher"