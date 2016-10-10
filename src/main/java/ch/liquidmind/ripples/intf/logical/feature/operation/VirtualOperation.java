package ch.liquidmind.ripples.intf.logical.feature.operation;

public interface VirtualOperation extends Operation
{
	public Object invokeVirtual( Object target, Object ... args );
	public Object invokeNonVirtual( Object target, Object ... args );
}
