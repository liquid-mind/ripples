package ch.liquidmind.ripples.intf.logical.feature.operation;

public interface Constructor extends Operation
{
	public Object invoke( Object target, Object ... args );
	public Object newInstance( Object ... args );
}
