package ch.liquidmind.ripples.intf.logical.containment;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface NestableElement extends PackagableElement
{
	@Property( subsets = "namespace" )
	public Classifier getParentClassifier();
}
