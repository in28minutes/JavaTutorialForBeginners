package com.in28minutes.java.beginners.program.examples.number;

public class DisplayLowerCaseAlphabets {

	public static void listLowerCaseAlphabets(int number) {
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		DisplayLowerCaseAlphabets.listLowerCaseAlphabets(10);
		//a b c d e f g h i j k l m n o p q r s t u v w x y z 
	}
}
