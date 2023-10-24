package com.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterateExample {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Searching elements from the linked list");
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("JackFruit");
        fruits.add("Banana");

        System.out.println(fruits);

        System.out.println(fruits.contains("Banana"));
        System.out.println("Returns the first index of Banana occurence");
        int index = fruits.indexOf("Banana");
        System.out.println(index);
        int lastIndex = fruits.lastIndexOf("Banana");
        System.out.println(lastIndex);

        System.out.println("==========================");
        System.out.println("Iterate over the linked list by Iterator,");
        Iterator<String> iterator= fruits.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("==========================");
        System.out.println("Iterate over the linked list by forEach,");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("==========================");
        System.out.println("Iterate over the linked list by advanced forEach,");
        fruits.forEach(ele-> System.out.println(ele));

        System.out.println("==========================");
        System.out.println("Iterate over the linked list by simple for loop,");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}
