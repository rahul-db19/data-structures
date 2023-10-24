package com.ty.strings;

public class RotationString {
    private static boolean isRotation(String s1, String s2) {
        return (s1.length() == s2.length() && (s1+s1).contains(s2));
    }
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
        System.out.println(isRotation(str1,str2));
    }
}
