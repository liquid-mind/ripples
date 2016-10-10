package ch.liquidmind.ripples.intf.physical;

import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface ClassifierResource extends Resource
{
	public Classifier getClassifier();
	public void setClassifier( Classifier classifier );
}
