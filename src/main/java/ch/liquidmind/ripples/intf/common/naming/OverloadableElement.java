package ch.liquidmind.ripples.intf.common.naming;

public interface OverloadableElement extends NamedElement
{
	public OverloadingGroup getOverloadingGroup();
	public void setOverloadingGroup( OverloadingGroup overloadingGroup );
}
