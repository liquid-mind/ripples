package ch.liquidmind.ripples.physical;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.Namespace;
import ch.liquidmind.ripples.common.naming.OccludableElement;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface Resource extends Namespace, OccludableElement
{
	@Property( subsets = "namespace" )
	public ResourceLoader getParentLoader();

	@Property( subsets = "namespace" )
	public Module getParentModule();
	
	public Classifier getClassifier();
}
