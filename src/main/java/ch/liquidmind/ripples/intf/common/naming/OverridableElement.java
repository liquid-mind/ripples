package ch.liquidmind.ripples.intf.common.naming;

public interface OverridableElement extends NamedElement
{
	public OverridableElement getOverridingElement();
	public OverridableElement getOverridenElement();
}
