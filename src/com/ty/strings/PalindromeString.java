package com.ty.strings;

public class PalindromeString {
//        private static boolean isPalindrome(String str) {
//        StringBuilder rev = new StringBuilder(str);
//        rev.reverse();
//        return str.contentEquals(rev);
//    }
    private static boolean isPalindromeEfficient(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(int i, int j,
                                       String A) {
        // comparing the two pointers
        if (i >= j) {
            return true;
        }

        // comparing the characters on those pointers
        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }

        // checking everything again recursively
        return isPalindrome(i + 1, j - 1, A);
    }

    public static boolean isPalindrome(String A) {
        return isPalindrome(0, A.length() - 1, A);
    }

    public static void main(String[] args) {
        String str1 = "Malayalam";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindromeEfficient(str1));
        String A = "Malayalam";

        // Convert the string to lowercase
        A = A.toLowerCase();
        boolean str = isPalindrome(A);
        System.out.println(str);
    }
}
