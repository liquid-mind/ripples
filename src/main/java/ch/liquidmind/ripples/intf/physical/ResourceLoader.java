package ch.liquidmind.ripples.intf.physical;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.common.naming.Namespace;

public interface ResourceLoader extends Namespace
{
	@Property( redefines = "namespace" )
	public Model getParentModel();
	public void setParentModel( Model parentModel );
	
	@Property( redefines = "members" )
	public Set< Resource > getResources();
	
	@Property( subsets = "resources" )
	public Set< Module > getModules();
}
