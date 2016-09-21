package ch.liquidmind.ripples.intf.logical.relationship;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.Element;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;
import ch.liquidmind.ripples.intf.logical.containment.NestableElement;

public interface Relationship extends NamedElement, NestableElement
{
	@Property( isDerivedUnion = true )
	public Set< Element > getRelatedElements();
}
