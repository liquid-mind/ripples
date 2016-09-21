package ch.liquidmind.ripples.logical.containment;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.Model;
import ch.liquidmind.ripples.common.naming.NamedElement;

public interface PackagableElement extends NamedElement
{
	@Property( subsets = "namespace" )
	public Model getModel();
	
	@Property( subsets = "namespace" )
	public Package getParentPackage();
}
