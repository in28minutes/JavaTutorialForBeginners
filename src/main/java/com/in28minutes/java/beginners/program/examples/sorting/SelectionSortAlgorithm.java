package com.in28minutes.java.beginners.program.examples.sorting;

import java.util.Arrays;

public class SelectionSortAlgorithm {
	
	public static int[] selectionSort(int[] numbers) {
		int numberCount = numbers.length;
		
		for (int i = 0; i < numberCount; i++) {
			int j = findIndexOfSmallestElement(numbers, i);			
			numbers = swap(numbers, i, j);
		}
		return numbers;
	}

	private static int[] swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
		return numbers;
	}

	private static int findIndexOfSmallestElement(int[] numbers,
			 int from) {
		int smallestNumberIndex = from;
		for (int i = from; i < numbers.length; i++) {
			if (numbers[smallestNumberIndex] > numbers[i]){
				smallestNumberIndex = i;
			}
		}
		return smallestNumberIndex;
	}

	public static void main(String[] args) {
		int sorted[] = SelectionSortAlgorithm.selectionSort(new int[] { 25, 35,
				12, 0, -1 });
		System.out.println(Arrays.toString(sorted));
	}

}
