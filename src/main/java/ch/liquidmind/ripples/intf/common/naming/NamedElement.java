package ch.liquidmind.ripples.intf.common.naming;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.Element;

public interface NamedElement extends Element
{
	public String getName();
	public void setName( String name );
	
	@Property( subsets = "parentElement" )
	public Namespace getNamespace();
	public void setNamespace( Namespace namespace );
}
