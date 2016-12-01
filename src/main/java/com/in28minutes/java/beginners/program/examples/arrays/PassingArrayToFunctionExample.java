package com.in28minutes.java.beginners.program.examples.arrays;

import java.util.Arrays;

public class PassingArrayToFunctionExample {
	public static int[] reverseArray(int[] numbers) {
		int reverse[] = new int[numbers.length];//Maximum possible number

		for (int i = 0; i < numbers.length; i++) {
			reverse[i] = numbers[numbers.length - i - 1];
		}
		return reverse;
	}

	public static void main(String[] args) {
		int[] reverseArray = PassingArrayToFunctionExample
				.reverseArray(new int[] { 7, 8, 3, 4, 1 });
		System.out.println(Arrays.toString(reverseArray));//[1, 4, 3, 8, 7]

	}
}
