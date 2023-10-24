package com.ty.bitwisemagic;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        // There are 7 bitwise operators in Java
        // AND operator &
        System.out.println(a & b);

        // OR operator |
        System.out.println(a | b);

        //XOR operator ^ ( a XOR B = c ) 0 0 1, 0 1 1, 1 0 1, 1 1 1
        System.out.println(a ^ b);

        //NOT operator ~
        int c = 5;
        System.out.println(~c);

        //Left shift <<
    }
}
