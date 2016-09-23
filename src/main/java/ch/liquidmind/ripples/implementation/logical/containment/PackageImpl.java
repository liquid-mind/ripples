package ch.liquidmind.ripples.implementation.logical.containment;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.intf.logical.containment.PackagableElement;
import ch.liquidmind.ripples.intf.logical.containment.Package;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotationInstance;

public class PackageImpl extends PackagableElementImpl implements Package
{
	private Set< AnnotationInstance > annotationInstances = new HashSet< AnnotationInstance >();
	private Set< PackagableElement > packagableElements = new HashSet< PackagableElement >();
	
	@Override
	public Set< AnnotationInstance > getAnnotationInstances()
	{
		return annotationInstances;
	}

	@Override
	public Set< PackagableElement > getPackagableElements()
	{
		return packagableElements;
	}
}
