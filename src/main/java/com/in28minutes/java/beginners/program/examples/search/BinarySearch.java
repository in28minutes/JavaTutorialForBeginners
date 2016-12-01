package com.in28minutes.java.beginners.program.examples.search;

public class BinarySearch {

	static int binarySearch(int[] sortedArray,
			int numberToSearchFor) {
		int start = 0;
		int end = sortedArray.length - 1;
		int mid;

		while (start <= end) {

			mid = (start + end) / 2;

			if (sortedArray[mid] == numberToSearchFor) {
				return mid;
			}

			if (sortedArray[mid] < numberToSearchFor) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println(BinarySearch.binarySearch(
				new int[] { 5, 6, 7, 8 }, 5));

		System.out.println(BinarySearch.binarySearch(
				new int[] { 5, 6, 7, 8 }, 10));

	}
}
