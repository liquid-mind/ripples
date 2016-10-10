package ch.liquidmind.ripples.implementation.logical.feature.operation;

import ch.liquidmind.ripples.intf.logical.feature.operation.VirtualOperation;

public class VirtualOperationImpl extends OperationImpl implements VirtualOperation
{
	@Override
	public Object invokeVirtual( Object target, Object... args )
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Object invokeNonVirtual( Object target, Object... args )
	{
		throw new UnsupportedOperationException();
	}
}
