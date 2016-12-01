package com.in28minutes.java.beginner.junit.examples.loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhileLoopTest {
	/*
	 * Ideally you should not use an inner class with source in a Test. This is
	 * a small test to illustrate while loop.
	 */
	class WhileLoopExample {
		public int findSumOfArray(int[] array) {
			/*
			 * There are better ways to loop around an array. We will look at
			 * them as we go on. Using this example as simple illustration of a
			 * while loop.
			 */
			int counter = 0;
			int sum = 0;

			int lengthOfArray = array.length;

			while (counter < lengthOfArray) {// condition check at start of
												// while loop
				sum += array[counter];// same as sum = sum + array[counter]
				counter++;// increment is usually done at the end of while loop
			}
			return sum;
		}
	}

	@Test
	public void sumArrayUsingWhileLoop() {
		WhileLoopExample example = new WhileLoopExample();
		/* Ideally all these examples should be in separate java test methods */
		assertEquals(25, example.findSumOfArray(new int[] {
				5, 8, 12 }));
		assertEquals(0, example.findSumOfArray(new int[] {
				0, -1, 1 }));
		assertEquals(-15, example.findSumOfArray(new int[] {
				0, -1, -14 }));
		assertEquals(0, example
				.findSumOfArray(new int[] {}));
	}

	class BreakExampleUsingWhile {
		public int findSumUntilZero(int[] array) {
			int sum = 0;
			int index = 0;
			while (index < array.length) {
				int number = array[index];
				if (number == 0) {
					break;
				}
				sum += number;
				index++;
			}
			return sum;
		}
	}

	@Test
	public void testBreakExampleUsingWhile() {
		BreakExampleUsingWhile example = new BreakExampleUsingWhile();

		/* Ideally should be in separate java test methods */
		assertEquals(1 + 5 + 3, example
				.findSumUntilZero(new int[] { 1, 5, 3, 0,
						8, 7 }));

		assertEquals(1 + 5 + 3 + 8 + 7,
				example.findSumUntilZero(new int[] { 1, 5,
						3, 8, 7 }));
	}

	class ContinueExampleUsingWhile {
		public int findSumExcludingNegatives(int[] array) {
			int sum = 0;
			int index = 0;
			while (index < array.length) {
				int number = array[index];
				index++; // could use array[index++] to combine
				if (number < 0) {
					continue; // goes to end of loop and continues
				}
				sum += number;
			}
			return sum;
		}
	}

	@Test
	public void testContinueExampleUsingWhile() {
		ContinueExampleUsingWhile example = new ContinueExampleUsingWhile();

		assertEquals(5 + 8 + 7, example
				.findSumExcludingNegatives(new int[] { -1,
						5, -3, 0, 8, 7 }));

	}
}