package ch.liquidmind.ripples.intf.logical.type.generics;

import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface ParameterizedType extends GenericType
{
	public Type getArguments();
	public Classifier getClassifier();
}
