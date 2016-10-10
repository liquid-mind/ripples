package ch.liquidmind.ripples.intf.logical.type.classifier;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.type.InstanciableType;
import ch.liquidmind.ripples.intf.logical.type.Type;

public interface Class extends Classifier, InstanciableType
{
	public Set< Type > getRealizedInterfaces();
	public Type getBaseClass();
	public void setBaseClass( Type baseClass );
}
