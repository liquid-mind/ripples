package ch.liquidmind.ripples.common.naming;

import java.util.Set;

import ch.liquidmind.inflection.association.annotations.Property;
import ch.liquidmind.ripples.logical.type.classifier.Classifier;

public interface Namespace extends NamedElement
{
	@Property( subsets = "childElements" )
	public < T extends NamedElement > Set< T > getMembers();
	
	// Note that memberName may be either an unqualified or a qualified name,
	// i.e., "Test" or "ch.liquidmind.Test".
	public < T extends NamedElement > Set< T > findMembers( String memberName );
	public < T extends NamedElement > Set< T > findMembers( String memberName, Classifier classifier );
}
