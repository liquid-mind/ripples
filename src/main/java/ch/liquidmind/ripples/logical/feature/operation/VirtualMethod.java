package ch.liquidmind.ripples.logical.feature.operation;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.OverridableElement;
import ch.liquidmind.ripples.logical.feature.property.JavaBeanProperty;

public interface VirtualMethod extends Operation, OverridableElement
{
	@Property( redefines = "referencingProperty" )
	public JavaBeanProperty getReferencingJavaBeanProperty();
}
