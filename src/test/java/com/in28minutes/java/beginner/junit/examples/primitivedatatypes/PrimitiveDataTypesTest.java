package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimitiveDataTypesTest {
	
	int intMemberVariable;
	
	@SuppressWarnings("unused")
	@Test
	public void primitiveDataTypes(){
		//VariableType VariableName = value;

		byte 	b = 5;			//8  bits -128 to 127
		short 	s = 128;			//16 bits -32,768 to 32,767 
		int 		i = 40000;		//32 bits -2,147,483,648 to 2,147,483,647
		long 	l = 222222222;	//64 bits -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float 	f = 4.0f;		//32 bits NOT VERY PRECISE - dont use for financials
		double 	d = 67.0;		//64 bits NOT VERY PRECISE - dont use for financials
		char 	c = 'A';			//16 bits '\u0000' to '\uffff'
		boolean isTrue = false;	//true or false
	}
		
	public void memberVariablesAreAssignedDefaults(){
		assertEquals(0,intMemberVariable);
		/* DEFAULT VALUE FOR VARIOUS TYPES
 		byte 			0
		short 			0
		int 				0
		long 			0L
		float 			0.0f
		double 			0.0d
		char 			'\u0000'
		String (or any object)   	null
		boolean 			false
		*/
	}

}
