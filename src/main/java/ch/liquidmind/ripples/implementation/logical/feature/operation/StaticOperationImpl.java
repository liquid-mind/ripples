package ch.liquidmind.ripples.implementation.logical.feature.operation;

import ch.liquidmind.ripples.intf.logical.feature.operation.StaticOperation;

public class StaticOperationImpl extends OperationImpl implements StaticOperation
{
	@Override
	public Object invokeStatic( Object... args )
	{
		throw new UnsupportedOperationException();
	}
}
