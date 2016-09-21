package ch.liquidmind.ripples.intf.logical.metadata;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.common.naming.NamedElement;

public interface DocumentableElement extends NamedElement
{
	@Property( subsets = "childElements" )
	public Documentation getDocumentation();
}
