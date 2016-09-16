include "../../../__rule/AbstractRule.iol"
define onGetStateUpdate
{
	nullProcess
}

define onEvaluateConstraint
{
	if (request.properties.scopeName == "ciao") {
		response = 1
	} else {
		response = 0
	}
}

define dataInit
{
	rule.activityDirectory = "e39cde99-5ec0-46f4-9f71-1ac52166bdf7";
	rule.properties.name[ #rule.properties.name ] = "scopeName"
}

