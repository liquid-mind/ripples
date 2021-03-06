package ch.liquidmind.ripples.implementation.logical.feature.operation;

import ch.liquidmind.ripples.intf.common.naming.OverloadingGroup;
import ch.liquidmind.ripples.intf.logical.feature.operation.StaticMethod;

public class StaticMethodImpl extends StaticOperationImpl implements StaticMethod
{
	private OverloadingGroup overloadingGroup;
	
	@Override
	public OverloadingGroup getOverloadingGroup()
	{
		return overloadingGroup;
	}

	@Override
	public void setOverloadingGroup( OverloadingGroup overloadingGroup )
	{
		this.overloadingGroup = overloadingGroup;
	}
}
