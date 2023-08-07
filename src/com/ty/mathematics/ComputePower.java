package com.ty.mathematics;

public class ComputePower {
	public static int compute1(int a, int b) {
		int n=1;
		for(int i=1;i<=b;i++) {
			n = n*a;
		}
		return n;
	}
	public static int compute2(int a, int b) {
		if(b==0) {
			return 1;
		}
		int temp = (int) Math.pow(a, b/2);
		temp = temp * temp;
		if(b%2==0) {
			return temp;
		}
		else return temp*a;
	}
	public static void main(String[] args) {
		System.out.println(compute1(13,4));
		System.out.println(compute2(13,4));
	}

}
