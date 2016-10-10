package ch.liquidmind.ripples.implementation.common;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.inflection.association.Class;
import ch.liquidmind.ripples.implementation.common.naming.NamespaceImpl;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.logical.containment.PackagableElement;
import ch.liquidmind.ripples.intf.physical.Module;
import ch.liquidmind.ripples.intf.physical.Resource;

public class ModelImpl extends NamespaceImpl implements Model
{
	private Set< Resource > resources = new HashSet< Resource >();
	private Set< PackagableElement > packagableElements = new HashSet< PackagableElement >();
	
	@Override
	public Class getClass( Object object )
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Set< PackagableElement > getPackagableElements()
	{
		return packagableElements;
	}

	@Override
	public Set< Resource > getResources()
	{
		return resources;
	}

	@Override
	public Set< Module > getModules()
	{
		throw new UnsupportedOperationException();
	}
}
