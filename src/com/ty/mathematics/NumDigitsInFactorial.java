package com.ty.mathematics;
import java.lang.Math;
public class NumDigitsInFactorial {
    public static int digitsInFactorial(int N){

        double res=0.0;
        if(N==1 || N <=0) return 1;
        for(int i=2;i<=N;i++){

// log(n!) = log(n*(n-1)*(n-2).........

//log(5!)=log(1) + log(2)+log(3)+ log(4)+log(5)
            res+= Math.log10(i);
        }
        return (int)Math.floor(res+1);
    }
    public static void main(String[] args) {
        // number of digits in number x = floor(log10(x)+1
        // log(0)=0, log(10)=1, log(100)=2,...

        System.out.println(digitsInFactorial(5));
    }
}
