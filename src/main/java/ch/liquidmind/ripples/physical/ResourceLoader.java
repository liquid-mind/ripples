package ch.liquidmind.ripples.physical;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.Model;
import ch.liquidmind.ripples.common.naming.Namespace;

public interface ResourceLoader extends Namespace
{
	@Property( redefines = "namespace" )
	public Model getParentModel();
	
	@Property( redefines = "members" )
	public Set< Resource > getResources();
	
	@Property( subsets = "resources" )
	public Set< Module > getModules();
}
