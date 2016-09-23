package ch.liquidmind.ripples.implementation.logical.relationship;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.logical.relationship.Association;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public class AssociationImpl extends RelationshipImpl implements Association
{
	private Set< Classifier > relatedTypes = new HashSet< Classifier >();
	private Set< Property > ends = new HashSet< Property >();

	@Override
	public Set< Classifier > getRelatedTypes()
	{
		return relatedTypes;
	}

	@Override
	public Set< Property > getEnds()
	{
		return ends;
	}
}
