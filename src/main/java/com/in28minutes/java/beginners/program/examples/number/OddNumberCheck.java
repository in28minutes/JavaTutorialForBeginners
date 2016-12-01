package com.in28minutes.java.beginners.program.examples.number;

public class OddNumberCheck {
	
	public static boolean isOddNumber(int number) {
		int remainderWhenDividedBy2 = number % 2;
		if(remainderWhenDividedBy2==1){
			return true;
		}else {
			return false;
		}		
	}

	public static boolean isOddNumberSimpler(int number) {
		return (number%2==1);
	}

	public static void main(String[] args) {
		System.out.println(OddNumberCheck.isOddNumber(2));//false
		System.out.println(OddNumberCheck.isOddNumber(5));//true
		System.out.println(OddNumberCheck.isOddNumber(10));//false
	}
}