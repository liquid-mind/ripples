package ch.liquidmind.ripples.intf.logical.type;

import ch.liquidmind.ripples.intf.common.naming.NamedElement;

public interface TypedElement extends NamedElement
{
	public Type getType();
	public void setType( Type type );
}
