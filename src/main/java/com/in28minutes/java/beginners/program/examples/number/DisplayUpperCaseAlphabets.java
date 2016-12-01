package com.in28minutes.java.beginners.program.examples.number;

public class DisplayUpperCaseAlphabets {

	public static void showUpperCaseAlphabets(int number) {
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		DisplayUpperCaseAlphabets.showUpperCaseAlphabets(10);
		//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
	}
}
