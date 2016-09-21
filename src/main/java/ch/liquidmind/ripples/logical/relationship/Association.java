package ch.liquidmind.ripples.logical.relationship;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Dimension;
import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface Association extends Relationship, GeneralizableElement
{
	@ch.liquidmind.inflection.association.annotations.Property( dimensions = @Dimension( multiplicity = "2" ) )
	public Set< Classifier > getRelatedTypes();

	@ch.liquidmind.inflection.association.annotations.Property( dimensions = @Dimension( multiplicity = "2" ) )
	public Set< Property > getEnds();
}
