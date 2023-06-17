package com.ty.mathematics;

public class TrailingZeroesFactorial {
	
	//Naive approach
	public static long fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	public static int findTrailingZeros(int n) {
		if(n<0) {
			return -1;
		}
		int count = 0;
		
		long factorial = fact(n); //causes overflow 
		System.out.println("Factorial is "+factorial);
		while(factorial%10 == 0) {
			count++;
			factorial=factorial/10;
		}
		return count;
	}
	//Efficient approach
	public static int findTrailingZerosEfficient(int n) {
		if(n<0) {
			return -1;
		}
		int count = 0;		
		for(int i=5;n/i>=1;i*=5) {
			count+=n/i;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n = 100;
		//System.out.println("Count of trailing 0s in " + n + " factorial is "+ findTrailingZeros(n));
		System.out.println("Count of trailing 0s in " + n + " factorial is "+ findTrailingZerosEfficient(n));
	}

}
