package com.ty.mathematics;


//Finding prime numbers in the range 2 to n
public class SieveOfEratosthenes {
	//O(n*n^1/3)
	public static void sieveOfEratosthenes(int n) {
		if(n==1) return;
		if(n==2) System.out.println(n);
		if(n==3) System.out.println(n);
		for(int i=2;i<=n;i++) {
			if(Prime.isPrimeHighlyEfficient(i)) {
				System.out.println(i+" ");
			}
		}
	}
	public static void sievePrime(int n) {
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<=n;i++) {
			prime[i]=true;
		}
		for(int i=2;i*i<=n;i++) {
			if(Prime.isPrimeHighlyEfficient(i)) {
				for(int j=2*i;j<=n;j=j+i) {
					prime[j]=false;
				}
			}
		}
		
		for(int i=2;i<prime.length;i++) {
			if(prime[i]) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
//		sieveOfEratosthenes(23);
		sievePrime(23);
	}

}
