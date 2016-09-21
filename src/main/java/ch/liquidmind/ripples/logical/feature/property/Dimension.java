package ch.liquidmind.ripples.logical.feature.property;

import ch.liquidmind.ripples.logical.type.TypedElement;

public interface Dimension extends TypedElement
{
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "parentElement" )
	public Property getParentProperty();
}
