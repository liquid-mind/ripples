package ch.liquidmind.ripples.intf.logical.feature.operation;

import java.util.List;
import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.logical.feature.BehavioralFeature;
import ch.liquidmind.ripples.intf.logical.type.Type;
import ch.liquidmind.ripples.intf.logical.type.generics.GenericDeclaration;

public interface Operation extends BehavioralFeature, GenericDeclaration
{
	public Set< Type > getExceptionTypes();
	
	@Property( subsets = "childElements" )
	public List< Parameter > getParameters();
}
