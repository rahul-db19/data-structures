package com.ty.mathematics;
public class Palindrome {
	public static boolean palindrome(int n) {
		int reverse=0;
		int temp=n;
		while(temp!=0) {
			reverse=(reverse*10)+(temp%10);
			temp = temp/10;
		}
		return (reverse==n);
	}
	public static void main(String[] args) {
		int num = 123443321;
		if(palindrome(num)==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}