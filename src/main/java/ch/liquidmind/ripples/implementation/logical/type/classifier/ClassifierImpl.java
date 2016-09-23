package ch.liquidmind.ripples.implementation.logical.type.classifier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ch.liquidmind.ripples.implementation.logical.containment.NestableElementImpl;
import ch.liquidmind.ripples.intf.logical.containment.NestableElement;
import ch.liquidmind.ripples.intf.logical.feature.Feature;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotationInstance;
import ch.liquidmind.ripples.intf.logical.metadata.Documentation;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;
import ch.liquidmind.ripples.intf.logical.type.generics.TypeParameter;
import ch.liquidmind.ripples.intf.physical.Resource;

public class ClassifierImpl extends NestableElementImpl implements Classifier
{
	private Set< AnnotationInstance > annotationInstances = new HashSet< AnnotationInstance >();
	private List< TypeParameter > typeParameters = new ArrayList< TypeParameter >();
	private Documentation documentation;
	private Resource definingResource;
	private Set< NestableElement > nestableElements = new HashSet< NestableElement >();
	private Set< Feature > features = new HashSet< Feature >();

	@Override
	public List< TypeParameter > getTypeParameters()
	{
		return typeParameters;
	}

	@Override
	public Set< AnnotationInstance > getAnnotationInstances()
	{
		return annotationInstances;
	}

	@Override
	public Documentation getDocumentation()
	{
		return documentation;
	}

	@Override
	public Resource getDefiningResource()
	{
		return definingResource;
	}

	@Override
	public void setDefiningResource( Resource definingResource )
	{
		this.definingResource = definingResource;
	}

	@Override
	public Set< NestableElement > getNestableElements()
	{
		return nestableElements;
	}

	@Override
	public Set< Feature > getFeatures()
	{
		return features;
	}
}
