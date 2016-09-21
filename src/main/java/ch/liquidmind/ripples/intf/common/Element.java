package ch.liquidmind.ripples.intf.common;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.relationship.Relationship;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface Element
{
	public Element getParentElement();
	public < ChildElementType extends Element > Set< ChildElementType > getChildElements();
	public < ChildElementType extends Element > Set< ChildElementType > findChildElements( Classifier classifier );
	public Set< Relationship > getRelationships();
}
