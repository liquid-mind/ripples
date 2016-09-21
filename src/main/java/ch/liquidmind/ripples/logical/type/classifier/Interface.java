package ch.liquidmind.ripples.logical.type.classifier;

import java.util.Set;

public interface Interface extends Classifier
{
	public Set< Interface > getBaseInterfaces();
}
