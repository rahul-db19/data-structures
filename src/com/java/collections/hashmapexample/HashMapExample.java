package com.java.collections.hashmapexample;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> numberMapping = new HashMap<>();
        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("three",3);
        numberMapping.put("four",4);
        numberMapping.put("five",5);
        numberMapping.put("null",6);
        numberMapping.put("null",7); //overrides previous values with null
        numberMapping.put("eight",8);

        System.out.println(numberMapping);

        //check if it is empty or not
        System.out.println(numberMapping.isEmpty());

        //find the size of the hashMap
        System.out.println(numberMapping.size());

        //whether the key exists in the hashmap or not
        System.out.println(numberMapping.containsKey("nul"));

        //whether the value is present in the hashmap or not
        System.out.println(numberMapping.containsValue(1));

        //get value by key
        Integer v1 = numberMapping.get("two");
        System.out.println(v1);

        //how to remove key value pair from the hashmap
        numberMapping.remove("one");
        System.out.println(numberMapping);

        //retrieve only keys from the hashmap
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        //retrieve only values
        Collection<Integer> values = numberMapping.values();
        System.out.println(values);

        System.out.println("=============================");
        System.out.println("Iterating over the HashMap");
        //forEach method

    }
}
