package com.ty.strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*String s1 = "silent";
        String s2 = "listen";*/

        String s1 = "silence";
        String s2 = "license";

        int p = s1.length();
        int q = s2.length();

//        System.out.println(anagram(s1,s2,p,q));
        System.out.println(anagramEfficient(s1,s2,p,q));
    }
    static final int CHAR = 256;
    private static boolean anagramEfficient(String s1, String s2, int p, int q) {
        if (p != q) return false;

        int count[] = new int[CHAR];
        for(int i=0;i<p;i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++)
            if(count[i]!=0) return false;
        return true;
    }

    private static boolean anagram(String s1, String s2, int p, int q) {
        if( p!= q) return false;

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return (s1.equals(s2));
    }
}
