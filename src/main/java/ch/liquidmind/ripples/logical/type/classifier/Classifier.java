package ch.liquidmind.ripples.logical.type.classifier;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.Namespace;
import ch.liquidmind.ripples.logical.containment.NestableElement;
import ch.liquidmind.ripples.logical.feature.Feature;
import ch.liquidmind.ripples.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.logical.metadata.DocumentableElement;
import ch.liquidmind.ripples.logical.relationship.GeneralizableElement;
import ch.liquidmind.ripples.logical.type.Type;
import ch.liquidmind.ripples.logical.type.generics.GenericDeclaration;
import ch.liquidmind.ripples.physical.Resource;

public interface Classifier extends Namespace, Type, GenericDeclaration, NestableElement, GeneralizableElement, AnnotatableElement, DocumentableElement
{
	public Resource getDefiningResource();
	
	@Property( subsets = "packagableElements" )
	public Set< NestableElement > getNestableElements();
	
	@Property( subsets = "members" )
	public Set< Feature > getFeatures();
}
