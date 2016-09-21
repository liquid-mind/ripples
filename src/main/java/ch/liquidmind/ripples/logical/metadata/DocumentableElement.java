package ch.liquidmind.ripples.logical.metadata;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.common.naming.NamedElement;

public interface DocumentableElement extends NamedElement
{
	@Property( subsets = "childElements" )
	public Documentation getDocumentation();
}
