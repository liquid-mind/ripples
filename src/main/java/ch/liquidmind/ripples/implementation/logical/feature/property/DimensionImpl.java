package ch.liquidmind.ripples.implementation.logical.feature.property;

import ch.liquidmind.ripples.implementation.common.ElementImpl;
import ch.liquidmind.ripples.intf.logical.feature.property.Dimension;
import ch.liquidmind.ripples.intf.logical.feature.property.Property;
import ch.liquidmind.ripples.intf.logical.type.Type;

public class DimensionImpl extends ElementImpl implements Dimension
{
	private Type type;
	private Property parentProperty;
	
	@Override
	public Type getType()
	{
		return type;
	}

	@Override
	public void setType( Type type )
	{
		this.type = type;
	}

	@Override
	public Property getParentProperty()
	{
		return parentProperty;
	}

	@Override
	public void setParentProperty( Property parentProperty )
	{
		this.parentProperty = parentProperty;
	}
}
