package ch.liquidmind.ripples.intf.logical.feature.operation;

import ch.liquidmind.ripples.intf.common.naming.OverloadableElement;

public interface StaticMethod extends Operation, OverloadableElement
{
	// Note: we need a runtime variant of IllegalAccessException, IllegalArgumentException
	// and InvocationTargetException (don't want to resort to checked exceptions).
	public Object invoke( Object ... args );
}
