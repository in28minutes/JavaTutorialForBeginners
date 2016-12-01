package com.in28minutes.java.beginners.program.examples.number;

public class FindNPR {
	public static int calculateNPR(int n,
			int r) {
		return factorial(n)/factorial(r);
	}

	private static int factorial(int number) {
		int factorial = 1;
		for(int i=2;i<=number;i++){
			factorial = factorial * i;
		}
		return factorial;
	}


	public static void main(String[] args) {
		System.out.println(FindNPR
				.calculateNPR(7, 3));//840
		System.out.println(FindNPR
				.calculateNPR(8, 1));//40320
	}
}