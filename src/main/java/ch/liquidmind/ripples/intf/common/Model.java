package ch.liquidmind.ripples.intf.common;

import java.util.Set;

import ch.liquidmind.inflection.association.Class;
import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.logical.containment.PackagableElement;
import ch.liquidmind.ripples.intf.physical.Module;
import ch.liquidmind.ripples.intf.physical.Resource;

public interface Model extends Namespace
{
	// Replacement method for Object.getClass().
	public Class getClass( Object object );
	
	@Property( redefines = "members" )
	public Set< Resource > getResources();
	
	@Property( subsets = "resources" )
	public Set< Module > getModules();

	@Property( subsets = "members" )
	public Set< PackagableElement > getPackagableElements();
}
