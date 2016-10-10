package ch.liquidmind.ripples.implementation.logical.feature.operation;

import ch.liquidmind.ripples.intf.logical.feature.operation.Constructor;

public class ConstructorImpl extends VirtualOperationImpl implements Constructor
{
	@Override
	public Object newInstance( Object... args )
	{
		throw new UnsupportedOperationException();
	}
}
