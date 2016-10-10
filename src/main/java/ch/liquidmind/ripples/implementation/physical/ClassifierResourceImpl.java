package ch.liquidmind.ripples.implementation.physical;

import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;
import ch.liquidmind.ripples.intf.physical.ClassifierResource;

public class ClassifierResourceImpl extends ResourceImpl implements ClassifierResource
{
	private Classifier classifier;

	@Override
	public Classifier getClassifier()
	{
		return classifier;
	}

	@Override
	public void setClassifier( Classifier classifier )
	{
		this.classifier = classifier;
	}
}
