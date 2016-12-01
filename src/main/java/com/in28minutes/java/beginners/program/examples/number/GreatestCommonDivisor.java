package com.in28minutes.java.beginners.program.examples.number;

public class GreatestCommonDivisor {
	public static int findGCDOfTwoNumbersRecursion(
			int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return findGCDOfTwoNumbers(number2, number1
				% number2);
	}

	public static int findGCDOfTwoNumbers(int number1,
			int number2) {
		int remainder1 = number1;
		int remainder2 = number2;
		while (remainder2 != 0) {
			int temp = remainder2;
			remainder2 = remainder1 % remainder2;
			remainder1 = temp;
		}
		return remainder1;
	}

	public static void main(String[] args) {
		System.out.println(findGCDOfTwoNumbers(5, 25));//5
		System.out.println(findGCDOfTwoNumbers(99, 11));//11
		System.out.println(findGCDOfTwoNumbers(30, 60));//30
		System.out.println(findGCDOfTwoNumbers(25, 95));//5
		System.out.println(findGCDOfTwoNumbers(1047, 77));//1
	}
}