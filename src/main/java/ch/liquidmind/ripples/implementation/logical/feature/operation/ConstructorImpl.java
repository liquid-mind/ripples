package ch.liquidmind.ripples.implementation.logical.feature.operation;

import ch.liquidmind.ripples.intf.logical.feature.operation.Constructor;

public class ConstructorImpl extends OperationImpl implements Constructor
{
	@Override
	public Object invoke( Object target, Object... args )
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Object newInstance( Object... args )
	{
		throw new UnsupportedOperationException();
	}
}
