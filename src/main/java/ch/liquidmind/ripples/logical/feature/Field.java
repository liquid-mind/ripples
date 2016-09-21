package ch.liquidmind.ripples.logical.feature;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.OccludableElement;
import ch.liquidmind.ripples.logical.feature.property.FieldProperty;

public interface Field extends StructuralFeature, OccludableElement
{
	@Property( redefines = "referencingProperty" )
	public FieldProperty getReferencingFieldProperty();
}
