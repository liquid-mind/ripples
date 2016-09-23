package ch.liquidmind.ripples.implementation.logical.containment;

import ch.liquidmind.ripples.intf.logical.containment.NestableElement;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public class NestableElementImpl extends PackagableElementImpl implements NestableElement
{
	private Classifier parentClassifier;

	@Override
	public Classifier getParentClassifier()
	{
		return parentClassifier;
	}

	@Override
	public void setParentClassifier( Classifier parentClassifier )
	{
		this.parentClassifier = parentClassifier;
	}
}
