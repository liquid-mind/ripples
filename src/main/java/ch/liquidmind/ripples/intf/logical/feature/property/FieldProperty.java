package ch.liquidmind.ripples.intf.logical.feature.property;

import ch.liquidmind.inflection.model.external.Field;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;

public interface FieldProperty extends Property, OccludableElement
{
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "features" )
	public Field getField();
	public void setField( Field field );
}
