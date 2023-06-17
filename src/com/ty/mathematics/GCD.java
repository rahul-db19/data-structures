package com.ty.mathematics;

public class GCD {
	public static int min(int a, int b) {
		if(a>b) {
			return b;
		}
		return a;
	}
	//Time complexity O(min(a,b))
	public static int gcdOfTwo(int a,int b) {
		int res = Math.min(a, b);
//		int res = min(a,b);		
		while(res>0) {
			if(a%res==0 && b%res==0) {
				return res;
			}
			res--;
		}
		return res;
	}
	public static int gcdEuclid(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else b=b-a;
		}
		return a;
	}
	//O(log(min(a,b))
	public static int gcdEuclidEfficient(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return gcdEuclidEfficient(b,a%b);
		}
	}
	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		System.out.println("GCD of "+a+" and "+b+" is :" + gcdOfTwo(a,b));
		System.out.println("GCD of "+a+" and "+b+" is :" + gcdEuclid(a,b));
		System.out.println("GCD of "+a+" and "+b+" is :" + gcdEuclidEfficient(a,b));
	}

}
