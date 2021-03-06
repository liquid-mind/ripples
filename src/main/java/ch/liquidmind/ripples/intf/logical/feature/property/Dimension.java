package ch.liquidmind.ripples.intf.logical.feature.property;

import ch.liquidmind.ripples.intf.logical.type.TypedElement;

public interface Dimension extends TypedElement
{
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "parentElement" )
	public Property getParentProperty();
	public void setParentProperty( Property parentProperty );
}
