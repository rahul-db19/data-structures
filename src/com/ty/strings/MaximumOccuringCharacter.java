package com.ty.strings;

import java.util.Arrays;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(maxOccruringCharacter(str));
    }

    final static int CHAR = 256;

    private static char maxOccruringCharacter(String str) {
        int[] count = new int[CHAR];
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String str1 = new String(arr);
        System.out.println(str1);
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            count[str1.charAt(i)]++;
        }

        int max = -1;
        char result = 0;

        for (int i = 0; i < len; i++) {
            if (max < count[str1.charAt(i)]) {
                max = count[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }
        return result;

    }
}
