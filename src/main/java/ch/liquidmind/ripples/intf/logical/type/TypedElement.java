package ch.liquidmind.ripples.intf.logical.type;

import ch.liquidmind.ripples.intf.common.Element;

public interface TypedElement extends Element
{
	public Type getType();
	public void setType( Type type );
}
