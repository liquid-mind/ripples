package ch.liquidmind.ripples.logical.containment;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface NestableElement extends PackagableElement
{
	@Property( subsets = "namespace" )
	public Classifier getParentClassifier();
}
