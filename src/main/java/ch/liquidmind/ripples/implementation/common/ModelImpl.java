package ch.liquidmind.ripples.implementation.common;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.inflection.association.Class;
import ch.liquidmind.ripples.implementation.common.naming.NamespaceImpl;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.logical.containment.PackagableElement;
import ch.liquidmind.ripples.intf.physical.ResourceLoader;

public class ModelImpl extends NamespaceImpl implements Model
{
	private ResourceLoader resourceLoader;
	private Set< PackagableElement > packagableElements = new HashSet< PackagableElement >();
	
	@Override
	public Class getClass( Object object )
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public ResourceLoader getResourceLoader()
	{
		return resourceLoader;
	}

	@Override
	public void setResourceLoader( ResourceLoader resourceLoader )
	{
		this.resourceLoader = resourceLoader;
	}

	@Override
	public Set< PackagableElement > getPackagableElements()
	{
		return packagableElements;
	}
}
