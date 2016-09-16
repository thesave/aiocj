#!/bin/bash
echo "--- AIOCJ test choreography launcher ---"
echo "Do you want to launch also the rule server?[y/any]"
read rule_server
sh service_launcher.sh
sh mid_launcher.sh
if [[ $rule_server == "y" ]]; then
sh epp_rules/rules_launcher.sh
fi
sh epp_aioc/aioc_launcher.sh