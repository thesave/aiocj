The source repository of the [AIOCJ development framework](http://www.cs.unibo.it/projects/jolie/aiocj.html).

AIOCJ is released under the GNU Lesser General Public License v2.1.

### Improvements

- [ ] Add command to Environment Service to print the list of all variables and their values;
- [ ] When checking the applicability of a rule that introduces new roles, first check if the related role_supporter is reachable. In case it is not, report the error and skip the rule;
- [ ] When compiling, if the check for *connectedness* returns an error, ask to the user whether to continue with the compilation or not.

# Separate AIOCJ compilation

### Introduction
The purpose of this feature is to allow the user to choose which roles of the AIOCJ application to compile. Once selected, only the required object code will be produced by the compiler, which will be available in the /epp_aioc folder.

### Implementation
- The changes essentially concern the endpoint projection. First of all in `org.ui.handlers.GenerateJolieHandler.java` was created the structure through which the user can select the roles he wants to compile, using a checkboxes list. These roles are then passed to `org.epp.JolieEpp.java`. The thread of each selected role is then projected, each scope is projected only if the leading role is one chosen by the user.

- The control regarding the imported functions has been set at compile time, no longer on-line, so it is possible not to receive errors in case a function used by a certain role has not been imported, this because it is not possible to predict which roles the user intends to compile.

- Finally the `.getCookie()` has been set as the hash of the .ioc file instead of a randomUUID, this to allow in different compilations to get the same cookie regarding the same compiled file.
