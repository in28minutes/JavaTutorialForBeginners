package com.in28minutes.java.beginners.program.examples.number;

public class SumOfFirstEvenNumbers {

	public static int sumOfEvenNumbersUpto(int number) {
		int sum = 0;
		for(int i=2;i<=number;i = i + 2){
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(SumOfFirstEvenNumbers.sumOfEvenNumbersUpto(10));//30
		System.out.println(SumOfFirstEvenNumbers.sumOfEvenNumbersUpto(1));//0
		System.out.println(SumOfFirstEvenNumbers.sumOfEvenNumbersUpto(14));//56
		System.out.println(SumOfFirstEvenNumbers.sumOfEvenNumbersUpto(141));//4970
	}

}
