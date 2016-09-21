package ch.liquidmind.ripples.common.naming;

import java.util.Set;

public interface OverloadGroup extends NamedElement
{
	public Set< OverloadableElement > getOverloadedElements();
}
