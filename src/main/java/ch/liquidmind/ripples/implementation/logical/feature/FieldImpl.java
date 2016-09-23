package ch.liquidmind.ripples.implementation.logical.feature;

import ch.liquidmind.ripples.intf.common.naming.OccludableElement;
import ch.liquidmind.ripples.intf.logical.feature.Field;
import ch.liquidmind.ripples.intf.logical.feature.property.FieldProperty;

public class FieldImpl extends FeatureImpl implements Field
{
	private OccludableElement occludedElement;
	private OccludableElement occludingElement;
	private FieldProperty referencingFieldProperty;

	@Override
	public OccludableElement getOccludedElement()
	{
		return occludedElement;
	}

	@Override
	public void setOccludedElement( OccludableElement occludedElement )
	{
		this.occludedElement = occludedElement;
	}

	@Override
	public OccludableElement getOccludingElement()
	{
		return occludingElement;
	}

	@Override
	public void setOccludingElement( OccludableElement occludingElement )
	{
		this.occludingElement = occludingElement;
	}

	@Override
	public FieldProperty getReferencingFieldProperty()
	{
		return referencingFieldProperty;
	}

	@Override
	public void setReferencingFieldProperty( FieldProperty referencingFieldProperty )
	{
		this.referencingFieldProperty = referencingFieldProperty;
	}
}
