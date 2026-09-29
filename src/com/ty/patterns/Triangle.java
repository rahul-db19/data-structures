package com.ty.patterns;

public class Triangle {

    public static void triangle(int n){
        for (int i=0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printAlphabet(int n){
        for (int i=1; i <= n; i++){
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
        printAlphabet(5);
    }
    
}
