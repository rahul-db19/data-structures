package com.java8.stream;

import java.sql.SQLOutput;
import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eight",8);
        map.put("Four",4);
        map.put("Ten",10);
        map.put("Two",2);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
//        for(Map.Entry<String,Integer> entry : entries){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

//        Collections.sort(entries, ( o1, o2 ) -> o1.getValue() - o2.getValue());
//        for(Map.Entry<String,Integer> entry : entries){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
