package com.ty.mathematics;

public class Prime {
	// O(n)
	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	// O(n^1/2)
	public static boolean isPrimeEfficient(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// O(n^1/3)
	public static boolean isPrimeHighlyEfficient(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int a = 27;
		if (isPrimeHighlyEfficient(a)) {
			System.out.println(a + " is a Prime number");
		} else
			System.out.println(a + " is not a Prime number");
	}
}
