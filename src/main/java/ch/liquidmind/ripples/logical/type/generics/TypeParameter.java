package ch.liquidmind.ripples.logical.type.generics;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.NamedElement;
import ch.liquidmind.ripples.logical.type.Type;

public interface TypeParameter extends GenericType, NamedElement
{
	@Property( redefines = "namespace" )
	public GenericDeclaration getParentDeclaration();
	
	public Set< Type > getBounds();
}
