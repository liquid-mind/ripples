package ch.liquidmind.ripples.implementation.logical.relationship;

import ch.liquidmind.ripples.intf.logical.relationship.Realization;
import ch.liquidmind.ripples.intf.logical.type.classifier.Class;
import ch.liquidmind.ripples.intf.logical.type.classifier.Interface;

public class RealizationImpl extends DirectedRelationshipImpl implements Realization
{
	private Class realizingClass;
	private Interface realizedInterface;

	@Override
	public Class getRealizingClass()
	{
		return realizingClass;
	}

	@Override
	public void setRealizingClass( Class realizingClass )
	{
		this.realizingClass = realizingClass;
	}

	@Override
	public Interface getRealizedInterface()
	{
		return realizedInterface;
	}

	@Override
	public void getRealizedInterface( Interface realizedInterface )
	{
		this.realizedInterface = realizedInterface;
	}
}
