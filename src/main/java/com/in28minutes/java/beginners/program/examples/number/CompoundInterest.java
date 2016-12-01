package com.in28minutes.java.beginners.program.examples.number;

public class CompoundInterest {
	private static double calculateCompoundInterest(
			double principal, double rate, int years) {
		double amount = principal * Math.pow(1 + rate, years);
		return amount;
	}
	
	public static void main(String args[]) {
		System.out.println(calculateCompoundInterest(
				(double) 10000, .10, 20));//67274.99949325611
	}
}
