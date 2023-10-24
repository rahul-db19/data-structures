package com.ty.strings;

import java.util.HashMap;
import java.util.Map;

public class RoughWork {
    public static void main(String[] args) {

        // Count the number of occurrences of each word in a string
        /*String str = "Rahul is a good boy, Rahul is not a bad boy";
        String[] strArr = str.split("\\W");

        HashMap<String, Integer> map = new HashMap<>();
        for (String element : strArr) {
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (Map.Entry<String, Integer> ele : map.entrySet()) {
            if (!(ele.getKey().equals(""))){
                System.out.println(ele.getKey() + " " + ele.getValue());
            }
        }*/

        // Reverse a string without reversing the words
        String str = "Rahul is a good boy";
        String[] strArr = str.split(" ");

        for (int i = strArr.length-1; i >= 0 ; i--) {
            System.out.print(strArr[i]+" ");
        }

        // Find whether the given strings are isomorphic are not
        /*String str1 = "aabbcc";
        String str2 = "xxyyde";

        System.out.println(isomorphic(str1,str2));*/
    }
    private static String isomorphic(String str1, String str2) {
        if(str1.length() != str2.length()) return "Not Isomorphic";
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char s1 = str1.charAt(i);
            char s2 = str2.charAt(i);
            if(map.containsKey(s1)){
                if(map.get(s1) != s2) return "Not Isomorphic";
            } else if(map.containsValue(s2)) return "Not Isomorphic";
            else map.put(s1,s2);
        }
        return "Isomorphic";
    }
}