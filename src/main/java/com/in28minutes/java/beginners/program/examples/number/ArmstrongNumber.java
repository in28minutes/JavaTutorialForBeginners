package com.in28minutes.java.beginners.program.examples.number;

public class ArmstrongNumber {

	public static boolean isArmStrongNumber(int number) {
		return number == sumOfCubesOfDigits(number);
	}

	public static int sumOfCubesOfDigits(int number) {
		int remainingNumber = number;
		int sumOfCubes = 0;
		while (remainingNumber != 0) {
			int rightMostDigit = remainingNumber % 10;
			remainingNumber = remainingNumber / 10;
			sumOfCubes = sumOfCubes + rightMostDigit
					* rightMostDigit * rightMostDigit;
		}
		return sumOfCubes;
	}

	public static void main(String[] args) {
		System.out.println(ArmstrongNumber
				.isArmStrongNumber(370));//true
		System.out.println(ArmstrongNumber
				.isArmStrongNumber(123));//false
	}

}
