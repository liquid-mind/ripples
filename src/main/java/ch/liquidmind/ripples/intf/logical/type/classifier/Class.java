package ch.liquidmind.ripples.intf.logical.type.classifier;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.type.Type;

public interface Class extends Classifier
{
	public Set< Type > getRealizedInterfaces();
	public Type getBaseClass();
}
