/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
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

package org.ui.handlers;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import org.aioc.AiocJ;
import org.epp.JolieEpp;
import org.epp.impl.NameCollector;
import org.epp.EndpointProjectionException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Handler for generating the Jolie Endpoint Projection for the Aioc program
 * in the current window.
 * 
 */
public class GenerateJolieHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public GenerateJolieHandler() {}

	/**
	 * the command has been executed, so extract the needed information
	 * from the application context.
	 */
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorPart e = HandlerUtil.getActiveEditor(event);
		final XtextEditor editor = (XtextEditor) e;
		editor.getDocument().readOnly( new IUnitOfWork.Void<XtextResource>() {
			public void process( XtextResource resource) {
				File srcGenDirectory = new File( editor.getResource().getRawLocation().toOSString() );
				
				JolieEpp s = new JolieEpp( srcGenDirectory.getParentFile() );
							
				String message = "Projection completed successfully on " + srcGenDirectory.getAbsolutePath() ;
				
				// Get the name of each role in the choreography
				AiocJ aiocj = (AiocJ) resource.getParseResult().getRootASTElement();
				
				if(aiocj.getRuleSet().size() == 0) {
					NameCollector nameCollector = new NameCollector();
					nameCollector.collect(aiocj.getAioc().getChoreography(), aiocj.getAioc());
					ArrayList<String> rolesNames = new ArrayList<>();
					for (String roleName : nameCollector.getRoles()) {
						rolesNames.add(roleName);
					}
					
					// Setup and show the check boxes dialog
					ListSelectionDialog dialog = new ListSelectionDialog(window.getShell(), rolesNames, new ArrayContentProvider(), new LabelProvider(), "Roles to compile:");
					dialog.setTitle("Compiler");
					dialog.setInitialSelections(rolesNames.toArray());
					dialog.open();
					s.setRolesFilter(dialog.getResult());
				}
				
				try {
					int warnings = resource.getWarnings().size();
					int errors = resource.getErrors().size();
					if ( warnings + errors > 0 ) {
						message = "Found ";
						if( errors > 0 ){
							message += resource.getErrors().size() + " errors";
							if( warnings > 0 ){ message += " and ";	}
						}
						if( warnings > 0 ){
							message += resource.getWarnings().size() + " warnings";
						}
						message += ", correct to compile.";
					}
					s.epp( aiocj , editor.getDocument().get().hashCode());
				} catch( EndpointProjectionException e ) {
					message = e.getMessage();
				} catch( Exception e ) {
					StringWriter w = new StringWriter();
					PrintWriter p = new PrintWriter( w );
					e.printStackTrace( p );
					message = w.toString();
				}
				
				System.out.println( message );
				
				MessageDialog.openInformation(
					window.getShell(),
					"AIOCJ.ui",
					message
				);
			}
		} );

		return null;
	}
	

}
