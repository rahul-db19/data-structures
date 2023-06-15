package com.ty.mathematics;
public class SumOfN {
	static int sumOfN(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n+sumOfN(n-1);
		}
	}

	public static void main(String[] args) {

		System.out.println(sumOfN(5));

	}

}
