package ch.liquidmind.ripples.logical.containment;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.Namespace;
import ch.liquidmind.ripples.logical.metadata.AnnotatableElement;

public interface Package extends Namespace, PackagableElement, AnnotatableElement
{
	@Property( redefines = "members" )
	public Set< PackagableElement > getPackagableElements();
}
