package com.in28minutes.java.beginners.program.examples.number;

public class FindLCM {
	public static int findLCMOfTwoNumbers(int number1,
			int number2) {
		int smaller, bigger;
		if (number1 > number2) {
			smaller = number1;
			bigger = number2;
		} else {
			smaller = number2;
			bigger = number1;
		}
		for (int i = 1; i <= bigger; i++) {
			if ((smaller * i) % bigger == 0) {
				return i * smaller;
			}
		}
		return -1;
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

	public static int findLCMUsingGCD(int number1,
			int number2) {
		int gcd = findGCDOfTwoNumbers(number1, number2);
		return (number1 * number2) / gcd;
	}

	public static void main(String[] args) {
		System.out.println(FindLCM
				.findLCMOfTwoNumbers(6, 7));
		System.out.println(FindLCM.findLCMOfTwoNumbers(12,
				9));

	}
}