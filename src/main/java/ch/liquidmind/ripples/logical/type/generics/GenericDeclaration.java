package ch.liquidmind.ripples.logical.type.generics;

import java.util.List;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.NamedElement;

public interface GenericDeclaration extends NamedElement
{
	@Property( subsets = "members" )
	public List< TypeParameter > getTypeParameters();
}
