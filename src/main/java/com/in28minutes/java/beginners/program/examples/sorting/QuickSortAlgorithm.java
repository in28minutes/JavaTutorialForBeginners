package com.in28minutes.java.beginners.program.examples.sorting;

import java.util.Arrays;

public class QuickSortAlgorithm {

	public static int[] sort(int[] numbers) {
		return quicksort(numbers, 0, numbers.length - 1);
	}

	public static int[] quicksort(int numbers[],int start, int end) {
		int leftIndex = start, rightIndex = end;
		
		int middle = numbers[start + (end - start) / 2];

		//Our aim is to get 
		//all elements less than middle to its left
		//all elements greater than middle to its right		
		while (leftIndex <= rightIndex) {
			
			//on the left side, stop when you find an element
			//greater than middle
			while (numbers[leftIndex] < middle) {
				leftIndex++;
			}
			
			//on the right side, stop when you find an element
			//less than middle
			while (numbers[rightIndex] > middle) {
				rightIndex--;
			}

			//swap the numbers at the indices and increment
			if (leftIndex <= rightIndex) {
				numbers = exchange(numbers,leftIndex, rightIndex);
				leftIndex++;
				rightIndex--;
			}
		}

		//Now we have middle in right place
		//lets sort the left and right arrays seperately
		if (start < rightIndex)
			numbers = quicksort(numbers,start, rightIndex);
		if (leftIndex < end)
			numbers = quicksort(numbers,leftIndex, end);
		
		return numbers;
	}

	private static int[] exchange(int[] numbers,int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		return numbers;
	}

	public static void main(String[] args) {
		int sorted[] = QuickSortAlgorithm.sort(new int[] { 25, 35, 12, 0,
				-1 });
		System.out.println(Arrays.toString(sorted));
	}
}