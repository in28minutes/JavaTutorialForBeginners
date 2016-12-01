package com.in28minutes.java.beginner.junit.examples.loops;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EnhancedForLoopTest {
	/*
	 * Ideally you should not use an inner class with source in a Test. This is
	 * a small test to illustrate for loop.
	 */
	class EnhancedForLoopExample {
		public int findSumOfArray(int[] array) {
			int sum = 0;
			for (int number : array) {// no worry about increment condition etc
				sum += number;// same as sum = sum + number;
			}
			return sum;
		}

		public int findSumOfArrayList(List<Integer> arraylist) {
			Integer sum = 0;
			for (Integer number : arraylist) {// no worry about increment
												// condition etc
				sum += number;// same as sum = sum + number;
			}
			return sum.intValue();
			// Not using sum,number as int variables to prevent auto boxing
			// from decreasing performance
		}

	}

	@Test
	public void sumArrayUsingEnhancedForLoop() {
		EnhancedForLoopExample example = new EnhancedForLoopExample();

		/* Ideally all these examples should be in separate java test methods */
		assertEquals(25, example.findSumOfArray(new int[] { 5, 8, 12 }));
		assertEquals(0, example.findSumOfArray(new int[] { 0, -1, 1 }));
		assertEquals(-15, example.findSumOfArray(new int[] { 0, -1, -14 }));
		assertEquals(0, example.findSumOfArray(new int[] {}));
	}

	@Test
	public void sumArrayListUsingEnhancedForLoop() {
		EnhancedForLoopExample example = new EnhancedForLoopExample();

		/* Ideally all these examples should be in separate java test methods */
		assertEquals(25, example.findSumOfArrayList(Arrays.asList(5, 8, 12)));
		assertEquals(0, example.findSumOfArrayList(Arrays.asList(0, -1, 1)));
		assertEquals(-15, example.findSumOfArrayList(Arrays.asList(0, -1, -14)));

		ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
		assertEquals(0, example.findSumOfArrayList(emptyArrayList));
	}

}