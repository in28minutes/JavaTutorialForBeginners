package com.in28minutes.java.beginners.program.examples.sorting;

import java.util.Arrays;

public class BubbleSortAlgorithm {
	public static int[] bubbleSort(int[] numbers) {
		int numberCount = numbers.length;
		for (int i = 0; i < numberCount; i++) {
			for (int j = 0; j < numberCount - 1; j++) {
				int k = j + 1;
				if (numbers[j] > numbers[k]) {
					numbers = swap(numbers, j, k);
				}
			}
		}
		return numbers;
	}

	private static int[] swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
		return numbers;
	}

	public static void main(String[] args) {
		int sorted[] = BubbleSortAlgorithm.bubbleSort(new int[] { 25, 35, 12,
				0, -1 });
		System.out.println(Arrays.toString(sorted));
	}
}