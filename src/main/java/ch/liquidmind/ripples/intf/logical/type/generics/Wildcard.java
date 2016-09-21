package ch.liquidmind.ripples.intf.logical.type.generics;

import java.util.Set;

import ch.liquidmind.ripples.intf.logical.type.Type;

public interface Wildcard extends GenericType
{
	public Set< Type > getLowerBounds();
	public Set< Type > getUpperBounds();
}
