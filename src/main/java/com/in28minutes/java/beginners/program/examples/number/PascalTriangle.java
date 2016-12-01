package com.in28minutes.java.beginners.program.examples.number;

public class PascalTriangle {

	public static long factorial(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	private static void printPascalTriangle(int numberOfRows) {
		for (int row = 0; row < numberOfRows; row++) {
			for (int i = 0; i <= (numberOfRows - row - 2); i++)
				System.out.print(" ");

			for (int i = 0; i <= row; i++) {

				long numerator = factorial(row);
				long denominator = factorial(i)
						* factorial(row - i);
				long number = numerator / denominator;
				System.out.format("%d ", number);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPascalTriangle(5);
		//	      1 
		//	      1 1 
		//	     1 2 1 
		//	    1 3 3 1 
		//	   1 4 6 4 1 
	}
}