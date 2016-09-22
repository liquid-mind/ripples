package ch.liquidmind.ripples.intf.logical.feature.property;

import java.util.Set;

import ch.liquidmind.ripples.intf.common.naming.OverridableElement;
import ch.liquidmind.ripples.intf.logical.feature.operation.VirtualMethod;
import ch.liquidmind.ripples.intf.logical.type.generics.GenericDeclaration;

public interface JavaBeanProperty extends Property, GenericDeclaration, OverridableElement
{
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "features" )
	public Set< VirtualMethod > getMethods();
	
	@ch.liquidmind.inflection.association.annotations.Property( subsets = "methods" )
	public VirtualMethod getReadMethod();
	public void setReadMethod( VirtualMethod readMethod );

	@ch.liquidmind.inflection.association.annotations.Property( subsets = "methods" )
	public VirtualMethod getWriteMethod();
	public void setWriteMethod( VirtualMethod writeMethod );
}
