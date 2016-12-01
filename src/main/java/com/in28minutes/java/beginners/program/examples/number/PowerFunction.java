package com.in28minutes.java.beginners.program.examples.number;

public class PowerFunction {
	public static long power(int number, int power) {
		long value = 1;
		for(int i=1;i<=power;i++){
			value = value * number;
		}
		return value;
	}

	public static void main(String[] args) {
		System.out.println(PowerFunction
				.power(2, 5));//32
		System.out.println(PowerFunction
				.power(7, 5));//16807
	}
}
