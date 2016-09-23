package ch.liquidmind.ripples.implementation.logical.feature.operation;

import ch.liquidmind.ripples.intf.common.naming.OverridableElement;
import ch.liquidmind.ripples.intf.logical.feature.operation.VirtualMethod;
import ch.liquidmind.ripples.intf.logical.feature.property.JavaBeanProperty;

public class VirtualMethodImpl extends OperationImpl implements VirtualMethod
{
	private OverridableElement overridingElement;
	private OverridableElement overridenElement;
	private JavaBeanProperty referencingJavaBeanProperty;
	
	@Override
	public OverridableElement getOverridingElement()
	{
		return overridingElement;
	}

	@Override
	public void setOverridingElement( OverridableElement overridingElement )
	{
		this.overridingElement = overridingElement;
	}

	@Override
	public OverridableElement getOverridenElement()
	{
		return overridenElement;
	}

	@Override
	public void setOverridenElement( OverridableElement overridenElement )
	{
		this.overridenElement = overridenElement;
	}

	@Override
	public JavaBeanProperty getReferencingJavaBeanProperty()
	{
		return referencingJavaBeanProperty;
	}

	@Override
	public void setReferencingJavaBeanProperty( JavaBeanProperty referencingJavaBeanProperty )
	{
		this.referencingJavaBeanProperty = referencingJavaBeanProperty;
	}

	@Override
	public Object invoke( Object target, Object... args )
	{
		throw new UnsupportedOperationException();
	}
}
