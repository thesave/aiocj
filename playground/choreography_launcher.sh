#!/bin/bash
dir=$(cd `dirname "${BASH_SOURCE[0]}"` && pwd)
cd $dir
echo "--- AIOCJ test choreography launcher ---"
echo "Do you want to launch also the rule server?[y/any]"
read rule_server
bash service_launcher.sh
bash mid_launcher.sh
if [[ $rule_server == "y" ]]; then
bash epp_rules/rules_launcher.sh
if [[ -d "default_role_supporter" ]]; then
bash default_role_supporter/role_supporter_launcher.sh
fi
if [[ -d "role_supporter" ]]; then
bash role_supporter/role_supporter_launcher.sh
fi
fi
bash epp_aioc/aioc_launcher.sh