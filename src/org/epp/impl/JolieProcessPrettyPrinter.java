/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
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

import java.io.IOException;
import java.io.Writer;

import jolie.lang.parse.ast.OLSyntaxNode;

public class JolieProcessPrettyPrinter extends PrettyPrinter
{
	private final OLSyntaxNode rootNode;
	
	public JolieProcessPrettyPrinter( Writer writer, OLSyntaxNode rootNode )
	{
		super( writer );
		this.rootNode = rootNode;
	}
	
	public void run()
		throws IOException
	{
		JolieProcessPrettyPrinterVisitor visitor = new JolieProcessPrettyPrinterVisitor( this );
		//writeLineIndented( "main" );
		//writeLineIndented( "{" );
		//indent();
		rootNode.accept( visitor );
		//unindent();
		//writeLineIndented( "}" );
		flush();
	}
}
