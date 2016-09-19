package ch.liquidmind.ripples.logical.type.classifier;

import ch.liquidmind.ripples.common.naming.Namespace;
import ch.liquidmind.ripples.logical.containment.NestableElement;
import ch.liquidmind.ripples.logical.metadata.AnnotatableElement;
import ch.liquidmind.ripples.logical.metadata.DocumentableElement;
import ch.liquidmind.ripples.logical.relationship.GeneralizableElement;
import ch.liquidmind.ripples.logical.type.Type;
import ch.liquidmind.ripples.logical.type.generics.GenericDeclaration;

public interface Classifier extends Namespace, Type, GenericDeclaration, NestableElement, GeneralizableElement, AnnotatableElement, DocumentableElement
{

}
