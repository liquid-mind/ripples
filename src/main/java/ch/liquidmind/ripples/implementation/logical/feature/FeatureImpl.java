package ch.liquidmind.ripples.implementation.logical.feature;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.implementation.common.naming.NamedElementImpl;
import ch.liquidmind.ripples.intf.logical.feature.Feature;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotationInstance;
import ch.liquidmind.ripples.intf.logical.metadata.Documentation;
import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public class FeatureImpl extends NamedElementImpl implements Feature
{
	private Type type;
	private Set< AnnotationInstance > annotationInstances = new HashSet< AnnotationInstance >();
	private Documentation documentation;
	private Classifier parentClassifier;
	private Property referencingProperty;
	
	@Override
	public Type getType()
	{
		return type;
	}

	@Override
	public void setType( Type type )
	{
		this.type = type;
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
	public Classifier getParentClassifier()
	{
		return parentClassifier;
	}

	@Override
	public void setParentClassifier( Classifier parentClassifier )
	{
		this.parentClassifier = parentClassifier;
	}

	@Override
	public Property getReferencingProperty()
	{
		return referencingProperty;
	}

	@Override
	public void getReferencingProperty( Property referencingProperty )
	{
		this.referencingProperty = referencingProperty;
	}
}
