package ch.liquidmind.ripples.logical.feature.operation;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.NamedElement;
import ch.liquidmind.ripples.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.logical.type.TypedElement;

public interface Parameter extends NamedElement, TypedElement, AnnotatableElement
{
	@Property( subsets = "parentElement" )
	public Operation getParentOperation();
}
