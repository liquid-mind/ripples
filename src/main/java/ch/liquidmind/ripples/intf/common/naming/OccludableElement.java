package ch.liquidmind.ripples.intf.common.naming;

public interface OccludableElement extends NamedElement
{
	public OccludableElement getOccludedElement();
	public void setOccludedElement( OccludableElement occludedElement );
	public OccludableElement getOccludingElement();
	public void setOccludingElement( OccludableElement occludingElement );
}
