package com.ty.strings;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "I Like This Question";
        String[] strArr2 = str.split(" ");
        for (int i = strArr2.length - 1; i >= 0; i--) {
            System.out.print(strArr2[i] + " ");
        }
    }
}
