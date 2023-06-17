package com.ty.mathematics;

public class LCM {
	//Time complexity is O(a*b-max(a,b))
	public static int lcm(int a, int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res%a==0 && res%b==0)
				return res;
			res++;
		}
	}
	//Efficient algorithm by using Euclid's algorithm
	// a*b = gcd(a,b)*lcm(a,b) 
	// O(log(min(a,b)))
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else return gcd(b,a%b);
	}
	public static int efficientLcm(int a, int b) {
		if(b==0)
			return a;
		else
			return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		int a = 51;
		int b = 17;
		System.out.println("LCM of "+a+" and "+b+" is : " + lcm(a,b));
		System.out.println("LCM of "+a+" and "+b+" is : " + efficientLcm(a,b));
	}
}
