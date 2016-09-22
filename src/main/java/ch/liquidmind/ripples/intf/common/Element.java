package ch.liquidmind.ripples.intf.common;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.relationship.Relationship;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface Element
{
	public Element getParentElement();
	public void setParentElement( Element parentElement );
	public Set< Element > getChildElements();
	public Set< Relationship > getRelationships();
	public Set< Element > findChildElements( Classifier classifier );
}
