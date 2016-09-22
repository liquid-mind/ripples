package ch.liquidmind.ripples.intf.common.naming;

public interface OverridableElement extends NamedElement
{
	public OverridableElement getOverridingElement();
	public void setOverridingElement( OverridableElement overridingElement );
	public OverridableElement getOverridenElement();
	public void setOverridenElement( OverridableElement overridenElement );
}
