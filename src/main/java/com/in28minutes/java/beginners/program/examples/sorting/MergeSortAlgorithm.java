package com.in28minutes.java.beginners.program.examples.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {

	public static int[] sort(int[] numbers) {
		return mergesort(numbers, 0, numbers.length - 1);
	}

	private static int[] mergesort(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			numbers = mergesort(numbers, low, middle);
			numbers = mergesort(numbers, middle + 1, high);
			numbers = merge(numbers, low, middle, high);
		}
		return numbers;
	}

	private static int[] merge(int[] numbers, int low, int middle, int high) {

		int[] temp = new int[high + 1];

		//copy numbers to temp
		for (int i = low; i <= high; i++) {
			temp[i] = numbers[i];
		}

		int firstHalfIndex = low;
		int secondHalfIndex = middle + 1;
		int index = low;

		while (firstHalfIndex <= middle && secondHalfIndex <= high) {
			if (temp[firstHalfIndex] <= temp[secondHalfIndex]) {
				numbers[index] = temp[firstHalfIndex];
				firstHalfIndex++;
			} else {
				numbers[index] = temp[secondHalfIndex];
				secondHalfIndex++;
			}
			index++;
		}
		
		//Copy the rest of the first half of the array.
		//second half is not copied as it is already in the array.
		while (firstHalfIndex <= middle) {
			numbers[index] = temp[firstHalfIndex];
			index++;
			firstHalfIndex++;
		}
		return numbers;

	}

	public static void main(String[] args) {
		int sorted[] = MergeSortAlgorithm.sort(new int[] { 25, 35, 12, 0, -1 });
		System.out.println(Arrays.toString(sorted));
	}
}