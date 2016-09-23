package ch.liquidmind.ripples.implementation.common;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.common.Element;
import ch.liquidmind.ripples.intf.logical.relationship.Relationship;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public class ElementImpl implements Element
{
	private Element parentElement;
	private Set< Element > childElements = new HashSet< Element >();
	private Set< Relationship > relationships = new HashSet< Relationship >();

	@Override
	public Element getParentElement()
	{
		return parentElement;
	}

	@Override
	public void setParentElement( Element parentElement )
	{
		this.parentElement = parentElement;
	}

	@Override
	public Set< Element > getChildElements()
	{
		return childElements;
	}

	@Override
	public Set< Relationship > getRelationships()
	{
		return relationships;
	}

	@Override
	public Set< Element > findChildElements( Classifier classifier )
	{
		throw new UnsupportedOperationException();
	}
}
