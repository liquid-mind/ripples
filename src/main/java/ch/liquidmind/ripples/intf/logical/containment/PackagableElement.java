package ch.liquidmind.ripples.intf.logical.containment;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;

public interface PackagableElement extends NamedElement
{
	@Property( subsets = "namespace" )
	public Model getModel();
	public void setModel( Model model );
	
	@Property( subsets = "namespace" )
	public Package getParentPackage();
	public void setParentPackage( Package parentPackage );
}
