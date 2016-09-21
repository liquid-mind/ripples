package ch.liquidmind.ripples.common.naming;

public interface OverridableElement extends NamedElement
{
	public OverridableElement getOverridingElement();
	public OverridableElement getOverridenElement();
}
