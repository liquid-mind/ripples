package ch.liquidmind.ripples.implementation.logical.relationship;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.implementation.logical.containment.NestableElementImpl;
import ch.liquidmind.ripples.intf.common.Element;
import ch.liquidmind.ripples.intf.logical.relationship.Relationship;

public class RelationshipImpl extends NestableElementImpl implements Relationship
{
	private Set< Element > relatedElements = new HashSet< Element >();
	
	@Override
	public Set< Element > getRelatedElements()
	{
		return relatedElements;
	}
}
