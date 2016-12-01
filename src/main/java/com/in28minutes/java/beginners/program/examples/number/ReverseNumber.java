package com.in28minutes.java.beginners.program.examples.number;

public class ReverseNumber {

	public static int reverse(int number) {
		int remainingNumber = number;
		int reverse = 0;
		while(remainingNumber!=0){
			int remainingRightMostDigit = remainingNumber % 10;
			remainingNumber = remainingNumber/10;
			reverse = reverse * 10 + remainingRightMostDigit;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(ReverseNumber.reverse(10));//1
		System.out.println(ReverseNumber.reverse(1));//1
		System.out.println(ReverseNumber.reverse(14));//41
		System.out.println(ReverseNumber.reverse(141));//141

	}

}
