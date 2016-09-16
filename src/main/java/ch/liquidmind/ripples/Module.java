package ch.liquidmind.ripples;

import ch.liquidmind.inflection.association.annotations.Property;

public interface Module extends NamedElement
{
	@Property( redefines = "parentElement" )
	public TypeLoader parentLoader();
}
