package ch.liquidmind.ripples.implementation.logical.type.classifier;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.logical.type.classifier.Interface;

public class InterfaceImpl extends ClassifierImpl implements Interface
{
	private Set< Interface > baseInterfaces = new HashSet< Interface >();
	
	@Override
	public Set< Interface > getBaseInterfaces()
	{
		return baseInterfaces;
	}
}
