package ch.liquidmind.ripples.implementation.physical;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.implementation.common.naming.NamespaceImpl;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.physical.Module;
import ch.liquidmind.ripples.intf.physical.Resource;
import ch.liquidmind.ripples.intf.physical.ResourceLoader;

public class ResourceLoaderImpl extends NamespaceImpl implements ResourceLoader
{
	private Model parentModel;
	private Set< Resource > resources = new HashSet< Resource >();
	private Set< Module > modules = new HashSet< Module >();
	
	@Override
	public Model getParentModel()
	{
		return parentModel;
	}

	@Override
	public void setParentModel( Model parentModel )
	{
		this.parentModel = parentModel;
	}

	@Override
	public Set< Resource > getResources()
	{
		return resources;
	}

	@Override
	public Set< Module > getModules()
	{
		return modules;
	}
}
