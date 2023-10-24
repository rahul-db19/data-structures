package com.ty.strings;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String str = "axbbcde";
        String s = "geeks";
        System.out.println(leftmostRepeating(s));
        System.out.println(leftmostRepeatingEfficient(s));
    }

    final static int CHAR = 256;

    private static int leftmostRepeatingEfficient(String str) {
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1) return i;
        }
        return -1;
    }

    private static int leftmostRepeating(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) return i;
            }
        }
        return -1;
    }
}
