package com.in28minutes.java.beginners.program.examples.number;

public class FindNCR {
	public static int calculateNCR(int n,
			int r) {
		return factorial(n)/(factorial(n-r)*factorial(r));
	}

	private static int factorial(int number) {
		int factorial = 1;
		for(int i=2;i<=number;i++){
			factorial = factorial * i;
		}
		return factorial;
	}


	public static void main(String[] args) {
		System.out.println(FindNCR
				.calculateNCR(7, 3));//35
	}
}