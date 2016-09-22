package ch.liquidmind.ripples.intf.logical.feature.operation;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.intf.logical.type.TypedElement;

public interface Parameter extends NamedElement, TypedElement, AnnotatableElement
{
	@Property( subsets = "parentElement" )
	public Operation getParentOperation();
	public void setParentOperation( Operation parentOperation );
}
