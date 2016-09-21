package ch.liquidmind.ripples.logical.relationship;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.Element;

public interface Dependency extends DirectedRelationship
{
	@Property( subsets = "sources" )
	public Set< Element > getClients();

	@Property( subsets = "targets" )
	public Set< Element > getSuppliers();
}
