package com.in28minutes.java.beginners.program.examples.number;

public class Factorial {
	
	public static long factorial(int number) {
		long factorial = 1;
		for(int i=1;i<=number;i++){
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(Factorial.factorial(0));//1
		System.out.println(Factorial.factorial(2));//2
		System.out.println(Factorial.factorial(5));//120
		System.out.println(Factorial.factorial(10));//3628880
	}
}