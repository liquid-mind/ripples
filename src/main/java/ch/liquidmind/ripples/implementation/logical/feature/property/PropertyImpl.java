package ch.liquidmind.ripples.implementation.logical.feature.property;

import java.util.HashSet;
import java.util.Set;

import ch.liquidmind.ripples.implementation.logical.feature.FeatureImpl;
import ch.liquidmind.ripples.intf.logical.feature.Feature;
import ch.liquidmind.ripples.intf.logical.feature.property.Dimension;
import ch.liquidmind.ripples.intf.logical.feature.property.Property;

public class PropertyImpl extends FeatureImpl implements Property
{
	private Set< Feature > features = new HashSet< Feature >();
	private Set< Dimension > dimensions = new HashSet< Dimension >();
	private Set< Property > subsettedProperties = new HashSet< Property >();
	private Set< Property > subsettingProperties = new HashSet< Property >();
	private Set< Property > redefinedProperties = new HashSet< Property >();
	private Set< Property > redefiningProperties = new HashSet< Property >();

	@Override
	public Set< Feature > getFeatures()
	{
		return features;
	}

	@Override
	public Set< Dimension > getDimensions()
	{
		return dimensions;
	}

	@Override
	public Set< Property > getSubsettedProperties()
	{
		return subsettedProperties;
	}

	@Override
	public Set< Property > getSubsettingProperties()
	{
		return subsettingProperties;
	}

	@Override
	public Set< Property > getRedefinedProperties()
	{
		return redefinedProperties;
	}

	@Override
	public Set< Property > getRedefiningProperties()
	{
		return redefiningProperties;
	}
}
