#!/bin/bash

function jarify {
	if [[  $# -eq 0 ]]; then
		"Specified no directory"
	else
		echo "entering $1"
		cd $1
		# removes all .DS_store, macs only
		find . -name "*.DS_Store" -type f -delete
		echo "compiling ..."
		jar cf "$1.jar" .
		# move to main folder
		mv "$1.jar" ../jars
		echo "done"
		cd ..
	fi
}

rm -rf jars
mkdir "jars"

JARLIST=( 'adaptation_manager' 'Client_JFW' 'environment' 'Server_JFW' 'role_supporter' )

echo "Jarify-ing Jorba Framework"
for folder in ${JARLIST[@]}; do
	jarify $folder
done