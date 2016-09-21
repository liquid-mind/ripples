package ch.liquidmind.ripples;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;


public class Test
{
	public class Test2< T > {}
	
	public Test2< String > i[][];
	
	public static void main( String[] args ) throws Throwable
	{
		Type type1 = Test.class.getField( "i" ).getGenericType();
		Type type2 = ((GenericArrayType)type1).getGenericComponentType();
		Type type3 = ((GenericArrayType)type2).getGenericComponentType();
	}
}
