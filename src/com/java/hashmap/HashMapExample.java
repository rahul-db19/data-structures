package com.java.hashmap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("Example to map String to Number");
        Map<String,Integer> numberMapping = new HashMap<>();
        System.out.println("Add key value pairs");
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);
        numberMapping.put(null,6);
        numberMapping.put(null,7);//replace existing key value pair
        numberMapping.put("Six",null);
        numberMapping.put(null,null);
        System.out.println(numberMapping);

        System.out.println("=======================================");
        System.out.println("Check if empty or not");
        System.out.println(numberMapping.isEmpty());

        System.out.println("=======================================");
        System.out.println("Find the size of the hashmap "+numberMapping.size());

        System.out.println("========================================");
        System.out.println("If key exists in a hashmap or not :"
                +numberMapping.containsKey(null));

        System.out.println("========================================");
        System.out.println("If value exists in the hashmap or not :"
                +numberMapping.containsValue(4));

        System.out.println("=======================================");
        System.out.println("Get particular value by key");
        Integer val = numberMapping.get(null);
        System.out.println(val);

        System.out.println("=======================================");
        System.out.println("How to remove key :");
        System.out.println(numberMapping.remove("One"));
        System.out.println(numberMapping);

        System.out.println("=======================================");
        System.out.println("How to retrieve only the keys from the hashmap");
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        System.out.println("=======================================");
        System.out.println("Retrieve only values");
        Collection<Integer> values = numberMapping.values();
        System.out.println(values);

        System.out.println("========================================");
        System.out.println("Iterate over an HashMap");
        for (Map.Entry<String,Integer> entry : numberMapping.entrySet()){
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }
    }
}
