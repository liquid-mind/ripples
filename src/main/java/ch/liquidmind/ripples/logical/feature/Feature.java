package ch.liquidmind.ripples.logical.feature;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.NamedElement;
import ch.liquidmind.ripples.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.logical.metadata.DocumentableElement;
import ch.liquidmind.ripples.logical.type.TypedElement;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface Feature extends NamedElement, TypedElement, AnnotatableElement, DocumentableElement
{
	@Property( redefines = "namespace" )
	public Classifier getParentClassifier();
	
	public Property getReferencingProperty();
}
