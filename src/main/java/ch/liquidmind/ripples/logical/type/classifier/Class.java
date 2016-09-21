package ch.liquidmind.ripples.logical.type.classifier;

import java.util.Set;

import ch.liquidmind.ripples.logical.type.Type;

public interface Class extends Classifier
{
	public Set< Type > getRealizedInterfaces();
	public Type getBaseClass();
}
