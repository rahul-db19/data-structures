package com.ty.mathematics;

public class IterativePowerBinary {
    public static void main(String[] args) {
        int x=2,n=10;
        System.out.println((int)Math.pow( x, n));
        int res = 1;
        while( n > 0 ){
            if( n % 2 != 0 ){
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        System.out.println(res);
    }
}
