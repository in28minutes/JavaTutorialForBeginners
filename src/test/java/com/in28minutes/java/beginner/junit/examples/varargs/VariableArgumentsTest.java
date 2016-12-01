package com.in28minutes.java.beginner.junit.examples.varargs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VariableArgumentsTest {

	class VariableArgumentsExample {

		public int sum(int... numbers) {
			int sum = 0;
			for(int number:numbers){
				sum += number;
			}
			return sum;
		}
		
	}

	@Test
	public void variableArgumentsTest() {
		VariableArgumentsExample example = new VariableArgumentsExample();
		// called with 3 arguments
		assertEquals(10, example.sum(1, 4, 5));
		// called with 4 arguments
		assertEquals(15, example.sum(3, 2, 4, 6));
		// called with 0 arguments
		assertEquals(0, example.sum());
		
	}
}
