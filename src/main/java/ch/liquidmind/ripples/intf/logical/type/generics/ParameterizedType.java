package ch.liquidmind.ripples.intf.logical.type.generics;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface ParameterizedType extends GenericType
{
	public Set< Type > getArguments();
	public Classifier getClassifier();
	public void setClassifier( Classifier classifier );
}
