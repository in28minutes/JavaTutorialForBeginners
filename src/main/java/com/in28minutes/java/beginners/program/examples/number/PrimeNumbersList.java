package com.in28minutes.java.beginners.program.examples.number;

public class PrimeNumbersList {

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

	public static void listPrimeNumbersUpto(int number) {
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void sieveOfEratosthenes(int number) {

		boolean isPrime[] = new boolean[number + 1];

		//Assume every number is prime
		for (int i = 2; i <= number; i++) {
			isPrime[i] = true;
		}

		//Using Sieve of Eratosthenes Mark Non-Primes
		for (int i = 2; i * i <= number; i++) {
			//if number is prime, mark all its multiples of number as non primes
			if (isPrime[i]) {
				for (int j = i; i * j <= number; j++) {
					isPrime[i * j] = false;
				}
			}
		}

		for (int i = 2; i <= number; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumbersList.listPrimeNumbersUpto(100);
		PrimeNumbersList.sieveOfEratosthenes(100);
	}

}
