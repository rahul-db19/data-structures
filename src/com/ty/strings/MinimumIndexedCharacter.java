package com.ty.strings;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
//        String s1 = "geeksforgeeks";
        String s1 = "lsdfhwie";
//        String s2 = "set";
        String s2 = "wei";

//        System.out.println(minimumIndex(s1, s2));
        System.out.println(minimumIndexEfficient(s1, s2));
    }

    private static int minimumIndexEfficient(String s1, String s2) {
        HashSet<Character> map = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map.add(ch);
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.contains(ch)) return i;
        }
        return -1;
    }

    private static int minimumIndex(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                char ch2 = s2.charAt(j);
                if (ch1 == ch2) {
                    return i;
                }
            }
        }
        return -1;
    }
}
