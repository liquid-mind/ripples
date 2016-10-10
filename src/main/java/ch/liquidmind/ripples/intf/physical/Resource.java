package ch.liquidmind.ripples.intf.physical;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;

public interface Resource extends Namespace, OccludableElement
{
	@Property( subsets = "namespace" )
	public Model getParentModel();
	public void setParentModel( Model parentModel );

	@Property( subsets = "namespace" )
	public Module getParentModule();
	public void setParentModule( Module parentModule );
}
