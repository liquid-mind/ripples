package ch.liquidmind.ripples.logical.relationship;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.logical.type.classifier.Interface;
import ch.liquidmind.ripples.logical.type.classifier.Class;

public interface Realization extends DirectedRelationship
{
	@Property( redefines = "sources" )
	public Class getRealizingClass();

	@Property( redefines = "targets" )
	public Interface getRealizedInterface();
}
