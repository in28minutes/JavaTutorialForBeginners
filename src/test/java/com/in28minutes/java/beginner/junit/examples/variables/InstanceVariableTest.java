package com.in28minutes.java.beginner.junit.examples.variables;

import static org.junit.Assert.*;

import org.junit.Test;

public class InstanceVariableTest {
	
	private static final int DEFAULT_VALUE_FOR_INT = 0;

	@Test
	public void instanceVariableDefaultValue(){
		InstanceVariableExample example = new InstanceVariableExample();
		assertEquals(DEFAULT_VALUE_FOR_INT,example.instanceVariable);
		
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
	
	@Test
	public void instanceVariableHasValueUniqueToEachInstance(){
		InstanceVariableExample example1 = new InstanceVariableExample();
		InstanceVariableExample example2 = new InstanceVariableExample();
		
		example1.instanceVariable = 5;
		example2.instanceVariable = 10;
		
		//memberVariable in example1 and example2 has two different values
		assertEquals(5,example1.instanceVariable);
		assertEquals(10,example2.instanceVariable);
	}	
}