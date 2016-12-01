package com.in28minutes.java.beginners.program.examples.number;

public class FloydTriangle {

	private static void printFloydTriangle(int numberOfRows) {
		int number = 1;
		for (int row = 1; row <= numberOfRows; row++) {
			for (int index = 1; index <= row; index++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printFloydTriangle(5);
		//		1 
		//		2 3 
		//		4 5 6 
		//		7 8 9 10 
		//		11 12 13 14 15 

	}
}