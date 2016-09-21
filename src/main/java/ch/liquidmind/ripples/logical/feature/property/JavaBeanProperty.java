package ch.liquidmind.ripples.logical.feature.property;

import java.util.Set;

import ch.liquidmind.ripples.common.naming.OverridableElement;
import ch.liquidmind.ripples.logical.feature.operation.VirtualMethod;
import ch.liquidmind.ripples.logical.type.generics.GenericDeclaration;

public interface JavaBeanProperty extends Property, GenericDeclaration, OverridableElement
{
	@ch.liquidmind.inflection.association.annotations.Property( redefines = "features" )
	public Set< VirtualMethod > getMethods();
	
	@ch.liquidmind.inflection.association.annotations.Property( subsets = "methods" )
	public VirtualMethod getReadMethod();

	@ch.liquidmind.inflection.association.annotations.Property( subsets = "methods" )
	public VirtualMethod getWriteMethod();
}
