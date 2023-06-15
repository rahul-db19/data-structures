package com.ty.mathematics;

public class CountDigit {
//	public static int countDigits(int n) {
//		int res=0;
//		while(n>0) {
//			n = n/10;
//			res++;
//		}
//		return res;
//	}
	public static int countDigits(int n) {
		if(n/10==0)
			return 1;
		return 1+countDigits(n/10);
	}
	public static void main(String[] args) {
		System.out.println(countDigits(98726));
	}

}
