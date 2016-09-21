package ch.liquidmind.ripples.intf.logical.feature;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.intf.logical.metadata.DocumentableElement;
import ch.liquidmind.ripples.intf.logical.type.TypedElement;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface Feature extends NamedElement, TypedElement, AnnotatableElement, DocumentableElement
{
	@Property( redefines = "namespace" )
	public Classifier getParentClassifier();
	
	public Property getReferencingProperty();
}
