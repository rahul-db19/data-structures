package com.ty.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String result = "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i < first.length(); i++) {
            if( first.charAt(i) != last.charAt(i)){
                break;
            }
            result += first.charAt(i);
        }

        return result.toString();
        
    }

    public static void main(String[] args) {

        String[] strs = new String[] {"dog","racecar","car"};

        System.out.println("Longest common prefix is : "+new LongestCommonPrefix().longestCommonPrefix(strs));
        
    }
    
}
