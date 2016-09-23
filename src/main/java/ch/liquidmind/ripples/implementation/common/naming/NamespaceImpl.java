package ch.liquidmind.ripples.implementation.common.naming;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.common.naming.NamedElement;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public class NamespaceImpl extends NamedElementImpl implements Namespace
{
	private Set< NamedElement > members = new HashSet< NamedElement >();
	
	@Override
	public Set< NamedElement > getMembers()
	{
		return members;
	}

	@Override
	public Set< NamedElement > findMembers( String memberName )
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Set< NamedElement > findMembers( String memberName, Classifier classifier )
	{
		throw new UnsupportedOperationException();
	}
}
