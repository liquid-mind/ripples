package ch.liquidmind.ripples.intf.logical.feature.operation;

public interface StaticOperation extends Operation
{
	// Note: we need a runtime variant of IllegalAccessException, IllegalArgumentException
	// and InvocationTargetException (don't want to resort to checked exceptions).
	public Object invokeStatic( Object ... args );
}
