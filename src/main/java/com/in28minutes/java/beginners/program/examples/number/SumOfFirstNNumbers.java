package com.in28minutes.java.beginners.program.examples.number;

public class SumOfFirstNNumbers {

	public static int sumOfNumbersUpto(int number) {
		return (number * (number+1))/2;
	}

	public static int sumOfNumbersUptoUsingLoop(int number) {
		int sum = 0;
		for(int i=1;i<=number;i++){
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(SumOfFirstNNumbers.sumOfNumbersUpto(10));//55
		System.out.println(SumOfFirstNNumbers.sumOfNumbersUpto(1));//1
		System.out.println(SumOfFirstNNumbers.sumOfNumbersUpto(14));//105
		System.out.println(SumOfFirstNNumbers.sumOfNumbersUpto(141));//10011
	}

}
