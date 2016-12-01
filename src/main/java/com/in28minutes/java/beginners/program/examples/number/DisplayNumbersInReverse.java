package com.in28minutes.java.beginners.program.examples.number;

public class DisplayNumbersInReverse {

	public static void showNumbersInReverseOrder(int number) {
		for(int i=number;i>=1;i--){
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		DisplayNumbersInReverse.showNumbersInReverseOrder(10);
		//10 9 8 7 6 5 4 3 2 1 
	}
}
