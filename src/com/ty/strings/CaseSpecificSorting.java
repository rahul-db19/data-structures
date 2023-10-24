package com.ty.strings;

import java.util.Arrays;

public class CaseSpecificSorting {
    public static void main(String[] args) {
        String str = "defRTSersUXI";
        System.out.println(caseSorting(str));
    }

    private static String caseSorting(String str) {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if( ch >= 'a' && ch <='z'){
                lower.append(ch);
            }
            else upper.append(ch);
        }
        /*System.out.println(lower);
        System.out.println(upper);*/
        char[] lowerArray = lower.toString().toCharArray();
        char[] upperArray = upper.toString().toCharArray();
        Arrays.sort(lowerArray);
        Arrays.sort(upperArray);
        int lowerIndex = 0;
        int upperIndex = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch<='z'){
                ans.append(lowerArray[lowerIndex]);
                lowerIndex++;
            } else{
                ans.append(upperArray[upperIndex]);
                upperIndex++;
            }
        }
        return ans.toString();
    }
}
