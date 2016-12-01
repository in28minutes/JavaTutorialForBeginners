package com.in28minutes.java.beginners.program.examples.number;

public class FibonacciSeriesRecursion {

	public static void generateSeriesUpto(int limit) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber + " " + secondNumber);		
		while(firstNumber<limit){
			int nextNumber = firstNumber + secondNumber;
			System.out.print(" " + nextNumber);		
			firstNumber = secondNumber;
			secondNumber = nextNumber;			
		}
		
	}

	public static void main(String[] args) {
		FibonacciSeriesRecursion.generateSeriesUpto(49);
	}

}
