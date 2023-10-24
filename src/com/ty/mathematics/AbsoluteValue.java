package com.ty.mathematics;

public class AbsoluteValue {
    public static int absolute(int n){
        return Math.abs(n);
    }
    public static void main(String[] args) {
        int n = -12;
        System.out.println(absolute(n));
    }
}
