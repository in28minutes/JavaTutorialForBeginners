package com.in28minutes.java.beginners.program.examples.number;

public class SimpleInterest {
	private static double calculateSimpleInterest(
			double principal, double rate, int years) {
		double amount = principal * (1 + rate * years);
		return amount;
	}

	public static void main(String args[]) {
		System.out.println(SimpleInterest
				.calculateSimpleInterest((double) 10000,
						.10, 20));//30000.0
	}
}
