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


package org.epp.impl;

import java.io.IOException;
import java.io.Writer;

public abstract class PrettyPrinter
{
	private int indentation = 0;
	private final Writer writer;
	private final StringBuilder builder = new StringBuilder();
	
	public PrettyPrinter( Writer writer )
	{
		this.writer = writer;
	}
	
	protected void setIndentationLevel( int level )
	{
		this.indentation = level;
	}
	
	protected int indentationLevel()
	{
		return indentation;
	}
	
	protected void indent()
	{
		indentation++;
	}

	protected void unindent()
	{
		indentation--;
	}
	
	protected void writeIndented( String s )
	{
		for( int i = 0; i < indentation; i++ ) {
			builder.append( ' ' );
			builder.append( ' ' );
		}
		builder.append( s );
	}
	
	protected void writeLineIndented( String s )
	{
		for( int i = 0; i < indentation; i++ ) {
			builder.append( '\t' );
		}
		builder.append( s );
		builder.append( '\n' );
	}
	
	protected void writeLine( String s )
	{
		builder.append( s );
		builder.append( '\n' );
	}
	
	protected void writeLine()
	{
		builder.append( '\n' );
	}
	
	protected void write( String s )
	{
		builder.append( s );
	}
	
	protected void flush()
		throws IOException
	{
		writer.write( builder.toString() );
		writer.flush();
	}
}
