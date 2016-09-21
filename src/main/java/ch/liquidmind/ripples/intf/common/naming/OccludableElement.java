package ch.liquidmind.ripples.intf.common.naming;

public interface OccludableElement extends NamedElement
{
	public OccludableElement getOccludedElement();
	public OccludableElement getOccludingElement();
}
