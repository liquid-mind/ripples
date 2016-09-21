package ch.liquidmind.ripples.logical.type.generics;

import java.util.Set;

import ch.liquidmind.ripples.logical.type.Type;

public interface Wildcard extends GenericType
{
	public Set< Type > getLowerBounds();
	public Set< Type > getUpperBounds();
}
