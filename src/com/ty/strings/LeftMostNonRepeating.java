package com.ty.strings;

import java.util.HashMap;

public class LeftMostNonRepeating {
    static char nonrepeatingCharacter(String S){
        int len = S.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char ch = S.charAt(i);
            if(map.containsKey(ch)){
                int frequency = map.get(ch);
                map.put(ch,frequency+1);
            } else {
                map.put(ch,1);
            }
        }
        //hello
        for (int i = 0; i < len; i++) {
            char ch = S.charAt(i);
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '$';
    }

    public static int leftmostNonRepeatingCharacter(String str){
        int[]count = new int[256];
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)]==1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "hellohell";
        System.out.println(nonrepeatingCharacter(str));
        if(leftmostNonRepeatingCharacter(str) == -1){
            System.out.println("$");
        } else{
            System.out.println(str.charAt(leftmostNonRepeatingCharacter(str)));
        }
    }
}
