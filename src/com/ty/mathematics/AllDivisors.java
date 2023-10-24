package com.ty.mathematics;

public class AllDivisors {
	//Theta(n^1/2)
	public static void allDivisors(int n) {
/*		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		for (int i = (int) Math.sqrt(n); i >= 1; i--) {
			if (n % i == 0) {
				System.out.println(n / i);
			}
		}*/
		for(int i = 1; i <= n; i++)
		{
			if( n % i == 0){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		allDivisors(30);
	}
}
