package com.in28minutes.java.beginners.program.examples.sorting;

import java.util.Arrays;

public class CountingSort {

	private static int[] getOccurancesOfEachNumber(
			int[] numbers, int maxNumber) {
		int[] occurances = new int[maxNumber + 1];

		for (int i = 0; i <= maxNumber; i++) {
			occurances[i] = 0;
		}
		for (int i = 0; i < numbers.length; i++) {
			occurances[numbers[i]] = occurances[numbers[i]] + 1;
		}
		return occurances;
	}

	public static int[] CountSort(int[] numbers,
			int maxNumber) {

		int[] occurances = getOccurancesOfEachNumber(
				numbers, maxNumber);

		return fillOccurancesIntoSortedArray(occurances,
				maxNumber, numbers.length);
	}

	private static int[] fillOccurancesIntoSortedArray(
			int[] occurances, int maxNumber, int length) {
		int sortedNumbers[] = new int[length];

		int sortedNumbersIndex = 0;
		for (int i = 0; i <= maxNumber; i++) {
			for (int occurance = 0; occurance < occurances[i]; occurance++) {
				sortedNumbers[sortedNumbersIndex++] = i;
			}
		}
		return sortedNumbers;
	}

	public static void main(String[] args) {
		int[] sortedArray = CountingSort.CountSort(
				new int[] { 2, 5, 3, 0, 2, 3, 0, 3 }, 5);
		System.out.println(Arrays.toString(sortedArray));
	}
}