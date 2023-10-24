package com.ty.strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean areIsomorphic(String str1, String str2) {
        HashMap<Character, Character> map = new HashMap<>();
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            char p1 = str1.charAt(i);
            char p2 = str2.charAt(i);
            if (map.containsKey(p1)) {
                if (map.get(p1) != p2) return false;
            } else if (map.containsValue(p2)) return false;
            else map.put(p1, p2);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areIsomorphic("aabbcx", "xxyyzn"));
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        /*
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
        */
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
    }
}
