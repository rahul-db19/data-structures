package com.ty.strings;

/*Your task is to implement the function strStr. The function takes two strings as arguments (s,x) and
  locates the occurrence of the string x in the string s. The function returns an integer denoting the
  first occurrence of the string x in s (0 based indexing).*/

public class StrStr {
    public static int strStr(String s, String x) {
        if(x==null) return -1;
        int sLen = s.length();
        int xLen = x.length();

        for (int i = 0; i <= sLen - xLen; i++) {
            int j = 0;
            // Check if substring x is found starting at position i
            while (j < xLen && s.charAt(i + j) == x.charAt(j)) {
                j++;
            }
            // If the while loop completed without breaking, it means we found a match
            if (j == xLen) {
                return i;
            }
        }
        // If we reach this point, no match was found, so return -1
        return -1;
    }

    public static void main(String[] args) {

        String s1 = "GeeksForGeeks";
        String s2 = "rGeeks";
        System.out.println(s1.indexOf(s2));

        System.out.println(strStr("GeeksForGeeks", "rGeeks"));
    }
}
