package ch.liquidmind.ripples.intf.common.naming;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.intf.logical.type.classifier.Classifier;

public interface Namespace extends NamedElement
{
	@Property( subsets = "childElements" )
	public Set< NamedElement > getMembers();
	
	// Note that memberName may be either an unqualified or a qualified name,
	// i.e., "Test" or "ch.liquidmind.Test".
	public Set< NamedElement > findMembers( String memberName );
	public Set< NamedElement > findMembers( String memberName, Classifier classifier );
}
