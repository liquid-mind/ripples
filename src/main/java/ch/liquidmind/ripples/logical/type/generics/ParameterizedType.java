package ch.liquidmind.ripples.logical.type.generics;

import ch.liquidmind.ripples.logical.type.Type;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface ParameterizedType extends GenericType
{
	public Type getArguments();
	public Classifier getClassifier();
}
