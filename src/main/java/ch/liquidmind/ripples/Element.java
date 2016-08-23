package ch.liquidmind.ripples;

import java.util.List;

public interface Element
{
	public Element getParentElement();
	public List< Element > getChildElements();
}
