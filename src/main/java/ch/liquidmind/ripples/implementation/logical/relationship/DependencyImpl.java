package ch.liquidmind.ripples.implementation.logical.relationship;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.common.Element;
import ch.liquidmind.ripples.intf.logical.relationship.Dependency;

public class DependencyImpl extends DirectedRelationshipImpl implements Dependency
{
	private Set< Element > clients = new HashSet< Element >();
	private Set< Element > suppliers = new HashSet< Element >();

	@Override
	public Set< Element > getClients()
	{
		return clients;
	}

	@Override
	public Set< Element > getSuppliers()
	{
		return suppliers;
	}
}
