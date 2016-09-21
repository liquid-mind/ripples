package ch.liquidmind.ripples.intf.logical.containment;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotatableElement;

public interface Package extends Namespace, PackagableElement, AnnotatableElement
{
	@Property( redefines = "members" )
	public Set< PackagableElement > getPackagableElements();
}
