package com.in28minutes.java.beginners.program.examples.number;

public class LeapYear {
	private static boolean isLeapYear(int year) {
		boolean isYearDivisibleBy4 = (year % 4 == 0);
		boolean isYearDivisibleBy400 = (year % 400 == 0);
		boolean isYearDivisibleBy100 = (year % 100 == 0);
		
		if(isYearDivisibleBy400) return true;
		
		if(isYearDivisibleBy100) return false;
		
		return isYearDivisibleBy4;
	}

	public static void main(String args[]) {
		System.out.println(isLeapYear(2000));//true
		System.out.println(isLeapYear(1904));//true
		System.out.println(isLeapYear(1900));//false
		System.out.println(isLeapYear(1901));//false
	}
}