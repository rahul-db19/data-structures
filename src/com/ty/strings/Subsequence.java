package com.ty.strings;

public class Subsequence {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ACDC";

        //Iterative solution is better compared to recursive solution since  recursive takes extra space
        int m = str1.length();
        int n = str2.length();
        System.out.println(isSubsequence(str1, str2, m, n));
        System.out.println(isSubsequenceRecursive(str1, str2, m, n));
    }

    private static boolean isSubsequenceRecursive(String str1, String str2, int m, int n) {
        if (n > m) return false;
        if (n == 0) return true;
        if (m == 0) return false;

        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return isSubsequenceRecursive(str1, str2, m - 1, n - 1);
        else return isSubsequenceRecursive(str1, str2, m - 1, n);

    }

    private static boolean isSubsequence(String str1, String str2, int m, int n) {
        if (m < n) return false;
        int j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (str2.charAt(j) == str1.charAt(i)) j++;
        }
        return (j == n);
    }
}
