package ch.liquidmind.ripples.intf.logical.feature;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;
import ch.liquidmind.ripples.intf.logical.feature.property.FieldProperty;

public interface Field extends StructuralFeature, OccludableElement
{
	@Property( redefines = "referencingProperty" )
	public FieldProperty getReferencingFieldProperty();
}
