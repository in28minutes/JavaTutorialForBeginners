package com.in28minutes.java.beginner.junit.examples.loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForLoopTest {
	/*
	 * Ideally you should not use an inner class with source in a Test. This is
	 * a small test to illustrate for loop.
	 */
	class ForLoopExample {
		public int findSumOfArray(int[] array) {
			/*
			 * There are better ways to loop around an array. We will look at
			 * them as we go on. Using this example as simple illustration of a
			 * do while loop.
			 */
			int sum = 0;
			int lengthOfArray = array.length;
			for (int counter = 0; // initialization and declaration
			counter < lengthOfArray; // condition check
			counter++) { // increment
				sum += array[counter];// same as sum = sum + array[counter]
			}
			return sum;
		}
	}

	@Test
	public void sumArrayUsingForLoop() {
		ForLoopExample example = new ForLoopExample();

		/* Ideally should be in separate java test methods */
		assertEquals(25, example.findSumOfArray(new int[] {
				5, 8, 12 }));
		assertEquals(0, example.findSumOfArray(new int[] {
				0, -1, 1 }));
		assertEquals(-15, example.findSumOfArray(new int[] {
				0, -1, -14 }));
		assertEquals(0, example
				.findSumOfArray(new int[] {}));
	}

	class BreakExampleUsingFor {
		public int findSumUntilZero(int[] array) {
			int sum = 0;
			for (int number : array) {
				if (number == 0) {
					break; //Breaks out of for loop
				}
				sum += number;
			}
			return sum;
		}
	}

	@Test
	public void testBreakExampleUsingFor() {
		BreakExampleUsingFor example = new BreakExampleUsingFor();

		/* Ideally should be in separate java test methods */
		assertEquals(1 + 5 + 3, example
				.findSumUntilZero(new int[] { 1, 5, 3, 0,
						8, 7 }));

		assertEquals(1 + 5 + 3 + 8 + 7,
				example.findSumUntilZero(new int[] { 1, 5,
						3, 8, 7 }));
	}
	
	class ContinueExampleUsingFor {
		public int findSumExcludingNegatives(int[] array) {
			int sum = 0;
			for (int number : array) {
				if (number < 0) {
					continue; //goes to end of loop and continues
				}
				sum += number;
			}
			return sum;
		}
	}

	@Test
	public void testContinueExampleUsingFor() {
		ContinueExampleUsingFor example = new ContinueExampleUsingFor();

		assertEquals(5 + 8 + 7, example
				.findSumExcludingNegatives(new int[] { -1, 5, -3, 0,
						8, 7 }));

	}
}