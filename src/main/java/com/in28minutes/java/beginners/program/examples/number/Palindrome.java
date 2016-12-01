package com.in28minutes.java.beginners.program.examples.number;

public class Palindrome {

	public static boolean isPalindrome(int number){
		return number == reverse(number);
	}
	
	public static int reverse(int number) {
		int remainingNumber = number;
		int reverse = 0;
		while(remainingNumber!=0){
			int remainingRightMostDigit = remainingNumber % 10;
			remainingNumber = remainingNumber/10;
			reverse = reverse * 10 + remainingRightMostDigit;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome(10));//false
		System.out.println(Palindrome.isPalindrome(1));//true
		System.out.println(Palindrome.isPalindrome(14));//false
		System.out.println(Palindrome.isPalindrome(141));//true
	}

}
