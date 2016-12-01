package com.in28minutes.java.beginners.program.examples.number;

public class SumOfFirstOddNumbers {

	public static int sumOfOddNumbersUpto(int number) {
		int sum = 0;
		for(int i=1;i<=number;i = i + 2){
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(SumOfFirstOddNumbers.sumOfOddNumbersUpto(10));//25
		System.out.println(SumOfFirstOddNumbers.sumOfOddNumbersUpto(1));//1
		System.out.println(SumOfFirstOddNumbers.sumOfOddNumbersUpto(14));//49
		System.out.println(SumOfFirstOddNumbers.sumOfOddNumbersUpto(141));//5041
	}

}
