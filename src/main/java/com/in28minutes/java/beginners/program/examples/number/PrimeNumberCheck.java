package com.in28minutes.java.beginners.program.examples.number;

public class PrimeNumberCheck {

	public static boolean isPrime(int number) {
		
		if (number == 1)
			return false;
		
		for (int divisor = 2; divisor < number; divisor++) {
		//instead of divisor < number, we can be more efficient
		//if we use divisor < squareroot of number
			boolean isNumberDivisibleByDivisor = (number
					% divisor == 0);
			if (isNumberDivisibleByDivisor)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(PrimeNumberCheck.isPrime(1));
		System.out.println(PrimeNumberCheck.isPrime(2));
		System.out.println(PrimeNumberCheck.isPrime(3));
		System.out.println(PrimeNumberCheck.isPrime(4));
		System.out.println(PrimeNumberCheck.isPrime(9));
		System.out.println(PrimeNumberCheck.isPrime(13));
		System.out.println(PrimeNumberCheck.isPrime(49));

	}

}
