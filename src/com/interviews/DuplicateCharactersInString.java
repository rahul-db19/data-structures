package com.interviews;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "abcdbcabcdee";
//        System.out.println(duplicateCharacter(str));
        duplicateCharacter(str);
    }
    private static void duplicateCharacter(String str) {
        String ans ="";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            } else{
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                Character key = entry.getKey();
                Integer value = entry.getValue();
                ans = ans + key;
                System.out.println(key + " : " + value);
            }
        }
        System.out.println(ans);

//        return ans;
    }
}
