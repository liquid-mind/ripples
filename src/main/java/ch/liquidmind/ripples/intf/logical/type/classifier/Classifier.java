package ch.liquidmind.ripples.intf.logical.type.classifier;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.logical.containment.NestableElement;
import ch.liquidmind.ripples.intf.logical.feature.Feature;
import ch.liquidmind.ripples.intf.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.intf.logical.metadata.DocumentableElement;
import ch.liquidmind.ripples.intf.logical.relationship.GeneralizableElement;
import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.generics.GenericDeclaration;
import ch.liquidmind.ripples.intf.physical.Resource;

public interface Classifier extends Namespace, Type, GenericDeclaration, NestableElement, GeneralizableElement, AnnotatableElement, DocumentableElement
{
	public Resource getDefiningResource();
	public void setDefiningResource( Resource definingResource );
	
	@Property( subsets = "packagableElements" )
	public Set< NestableElement > getNestableElements();
	
	@Property( subsets = "members" )
	public Set< Feature > getFeatures();
}
