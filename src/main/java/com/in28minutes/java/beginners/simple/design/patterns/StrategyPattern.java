package com.in28minutes.java.beginners.simple.design.patterns;

/*
 * Separates Strategy - how you do something - into a separate class.
 * Allows easy change of strategy at a later point.
 */
public class StrategyPattern {
	interface Sortable {
		public int[] sort(int[] numbers);
	}

	static class BubbleSort implements Sortable {
		@Override
		public int[] sort(int[] numbers) {
			// Ideally the bubble sort is implemented completely here
			return numbers;
		}
	}

	static class QuickSort implements Sortable {
		@Override
		public int[] sort(int[] numbers) {
			// Ideally the quick sort is implemented completely here
			return numbers;
		}
	}

	static class ComplexClass {
		Sortable sorter;

		ComplexClass(Sortable sorter) {
			this.sorter = sorter;
		}

		void doAComplexThing() {
			int[] values = null; // get from somewhere..
			// ..logic..
			sorter.sort(values);
			// ..logic..
		}
	}

	public static void main(String[] args) {
		ComplexClass complexClassInstance = new ComplexClass(new BubbleSort());
		// This can also be a setter..
		complexClassInstance.doAComplexThing();
	}
}
