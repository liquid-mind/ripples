package ch.liquidmind.ripples.logical.relationship;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.Element;
import ch.liquidmind.ripples.common.naming.NamedElement;
import ch.liquidmind.ripples.logical.containment.NestableElement;

public interface Relationship extends NamedElement, NestableElement
{
	@Property( isDerivedUnion = true )
	public Set< Element > getRelatedElements();
}
