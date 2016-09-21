package ch.liquidmind.ripples.intf.common.naming;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.Element;

public interface NamedElement extends Element
{
	public String getName();
	
	@Property( subsets = "parentElement" )
	public < T extends Namespace > T getNamespace();
}