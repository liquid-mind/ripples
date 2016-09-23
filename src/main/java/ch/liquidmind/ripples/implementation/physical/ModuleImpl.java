package ch.liquidmind.ripples.implementation.physical;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.physical.Module;
import ch.liquidmind.ripples.intf.physical.Resource;

public class ModuleImpl extends ResourceImpl implements Module
{
	private Set< Resource > resources = new HashSet< Resource >();

	@Override
	public Set< Resource > getResources()
	{
		return resources;
	}
}
