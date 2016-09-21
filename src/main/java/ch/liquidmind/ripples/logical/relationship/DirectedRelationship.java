package ch.liquidmind.ripples.logical.relationship;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.Element;

public interface DirectedRelationship extends Relationship
{
	@Property( subsets = "relatedElements" )
	public Set< Element > getSources();

	@Property( subsets = "relatedElements" )
	public Set< Element > getTargets();
}
