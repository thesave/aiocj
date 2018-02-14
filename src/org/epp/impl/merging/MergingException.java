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


package org.epp.impl.merging;

import jolie.lang.parse.ast.OLSyntaxNode;

public class MergingException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public MergingException( String string )
	{
		super( string );
	}
	
	public MergingException( OLSyntaxNode left, OLSyntaxNode right )
	{
		this(
			"Could not merge " + left.getClass().getSimpleName()
			+ " with " + right.getClass().getSimpleName()
		);
	}
	
	public MergingException( String originatingThread, MergingException e )
	{
		this( "Thread " + originatingThread + ": " + e.getMessage() );
	}
}

