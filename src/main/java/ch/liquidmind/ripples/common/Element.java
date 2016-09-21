package ch.liquidmind.ripples.common;

import java.util.Set;

import ch.liquidmind.ripples.logical.relationship.Relationship;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface Element
{
	public Element getParentElement();
	public < ChildElementType extends Element > Set< ChildElementType > getChildElements();
	public < ChildElementType extends Element > Set< ChildElementType > findChildElements( Classifier classifier );
	public Set< Relationship > getRelationships();
}
