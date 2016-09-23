package ch.liquidmind.ripples.implementation.common.naming;

import ch.liquidmind.ripples.implementation.common.ElementImpl;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;
import ch.liquidmind.ripples.intf.common.naming.Namespace;

public class NamedElementImpl extends ElementImpl implements NamedElement
{
	private String name;
	private Namespace namespace;
	
	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setName( String name )
	{
		this.name = name;
	}

	@Override
	public Namespace getNamespace()
	{
		return namespace;
	}

	@Override
	public void setNamespace( Namespace namespace )
	{
		this.namespace = namespace;
	}
}
