package ch.liquidmind.ripples.implementation.logical.containment;

import ch.liquidmind.ripples.implementation.common.naming.NamespaceImpl;
import ch.liquidmind.ripples.intf.common.Model;
import ch.liquidmind.ripples.intf.logical.containment.PackagableElement;
import ch.liquidmind.ripples.intf.logical.containment.Package;

public class PackagableElementImpl extends NamespaceImpl implements PackagableElement
{
	private Model parentModel;
	private Package parentPackage;

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

	@Override
	public Package getParentPackage()
	{
		return parentPackage;
	}

	@Override
	public void setParentPackage( Package parentPackage )
	{
		this.parentPackage = parentPackage;
	}
}
