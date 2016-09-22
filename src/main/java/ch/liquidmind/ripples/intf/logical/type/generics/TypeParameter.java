package ch.liquidmind.ripples.intf.logical.type.generics;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;
import ch.liquidmind.ripples.intf.logical.type.Type;

public interface TypeParameter extends GenericType, NamedElement
{
	@Property( redefines = "namespace" )
	public GenericDeclaration getParentDeclaration();
	public void setParentDeclaration( GenericDeclaration parentDeclaration );
	
	public Set< Type > getBounds();
}
