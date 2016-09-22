package ch.liquidmind.ripples.intf.logical.relationship;

import ch.liquidmind.inflection.association.annotations.Property;

public interface Generalization extends DirectedRelationship
{
	@Property( redefines = "sources" )
	public GeneralizableElement getSpecificElement();
	public void setSpecificElement( GeneralizableElement specificElement );

	@Property( redefines = "targets" )
	public GeneralizableElement getGeneralElement();
	public void setGeneralElement( GeneralizableElement generalElement );
}
