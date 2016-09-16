package ch.liquidmind.ripples;

import java.util.List;

import ch.liquidmind.inflection.association.Aggregation;
import ch.liquidmind.inflection.association.annotations.Association;
import ch.liquidmind.inflection.association.annotations.Property;

public interface Element
{
	@Association( otherEnd = "childElements" )
	@Property( aggregation = Aggregation.COMPOSITE )
	public Element getParentElement();
	public List< Element > getChildElements();
}
