package com.in28minutes.java.beginners.program.examples.arrays;

import java.util.Arrays;

public class ArraysHelper {

	public static void main(String[] args) {
		System.out.println(ArraysHelper
				.getMinimumElement(new int[] { 7, 8, 3, 4,
						1 }));//1
		System.out.println(ArraysHelper
				.getMaximumElement(new int[] { 7, 8, 3, 4,
						1 }));//8

		System.out.println(ArraysHelper
				.averageOfNumbers(new int[] { 7, 8, 3, 4,
						1 }));//4.6

		System.out.println(ArraysHelper
				.sumOfNumbers(new int[] { 7, 8, 3, 4,
						1 }));//23

		int[] array = ArraysHelper.insertElement(new int[] {
				7, 8, 3, 4, 1 }, 15, 2);

		System.out.println(Arrays.toString(array));//[7, 8, 15, 3, 4, 1]

		int[] array2 = ArraysHelper.deleteElement(
				new int[] { 7, 8, 3, 4, 1 }, 2);

		System.out.println(Arrays.toString(array2));//[7, 8, 4, 1]

	}

	public static int getMinimumElement(int[] numbers) {
		int minimum = 9999;//Maximum possible number
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minimum) {
				minimum = numbers[i];
			}
		}
		return minimum;
	}

	public static int getMaximumElement(int[] numbers) {
		int maximum = -9999;//Minimum possible number
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		}
		return maximum;
	}

	public static int[] insertElement(int[] numbers,
			int value, int position) {
		//Ideally we should be using an array list :)
		int[] newArray = new int[numbers.length + 1];

		for (int i = 0; i < position; i++) {
			newArray[i] = numbers[i];
		}

		newArray[position] = value;

		for (int i = position; i < numbers.length; i++) {
			newArray[i + 1] = numbers[i];
		}
		return newArray;
	}

	public static int[] deleteElement(int[] numbers,
			int position) {
		//Ideally we should be using an array list :)
		int[] newArray = new int[numbers.length - 1];

		for (int i = 0; i < position; i++) {
			newArray[i] = numbers[i];
		}

		for (int i = position + 1; i < numbers.length; i++) {
			newArray[i - 1] = numbers[i];
		}
		return newArray;
	}

	public static double averageOfNumbers(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return (double)sum/numbers.length;
	}

	public static int sumOfNumbers(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
