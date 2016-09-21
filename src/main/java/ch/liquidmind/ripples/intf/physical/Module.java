package ch.liquidmind.ripples.intf.physical;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;

public interface Module extends Resource
{
	@Property( redefines = "members" )
	public Set< Resource > getResources();
}
