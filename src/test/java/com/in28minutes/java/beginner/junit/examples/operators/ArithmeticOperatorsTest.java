package com.in28minutes.java.beginner.junit.examples.operators;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticOperatorsTest {

	@Test
	public void basicArithmetic() {
		int result = 1 + 2;
		assertEquals(3, result);
		/*
		 * What I'm doing from now on is not a good practice in Project *
		 * Reusing local variable for different purpose * Checking multiple
		 * conditions in single test method
		 */

		result = 5 * 4;
		assertEquals(20, result);

		result = 8 / 4;
		assertEquals(2, result);

		result = 5 - 4;
		assertEquals(1, result);

		result = 17 % 4;// modulus
		assertEquals(1, result);
	}

	@Test
	public void shortcutOperators() {
		int sum = 0;
		int number1 = 10;

		sum = sum + number1; // simple addition operation
		assertEquals(10, sum);

		sum = 0;

		sum += number1;// This is same as sum = sum + number1
		assertEquals(10, sum);
		
		// IMPORTANT NOTE : You can use -=, *=, /=, %= also similarly
	}

	@Test
	public void incrementOperators(){
		int number = 0;
		
		number = number + 1;
		assertEquals(1,number);

		number += 1; //shortcut. value of number before is 1. So after adding 1 becomes 2.
		assertEquals(2,number);
		
		number++; //number++; is same as number += 1;
		assertEquals(3,number);
		
		++number; //++number is almost same as number++. 
				  // Look at other tests for the exact difference
				  // between ++number and number++
		assertEquals(4,number);
	}
	
	@Test
	public void preIncrementOperators(){
		int number = 0;
		
		int preIncrementResult = ++number;//++ before operand is pre increment
		
		//number is incremented
		assertEquals(1,number);
		
		//Result after number is incremented is assigned to preIncrementResult
		assertEquals(1,preIncrementResult);
		
		/* NOTE : 
		 * 
		 * preIncrementedResult = ++number; 
		 * 
		 * is same as these two lines of code combined
		 * 
		 * number = number + 1;
		 * preIncrementedResult = number;
		 * 
		 * */
		
		int preDecrementResult = --number;//-- before operand is pre decrement
		
		//number is decremented
		assertEquals(0,number);
		
		//Result after number is decremented is assigned to preDecrementResult
		assertEquals(0,preDecrementResult);
		
	}

	@Test
	public void postIncrementOperators(){
		int number = 0;
		
		int postIncrementResult = number++;//++ after operand is post increment
		
		//value before number is incremented i.e.0 is assigned to postIncrementResult
		assertEquals(0,postIncrementResult);
		
		//number is incremented as usual
		assertEquals(1,number);
		
		
		/* NOTE : 
		 * 
		 * postIncrementResult = number++; 
		 * 
		 * is same as these two lines of code combined
		 * 
		 * postIncrementResult = number;
		 * number = number + 1;
		 * 
		 * */
		
		int postDecrementResult = number--;//-- after operand is post decrement
		
		//value before number is decremented i.e. 1 is assigned to postDecrementResult
		assertEquals(1,postDecrementResult);
		
		//number is decremented
		assertEquals(0,number);
	}

}
