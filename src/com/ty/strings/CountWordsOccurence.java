package com.ty.strings;

import java.util.HashMap;

public class CountWordsOccurence {
    public static void main(String[] args) {
        String str = "Rahul is a good boy, Rahul is not a bad boy";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] strArr = str.split("\\W");
        for (String element : strArr) {
            if (hashMap.containsKey(element)) {
                int count = hashMap.get(element);
                hashMap.put(element, count + 1);
            } else {
                hashMap.put(element, 1);
            }
        }
        for (String k : hashMap.keySet()) {
            if (!(k.equals(""))) {
                System.out.println(k + " : " + hashMap.get(k));
            }
        }
    }
}