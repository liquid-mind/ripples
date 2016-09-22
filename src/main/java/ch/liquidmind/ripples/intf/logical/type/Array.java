package ch.liquidmind.ripples.intf.logical.type;

public interface Array extends Type
{
	public Type getComponentType();
	public void setComponentType( Type componentType );
}
