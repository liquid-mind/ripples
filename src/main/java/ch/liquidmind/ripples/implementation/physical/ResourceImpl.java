package ch.liquidmind.ripples.implementation.physical;

import ch.liquidmind.ripples.implementation.common.naming.NamespaceImpl;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;
import ch.liquidmind.ripples.intf.physical.Module;
import ch.liquidmind.ripples.intf.physical.Resource;
import ch.liquidmind.ripples.intf.physical.ResourceLoader;

public class ResourceImpl extends NamespaceImpl implements Resource
{
	private OccludableElement occludedElement;
	private OccludableElement occludingElement;
	private ResourceLoader parentLoader;
	private Module parentModule;
	private Classifier classifier;

	@Override
	public OccludableElement getOccludedElement()
	{
		return occludedElement;
	}

	@Override
	public void setOccludedElement( OccludableElement occludedElement )
	{
		this.occludedElement = occludedElement;
	}

	@Override
	public OccludableElement getOccludingElement()
	{
		return occludingElement;
	}

	@Override
	public void setOccludingElement( OccludableElement occludingElement )
	{
		this.occludingElement = occludingElement;
	}

	@Override
	public ResourceLoader getParentLoader()
	{
		return parentLoader;
	}

	@Override
	public void setParentLoader( ResourceLoader parentLoader )
	{
		this.parentLoader = parentLoader;
	}

	@Override
	public Module getParentModule()
	{
		return parentModule;
	}

	@Override
	public void setParentModule( Module parentModule )
	{
		this.parentModule = parentModule;
	}

	@Override
	public Classifier getClassifier()
	{
		return classifier;
	}

	@Override
	public void setClassifier( Classifier classifier )
	{
		this.classifier = classifier;
	}
}
