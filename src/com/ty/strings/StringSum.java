package com.ty.strings;

public class StringSum {
    public static long findSum(String str) {
        long sum = 0;
        String s = "0";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                s += ch;
            } else {
                sum += Long.parseLong(s);
                s = "0";
            }
        }
        return sum + Long.parseLong(s);
    }

    public static void main(String[] args) {
        String str = "10abc20";
        System.out.println(findSum(str));
    }
}
