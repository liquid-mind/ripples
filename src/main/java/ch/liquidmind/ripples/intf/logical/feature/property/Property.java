package ch.liquidmind.ripples.intf.logical.feature.property;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.feature.Feature;
import ch.liquidmind.ripples.intf.logical.feature.StructuralFeature;

public interface Property extends StructuralFeature
{
	public Set< Feature > getFeatures();
	
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "childElements" )
	public Set< Dimension > getDimensions();
	
	public Set< Property > getSubsettedProperties();
	public Set< Property > getSubsettingProperties();

	@ch.liquidmind.inflection.association.annotations.Property( subsets = "subsettedProperties" )
	public Set< Property > getRedefinedProperties();

	@ch.liquidmind.inflection.association.annotations.Property( subsets = "subsettingProperties" )
	public Set< Property > getRedefiningProperties();
}
