package ch.liquidmind.ripples.logical.feature.property;

import ch.liquidmind.inflection.model.external.Field;
import ch.liquidmind.ripples.common.naming.OccludableElement;

public interface FieldProperty extends Property, OccludableElement
{
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "features" )
	public Field getField();
}
