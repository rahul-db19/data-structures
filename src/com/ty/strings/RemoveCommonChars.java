package com.ty.strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveCommonChars {
    private static String commonChars(String s1, String s2) {
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map.put(ch, 2);
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                ans += ch;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            int count = map.get(ch);
            if (count == 2) {
                ans += ch;
            }
        }
        return (ans.length()==0)?"-1":ans;
    }

    public static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        System.out.println(commonChars(s1, s2));
    }
}
