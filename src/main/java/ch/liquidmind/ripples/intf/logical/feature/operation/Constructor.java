package ch.liquidmind.ripples.intf.logical.feature.operation;

public interface Constructor extends VirtualOperation
{
	public Object newInstance( Object ... args );
}
