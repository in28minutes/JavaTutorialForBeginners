package com.in28minutes.java.beginners.program.examples.number;

public class NumberOfDigits {
	public static int countOfDigits(int number) {
		int remainingNumber = number;
		int countOfDigits = 0;
		while(remainingNumber!=0){
			countOfDigits++;
			remainingNumber = remainingNumber / 10;
		}
		return countOfDigits;
	}
	
	public static void main(String[] args) {
		System.out.println(NumberOfDigits.countOfDigits(10));//2
		System.out.println(NumberOfDigits.countOfDigits(1));//1
		System.out.println(NumberOfDigits.countOfDigits(14));//2
		System.out.println(NumberOfDigits.countOfDigits(141));//3
	}
}
