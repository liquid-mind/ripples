package ch.liquidmind.ripples.intf.logical.feature.operation;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.OverridableElement;
import ch.liquidmind.ripples.intf.logical.feature.property.JavaBeanProperty;

public interface VirtualMethod extends Operation, OverridableElement
{
	@Property( redefines = "referencingProperty" )
	public JavaBeanProperty getReferencingJavaBeanProperty();
	public void setReferencingJavaBeanProperty( JavaBeanProperty referencingJavaBeanProperty );
}
