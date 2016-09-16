package ch.liquidmind.ripples;

import java.util.List;

import ch.liquidmind.inflection.association.Aggregation;
import ch.liquidmind.inflection.association.annotations.Association;
import ch.liquidmind.inflection.association.annotations.Property;

public interface TypeLoader extends NamedElement
{
	@Association( otherEnd = "parentLoader" )
	@Property( aggregation = Aggregation.COMPOSITE, redefines = "childElements" )
	public List< Module > getModules();
}
