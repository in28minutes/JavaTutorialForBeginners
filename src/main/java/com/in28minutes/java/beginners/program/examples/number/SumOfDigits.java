package com.in28minutes.java.beginners.program.examples.number;

public class SumOfDigits {

	public static int sumOfDigits(int number) {
		int remainingNumber = number;
		int sumOfDigits = 0;
		while(remainingNumber!=0){
			int remainingRightMostDigit = remainingNumber % 10;
			sumOfDigits = sumOfDigits + remainingRightMostDigit;
			remainingNumber = remainingNumber / 10;
		}
		return sumOfDigits;
	}
	
	public static void main(String[] args) {
		System.out.println(SumOfDigits.sumOfDigits(10));//1
		System.out.println(SumOfDigits.sumOfDigits(1));//1
		System.out.println(SumOfDigits.sumOfDigits(14));//5
		System.out.println(SumOfDigits.sumOfDigits(141));//6
	}

}
