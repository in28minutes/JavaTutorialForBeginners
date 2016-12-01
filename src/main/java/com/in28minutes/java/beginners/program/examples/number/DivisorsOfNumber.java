package com.in28minutes.java.beginners.program.examples.number;

public class DivisorsOfNumber {

	public static void printDivisorsOfNumber(int number) {
		for (int i = 1; i < number; i++) {
			boolean isDivisor = (number % i == 0);
			if (isDivisor) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		DivisorsOfNumber.printDivisorsOfNumber(28);//1 2 4 7 14 

	}

}