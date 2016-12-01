package com.in28minutes.java.beginners.program.examples.number;

public class FactorialRecursion {
	
	public static long factorial(int number) {
		if(number<=1) return 1; //base condition
		return number * factorial(number-1);
	}

	public static void main(String[] args) {
		System.out.println(FactorialRecursion.factorial(0));//1
		System.out.println(FactorialRecursion.factorial(2));//2
		System.out.println(FactorialRecursion.factorial(5));//120
		System.out.println(FactorialRecursion.factorial(10));//3628880
	}
}