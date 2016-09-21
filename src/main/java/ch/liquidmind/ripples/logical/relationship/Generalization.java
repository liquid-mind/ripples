package ch.liquidmind.ripples.logical.relationship;

import ch.liquidmind.inflection.association.annotations.Property;

public interface Generalization extends DirectedRelationship
{
	@Property( redefines = "sources" )
	public GeneralizableElement getSpecificType();

	@Property( redefines = "targets" )
	public GeneralizableElement getGeneralType();
}
