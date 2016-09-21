package ch.liquidmind.ripples.intf.common;

import java.util.Set;

import ch.liquidmind.inflection.association.Class;
import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.logical.containment.PackagableElement;
import ch.liquidmind.ripples.intf.logical.type.classifier.Annotation;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;
import ch.liquidmind.ripples.intf.logical.type.classifier.Enum;
import ch.liquidmind.ripples.intf.logical.type.classifier.Interface;
import ch.liquidmind.ripples.intf.physical.ResourceLoader;

public interface Model extends Namespace
{
	// Replacement methods for Object.getClass().
	public Set< Classifier > getClassifiers( Object object );
	public Class getClass( Object object );
	public Enum getEnum( Object object );
	public Set< Interface > getInterfaces( Object object );
	public Set< Annotation > getAnnotations( Object object );
	
	@Property( subsets = "members" )
	public ResourceLoader getResourceLoader();

	@Property( subsets = "members" )
	public Set< PackagableElement > getPackagableElements();
}
