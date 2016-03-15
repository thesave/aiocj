/***************************************************************************
 *   Copyright (C) 2012 by Fabrizio Montesi <famontesi@gmail.com>          *
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

import java.util.LinkedList;
import java.util.List;

import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.util.Pair;

public class MergeResult
{
	private final OLSyntaxNode jolieNode;
	private final List< Pair< String, String > > mergedProcedures;
	
	public MergeResult( OLSyntaxNode jolieNode )
	{
		this.jolieNode = jolieNode;
		this.mergedProcedures = new LinkedList< Pair< String, String > >();
	}
	
	public MergeResult( OLSyntaxNode jolieNode, MergeResult mergeResult )
	{
		this.jolieNode = jolieNode;
		this.mergedProcedures = mergeResult.mergedProcedures;
	}
	
	public OLSyntaxNode jolieNode()
	{
		return jolieNode;
	}
	
	protected void addMergedProcedures( String left, String right )
	{
		mergedProcedures.add( new Pair< String, String >( left, right ) );
	}
	
	public List< Pair< String, String > > mergedProcedures()
	{
		return mergedProcedures;
	}
	
	public void mergeInfo( MergeResult other )
	{
		mergedProcedures.addAll( other.mergedProcedures );
	}
}
