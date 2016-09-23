package ch.liquidmind.ripples.implementation.logical.type.classifier;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.classifier.Class;

public class ClassImpl extends ClassifierImpl implements Class
{
	public Set< Type > realizedInterfaces = new HashSet< Type >();
	private Type baseClass;
	
	@Override
	public Set< Type > getRealizedInterfaces()
	{
		return realizedInterfaces;
	}

	@Override
	public Type getBaseClass()
	{
		return baseClass;
	}

	@Override
	public void setBaseClass( Type baseClass )
	{
		this.baseClass = baseClass;
	}
}
