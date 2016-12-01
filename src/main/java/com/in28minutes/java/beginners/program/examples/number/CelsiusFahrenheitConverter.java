package com.in28minutes.java.beginners.program.examples.number;

public class CelsiusFahrenheitConverter {	
	private static double calculateFahrenheit(int celsius) {
		return (celsius*9) / 5.0 + 32;
	}

	public static void main(String args[]) {
		System.out.println(calculateFahrenheit(-40));//-40.0
		System.out.println(calculateFahrenheit(32));//89.6
		System.out.println(calculateFahrenheit(49));//120.2
	}
}