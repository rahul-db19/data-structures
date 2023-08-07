package com.ty.mathematics;

public class PrimeFactors {
	// O(n log n)
	public static void primeFactors(int n) {
		for (int i = 2; i < n; i++) {
			if (Prime.isPrimeHighlyEfficient(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}
		}
	}

	// Theta(n^1/2)
	public static void primeFactorsEff(int n) {
		if (n <= 1)
			return;
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n = n / 2;
		}
		while (n % 3 == 0) {
			System.out.print(3 + " ");
			n = n / 3;
		}
		for (int i = 5; i * i <= n; i = i + 6) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				System.out.print((i + 2) + " ");
				n = n / (i + 2);
			}
		}
		if (n > 3)
			System.out.print(n + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int a = 159450;
		primeFactors(a);
		System.out.println("-------");
		primeFactorsEff(a);
	}
}