package ch.liquidmind.ripples.intf.common.naming;

import java.util.Set;

public interface OverloadingGroup extends NamedElement
{
	public Set< OverloadableElement > getOverloadedElements();
}
