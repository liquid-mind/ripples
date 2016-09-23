package ch.liquidmind.ripples.implementation.logical.feature.operation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ch.liquidmind.ripples.implementation.logical.feature.FeatureImpl;
import ch.liquidmind.ripples.intf.logical.feature.operation.Operation;
import ch.liquidmind.ripples.intf.logical.feature.operation.Parameter;
import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.generics.TypeParameter;

public class OperationImpl extends FeatureImpl implements Operation
{
	private List< TypeParameter > typeParameters = new ArrayList< TypeParameter >();
	private Set< Type > exceptionTypes = new HashSet< Type >();
	private List< Parameter > parameters = new ArrayList< Parameter >();
	
	@Override
	public List< TypeParameter > getTypeParameters()
	{
		return typeParameters;
	}

	@Override
	public Set< Type > getExceptionTypes()
	{
		return exceptionTypes;
	}

	@Override
	public List< Parameter > getParameters()
	{
		return parameters;
	}
}
