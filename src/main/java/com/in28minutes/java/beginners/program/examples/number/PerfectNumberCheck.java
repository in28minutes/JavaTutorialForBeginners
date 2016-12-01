package com.in28minutes.java.beginners.program.examples.number;

public class PerfectNumberCheck {

	public static boolean isPerfectNumber(int number) {
		int sumOfDivisors = 0;
		for (int i = 1; i < number; i++) {
			boolean isDivisor = (number % i == 0);
			if (isDivisor) {
				sumOfDivisors += i;
			}
		}
		boolean isPerfectNumber = (sumOfDivisors == number);

		return isPerfectNumber;
	}

	public static void main(String[] args) {
		System.out.println(PerfectNumberCheck
				.isPerfectNumber(6));//true
		System.out.println(PerfectNumberCheck
				.isPerfectNumber(15));//false
		System.out.println(PerfectNumberCheck
				.isPerfectNumber(28));//true
		PerfectNumberCheck.listPerfectNumbersUpto(10000);//6 28 496 8128 

	}

	public static void listPerfectNumbersUpto(int limit) {
		for (int i = 1; i <= limit; i++) {
			if (isPerfectNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
}