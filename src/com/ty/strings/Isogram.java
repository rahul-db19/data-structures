package com.ty.strings;

import java.util.HashMap;

// should contain only one character, no repeatation of characters
public class Isogram {
    static boolean isIsogram(String data){
        //Your code here
        HashMap<Character,Integer> map = new HashMap<>();

        int len = data.length();
        int count = 1;
        for(int i=0;i<len;i++)
        {
            char ch = data.charAt(i);
            if(map.containsKey(ch))
            {
                return false;
            }
            else {
                map.put(ch,count);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String  str = "geeks";
        System.out.println(isIsogram(str));
    }
}
