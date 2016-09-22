package ch.liquidmind.ripples.intf.physical;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.Namespace;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface Resource extends Namespace, OccludableElement
{
	@Property( subsets = "namespace" )
	public ResourceLoader getParentLoader();
	public void setParentLoader( ResourceLoader parentLoader );

	@Property( subsets = "namespace" )
	public Module getParentModule();
	public void setParentModule( Module parentModule );
	
	public Classifier getClassifier();
	public void setClassifier( Classifier classifier );
}
