/***************************************************************************
 *   Copyright (C) 2013-2014 by Saverio Giallorenzo <sgiallor@cs.unibo.it> *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/

package org.epp.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

import org.aioc.Aioc;

public class LaunchScripts {
	
	private static Set<PosixFilePermission> lncPerms = new HashSet<PosixFilePermission>();
	static {
		// owner
		lncPerms.add( PosixFilePermission.OWNER_READ );
		lncPerms.add( PosixFilePermission.OWNER_WRITE );
		lncPerms.add( PosixFilePermission.OWNER_EXECUTE );
		// group
		lncPerms.add( PosixFilePermission.GROUP_READ );
		lncPerms.add( PosixFilePermission.GROUP_EXECUTE );
		// others
		lncPerms.add( PosixFilePermission.OTHERS_READ );
	}
	
	public void setPermits( File targetFile ){
		try {
			Files.setPosixFilePermissions( Paths.get( targetFile.getAbsolutePath() ) , lncPerms );
		} catch (IOException e) {
			System.out.println( "An error occurred while trying to set permissions to launcher " + targetFile.getAbsolutePath() );
			e.printStackTrace();
		}
	}

	public void writeRulesLaunchScript( File targetDirectory ) throws IOException{
		String s = getInit();
		s += getAdaptationServerLaunchString();
		// TODO: THIS FILEPATH SEEMS WRONG, DOUBLE // ( / + File.separator )
		File launcherFile = new File( targetDirectory.getAbsolutePath() + "/" + File.separator + "rules_launcher.sh" ); 
		OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( s );
		fileWriter.flush();
		ostream.close();
		setPermits( launcherFile );
	}
	
	public void writeDefaultRoleSuppoterLaunchScript( File targetDirectory ) throws IOException{
		String s = getInit();
		s += getDefaultRoleSupportLaunchString();
		File launcherFile = new File( 
				targetDirectory.getAbsolutePath() + File.separator + "default_role_supporter" + 
				File.separator + "role_supporter_launcher.sh" );
		OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( s );
		fileWriter.flush();
		ostream.close();
		setPermits( launcherFile );
	}
	
	public void writeRoleSuppoterLaunchScript( File targetDirectory ) throws IOException{
		String s = getInit();
		s += getRoleSupportLaunchString();
		File launcherFile = new File( 
			targetDirectory.getAbsolutePath() + File.separator + "role_supporter" + 
			File.separator + "role_supporter_launcher.sh" );
		OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( s );
		fileWriter.flush();
		ostream.close();
		setPermits( launcherFile );
	}
	
	public void writeMidLaunchScript( File targetDirectory ) throws IOException{
		String s = getInit();
		s += getAdapationManagerLaunchString();
		s += getEnvironmentLaunchString();
		File launcherFile = new File ( targetDirectory.getAbsolutePath() + File.separator + "mid_launcher.sh" );
		OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( s );
		fileWriter.flush();
		ostream.close();
		setPermits( launcherFile );
	}
	
//	 public void writeMidLaunchScriptStateless( File targetDirectory ) throws IOException{
//	    String s = getInit();
//	    s += getAdapationManagerLaunchString();
//	    s += getEnvironmentLaunchString();
//	    File launcherFile = new File ( targetDirectory.getAbsolutePath() + File.separator + "mid_launcher.sh" );
//	    OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
//	    Writer fileWriter = new OutputStreamWriter( ostream );
//	    fileWriter.write( s );
//	    fileWriter.flush();
//	    ostream.close();
//	    setPermits( launcherFile );
//	  }
		
	public void writeAIOCLaunchScript( Aioc aioc, File targetDirectory ) throws IOException{
		NameCollector nc = new NameCollector();
		nc.collect( aioc.getChoreography(), null);
		
		String s = getInit();
		Set<String> ledRoles = nc.getRoles();
		ledRoles.remove( aioc.getPreamble().getStarter() );
		// adds the launcher for the starter
		s += getRoleLaunchString( aioc.getPreamble().getStarter() );
		s += "\n" + "read -p \"Launched the starter role, press [Enter] to continue...\"";
		// adds the launcher for led roles
		int remainingRoles = ledRoles.size();
		for( String role : ledRoles ){
			if( remainingRoles == 1 ){
				s += "\n" + "read -p \"Launching the last role, press [Enter] to start the choreography...\"";
			}
			s += getRoleLaunchString( role );
			remainingRoles--;
		}
		File launcherFile = new File ( targetDirectory.getAbsolutePath() + "/"+ File.separator + "aioc_launcher.sh" );
		OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( s );
		fileWriter.flush();
		ostream.close();
		setPermits( launcherFile );
	}
	
	public void writeChoreographyLauncherScript( File targetDirectory ) throws IOException{
		String s = "#!/bin/bash";
		s = appendNewLine( s ,
				"dir=$(cd `dirname \"${BASH_SOURCE[0]}\"` && pwd)",
				"cd $dir",
				"echo \"--- AIOCJ test choreography launcher ---\"",
				"echo \"Do you want to launch also the rule server?[y/any]\"",
				"read rule_server",
				"bash service_launcher.sh",
				"bash mid_launcher.sh",
				"if [[ $rule_server == \"y\" ]]; then",
					"bash epp_rules/rules_launcher.sh",
					"if [[ -d \"default_role_supporter\" ]]; then",
						"bash default_role_supporter/role_supporter_launcher.sh",
					"fi",
					"if [[ -d \"role_supporter\" ]]; then",
						"bash role_supporter/role_supporter_launcher.sh",
					"fi",
				"fi",
				"bash epp_aioc/aioc_launcher.sh"
		);
		File launcherFile = new File ( targetDirectory.getAbsolutePath() + "/"+ File.separator + "choreography_launcher.sh" );
		OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( s );
		fileWriter.flush();
		ostream.close();
		setPermits( launcherFile );
	}
	
	 public void writeChoreographyLauncherScriptStateless( File targetDirectory ) throws IOException{
	    String s = "#!/bin/bash";
	    s = appendNewLine( s ,
	        "dir=$(cd `dirname \"${BASH_SOURCE[0]}\"` && pwd)",
	        "cd $dir",
	        "bash service_launcher.sh",
	        "if [[ $rule_server == \"y\" ]]; then",
	          "bash epp_rules/rules_launcher.sh",
	          "if [[ -d \"default_role_supporter\" ]]; then",
	            "bash default_role_supporter/role_supporter_launcher.sh",
	          "fi",
	          "if [[ -d \"role_supporter\" ]]; then",
	            "bash role_supporter/role_supporter_launcher.sh",
	          "fi",
	        "fi",
	        "bash epp_aioc/aioc_launcher.sh"
	    );
	    File launcherFile = new File ( targetDirectory.getAbsolutePath() + "/"+ File.separator + "choreography_launcher.sh" );
	    OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
	    Writer fileWriter = new OutputStreamWriter( ostream );
	    fileWriter.write( s );
	    fileWriter.flush();
	    ostream.close();
	    setPermits( launcherFile );
	  }
	
	public void writeServiceLauncherScript( File targetDirectory ) throws IOException{
		File f = new File( targetDirectory.getAbsolutePath() + File.separator + "service_launcher.sh" );
		if( !f.exists() ){
			String s = getInit();
			s += getServiceLaunchString();
			File launcherFile = new File( targetDirectory.getAbsolutePath() + File.separator + "service_launcher.sh" );
			OutputStream ostream = new FileOutputStream( launcherFile.getAbsolutePath() );
			Writer fileWriter = new OutputStreamWriter( ostream );
			fileWriter.write( s );
			fileWriter.flush();
			ostream.close();
			setPermits( launcherFile );
		}
	}
	
	private String appendNewLine( String main, String... l ){
		for( String s : l ){
			main += "\n" + s;
		}
		return main;
	}
	
	private String getServiceLaunchString(){
		String s = "";
		s = appendNewLine( s ,
			"# services contains the names of the services that implement",
			"# functions of the choreography. E.g., Provided you have two ",
			"# services 'Service1.ol' and 'Service2.ol' in the same folder of this script,",
			"# variable services should look like this 'services=(\"Service1.ol\" \"Service2.ol\")'",
			"services=()",
			"for i in \"${services[@]}\"; do",
				"launcher \"cd $dir; jolie $i\"",
			"done"
		);
		return s;
	}
	
	private String getRoleLaunchString( String role ){
		return "\n" + role + "_launcher=\"cd $dir/" + role + "; jolie " + role + ".ol\"" +
				"\n" + "launcher \"$" + role + "_launcher\"";
	}
	
	private String getAdapationManagerLaunchString(){
		return "\n" + "adaptation_manager_launcher=\"cd $dir/adaptation_manager; jolie main_adaptationManager.ol\"" +
				"\n" + "launcher \"$adaptation_manager_launcher\"";
	}
	
	private String getEnvironmentLaunchString(){
		return "\n" + "environment_launcher=\"cd $dir/environment; jolie environment.ol\"" +
				"\n" + "launcher \"$environment_launcher\"";
	}
	
	private String getAdaptationServerLaunchString(){
		return "\n" + "adaptation_server_launcher=\"cd $dir/__adaptation_server/servers/server; jolie AdaptationServer.ol\"" +
				"\n" + "launcher \"$adaptation_server_launcher\"";
	}
	
	private String getDefaultRoleSupportLaunchString(){
		return "\n" + "role_support_launcher=\"cd $dir; jolie RoleSupporter.ol\"" +
				"\n" + "launcher \"$role_support_launcher\"";
	}
	
	private String getRoleSupportLaunchString(){
		String s = appendNewLine( "" ,	
			"cd $dir",
			"for rule in */ ; do",
			    "cd $rule",
			    "for role in */ ; do",
			      "cd $role",
			        "role_support_launcher=\"cd $dir/$rule$role; jolie RoleSupporter.ol\"",
			        "launcher \"$role_support_launcher\"",
			        "cd \"..\"",
			    "done",
			    "cd \"..\"",
			"done"
		);
		return s;
	}
	
	private String getInit(){
		return "#!/bin/bash" + "\n" +
				"launcher(){" + "\n" +
				"\t" + "if [ \"$(uname)\" == \"Darwin\" ]; then" + "\n" +
				"osascript <<END" + "\n" +
					"\t" + "tell application \"Terminal\"" + "\n" +
						"\t\t" + "do script \"$1\"" + "\n" +
						"\t" + "end tell" + "\n" +
				"END" + "\n" +
				"\t" + "else" + "\n" +
				"\t\t" + "xterm -e \"$1; echo 'execution terminated, press a key to close.'; read\" &" + "\n" +
				"\t" + "fi" + "\n" +
				"}"+ "\n\n" + 
				"dir=$(cd `dirname \"${BASH_SOURCE[0]}\"` && pwd)";
		}
}