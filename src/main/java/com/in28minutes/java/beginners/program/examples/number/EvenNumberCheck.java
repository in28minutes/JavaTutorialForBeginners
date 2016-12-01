package com.in28minutes.java.beginners.program.examples.number;

public class EvenNumberCheck {
	
	public static boolean isEvenNumber(int number) {
		int remainderWhenDividedBy2 = number % 2;
		if(remainderWhenDividedBy2==0){
			return true;
		}else {
			return false;
		}		
	}

	public static boolean isEvenNumberSimpler(int number) {
		return (number%2==0);
	}

	public static void main(String[] args) {
		System.out.println(EvenNumberCheck.isEvenNumber(2));//true
		System.out.println(EvenNumberCheck.isEvenNumber(5));//false
		System.out.println(EvenNumberCheck.isEvenNumber(10));//true
	}
}