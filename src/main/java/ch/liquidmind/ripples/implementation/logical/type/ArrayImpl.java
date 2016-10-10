package ch.liquidmind.ripples.implementation.logical.type;

import ch.liquidmind.ripples.implementation.common.naming.NamedElementImpl;
import ch.liquidmind.ripples.intf.logical.type.Array;
import ch.liquidmind.ripples.intf.logical.type.Type;

public class ArrayImpl extends NamedElementImpl implements Array
{
	private Type componentType;

	@Override
	public Type getComponentType()
	{
		return componentType;
	}

	@Override
	public void setComponentType( Type componentType )
	{
		this.componentType = componentType;
	}

	@Override
	public Object newInstance()
	{
		throw new UnsupportedOperationException();
	}
}
