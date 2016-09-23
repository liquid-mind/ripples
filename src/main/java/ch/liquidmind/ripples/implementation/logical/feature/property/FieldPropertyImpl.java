package ch.liquidmind.ripples.implementation.logical.feature.property;

import ch.liquidmind.inflection.model.external.Field;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;
import ch.liquidmind.ripples.intf.logical.feature.property.FieldProperty;

public class FieldPropertyImpl extends PropertyImpl implements FieldProperty
{
	private OccludableElement occludedElement;
	private OccludableElement occludingElement;
	private Field field;

	@Override
	public OccludableElement getOccludedElement()
	{
		return occludedElement;
	}

	@Override
	public void setOccludedElement( OccludableElement occludedElement )
	{
		this.occludedElement = occludedElement;
	}

	@Override
	public OccludableElement getOccludingElement()
	{
		return occludingElement;
	}

	@Override
	public void setOccludingElement( OccludableElement occludingElement )
	{
		this.occludingElement = occludingElement;
	}


	@Override
	public Field getField()
	{
		return field;
	}

	@Override
	public void setField( Field field )
	{
		this.field = field;
	}
}
