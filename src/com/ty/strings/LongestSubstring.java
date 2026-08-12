package com.ty.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLargestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            while (charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(i));

            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        // Implementation for finding longest substring without repeating characters
        int result = lengthOfLargestSubstring(s);
        System.out.println("Maximum length = " + result);
    }

}
