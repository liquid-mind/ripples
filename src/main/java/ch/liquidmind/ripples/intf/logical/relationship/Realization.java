package ch.liquidmind.ripples.intf.logical.relationship;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.logical.type.classifier.Class;
import ch.liquidmind.ripples.intf.logical.type.classifier.Interface;

public interface Realization extends DirectedRelationship
{
	@Property( redefines = "sources" )
	public Class getRealizingClass();

	@Property( redefines = "targets" )
	public Interface getRealizedInterface();
}
