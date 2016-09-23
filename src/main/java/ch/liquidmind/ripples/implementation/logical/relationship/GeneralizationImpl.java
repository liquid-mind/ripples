package ch.liquidmind.ripples.implementation.logical.relationship;

import ch.liquidmind.ripples.intf.logical.relationship.GeneralizableElement;
import ch.liquidmind.ripples.intf.logical.relationship.Generalization;

public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization
{
	private GeneralizableElement specificElement;
	private GeneralizableElement generalElement;

	@Override
	public GeneralizableElement getSpecificElement()
	{
		return specificElement;
	}

	@Override
	public void setSpecificElement( GeneralizableElement specificElement )
	{
		this.specificElement = specificElement;
	}

	@Override
	public GeneralizableElement getGeneralElement()
	{
		return generalElement;
	}

	@Override
	public void setGeneralElement( GeneralizableElement generalElement )
	{
		this.generalElement = generalElement;
	}
}
