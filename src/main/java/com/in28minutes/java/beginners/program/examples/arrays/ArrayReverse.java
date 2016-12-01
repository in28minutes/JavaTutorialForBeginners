package com.in28minutes.java.beginners.program.examples.arrays;

import java.util.Arrays;

public class ArrayReverse {
	public static int[] reverseArray(int[] numbers) {
		int reverse[] = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			int reverseIndex = numbers.length - (i + 1);//+1 to compensate zero index.
			reverse[i] = numbers[reverseIndex];
		}
		return reverse;
	}

	public static int[] reverseArrayWithoutTemp(
			int[] numbers) {
		int length = numbers.length;
		for (int i = 0; i < length / 2; i++) {
			//swap i and length - (i+1)
			int temp = numbers[length - (1 + i)];
			numbers[length - (1 + i)] = numbers[i];
			numbers[i] = temp;
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[] reverseArray = 
				reverseArrayWithoutTemp(new int[] { 7, 8,
						3, 4, 1, 15 });
		System.out.println(Arrays.toString(reverseArray));//[15, 1, 4, 3, 8, 7]

	}
}
