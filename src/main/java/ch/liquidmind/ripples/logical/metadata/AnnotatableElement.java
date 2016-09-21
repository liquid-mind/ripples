package ch.liquidmind.ripples.logical.metadata;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.NamedElement;

public interface AnnotatableElement extends NamedElement
{
	@Property( subsets = "childElements" )
	public Set< AnnotationInstance > getAnnotationInstances();
}
