package ch.liquidmind.ripples.implementation.logical.feature.property;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ch.liquidmind.ripples.intf.common.naming.OverridableElement;
import ch.liquidmind.ripples.intf.logical.feature.operation.VirtualMethod;
import ch.liquidmind.ripples.intf.logical.feature.property.JavaBeanProperty;
import ch.liquidmind.ripples.intf.logical.type.generics.TypeParameter;

public class JavaBeanPropertyImpl extends PropertyImpl implements JavaBeanProperty
{
	private List< TypeParameter > typeParameters = new ArrayList< TypeParameter >();
	private OverridableElement overridingElement;
	private OverridableElement overridenElement;
	private Set< VirtualMethod > methods = new HashSet< VirtualMethod >();
	private VirtualMethod readMethod;
	private VirtualMethod writeMethod;

	@Override
	public List< TypeParameter > getTypeParameters()
	{
		return typeParameters;
	}

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
	public Set< VirtualMethod > getMethods()
	{
		return methods;
	}

	@Override
	public VirtualMethod getReadMethod()
	{
		return readMethod;
	}

	@Override
	public void setReadMethod( VirtualMethod readMethod )
	{
		this.readMethod = readMethod;
	}

	@Override
	public VirtualMethod getWriteMethod()
	{
		return writeMethod;
	}

	@Override
	public void setWriteMethod( VirtualMethod writeMethod )
	{
		this.writeMethod = writeMethod;
	}
}
