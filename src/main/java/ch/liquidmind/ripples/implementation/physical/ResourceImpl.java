package ch.liquidmind.ripples.implementation.physical;

import ch.liquidmind.ripples.implementation.common.naming.NamespaceImpl;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.common.naming.OccludableElement;
import ch.liquidmind.ripples.intf.physical.Module;
import ch.liquidmind.ripples.intf.physical.Resource;

public class ResourceImpl extends NamespaceImpl implements Resource
{
	private OccludableElement occludedElement;
	private OccludableElement occludingElement;
	private Model parentModel ;
	private Module parentModule;

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
	public Model getParentModel()
	{
		return parentModel;
	}

	@Override
	public void setParentModel( Model parentModel )
	{
		this.parentModel = parentModel;
	}
}
