package ch.liquidmind.ripples.common.naming;

public interface OccludableElement extends NamedElement
{
	public OccludableElement getOccludedElement();
	public OccludableElement getOccludingElement();
}
