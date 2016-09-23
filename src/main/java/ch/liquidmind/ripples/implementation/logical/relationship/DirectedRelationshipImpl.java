package ch.liquidmind.ripples.implementation.logical.relationship;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.common.Element;
import ch.liquidmind.ripples.intf.logical.relationship.DirectedRelationship;

public class DirectedRelationshipImpl extends RelationshipImpl implements DirectedRelationship
{
	private Set< Element > sources = new HashSet< Element >();
	private Set< Element > targets = new HashSet< Element >();

	@Override
	public Set< Element > getSources()
	{
		return sources;
	}

	@Override
	public Set< Element > getTargets()
	{
		return targets;
	}
}
