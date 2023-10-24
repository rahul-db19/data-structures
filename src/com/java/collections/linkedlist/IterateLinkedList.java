package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Gadag");
        cities.add("Haveri");
        cities.add("Bangalore");
        cities.add("Hubli");
        cities.add("Mysore");
        cities.add("Mysore");

//        System.out.println(cities.contains("Mysore"));
//
//        System.out.println("Find the first occurrence of an element");
//        System.out.println(cities.indexOf("Hubli"));
//
//        System.out.println("Find the last occurrence of an element");
//        System.out.println(cities.lastIndexOf("Mysore"));

        //Iterate over a linked list
        // Iterator
//        Iterator<String> iterator = cities.iterator();
//        while(iterator.hasNext()){
//            String c = (String) iterator.next();
//            System.out.println(c);
//        }
        // forEach
//        cities.forEach((element)->{
//            System.out.println(element);
//        });
        // forEach advanced
        for(String element : cities){
            System.out.println(element);
        }
        // simple for loop
    }
}
