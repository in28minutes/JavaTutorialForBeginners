package com.in28minutes.java.beginner.junit.examples.loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoWhileLoopTest {
	/*
	 * Ideally you should not use an inner class with source in a Test. This is
	 * a small test to illustrate do while loop.
	 */ 
	class DoWhileLoopExample{
		public int findSumOfArray(int[] array){
			/*
			 * There are better ways to loop around an array. 
			 * We will look at them as we go on.  
			 * Using this example as simple illustration of a do while loop.
			 */
			int counter = 0;
			int sum = 0;
			
			int lengthOfArray = array.length;
			
			do{
				sum += array[counter];//same as sum = sum + array[counter]
				counter++;//increment is usually done at the end of do while loop
			}while(counter<lengthOfArray);//condition check at end of do while loop
			
			return sum;
		}
	}
	
	@Test
	public void sumArrayUsingDoWhileLoop(){
		DoWhileLoopExample example = new DoWhileLoopExample();
		/* Ideally all these examples should be in separate java test methods*/
		assertEquals(25, example.findSumOfArray(new int[]{5,8,12}));
		assertEquals(0, example.findSumOfArray(new int[]{0,-1,1}));
		assertEquals(-15, example.findSumOfArray(new int[]{0,-1,-14}));
		
		//COMPILE ERROR!! Next test fails because of how do while loop works
		//throws ArrayIndexOutOfBoundsException
		//assertEquals(0, example.findSumOfArray(new int[]{}));
	}
}