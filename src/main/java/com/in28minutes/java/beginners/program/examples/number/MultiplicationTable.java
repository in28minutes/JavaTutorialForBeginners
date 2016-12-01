package com.in28minutes.java.beginners.program.examples.number;

class MultiplicationTable {

	private static void printMultiplicationTable(
			int number, int upto) {
		for (int c = 1; c <= upto; c++)
			System.out.println(number + "*" + c + " = "
					+ (number * c));
	}

	public static void main(String args[]) {
		MultiplicationTable.printMultiplicationTable(7, 10);
		/*
		 * 7*1 = 7
		7*2 = 14
		7*3 = 21
		7*4 = 28
		7*5 = 35
		7*6 = 42
		7*7 = 49
		7*8 = 56
		7*9 = 63
		7*10 = 70
		 */
	}

}