package com.java.linkedlist;

import java.util.LinkedList;

public class RetrieveElementsFromLinkedList {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("how to get elements from firstIndex, lastIndex, given index and get all elements");
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("JackFruit");
        System.out.println(fruits);

        System.out.println("=====================================");
        System.out.println("Get first element");
        System.out.println(fruits.getFirst());

        System.out.println("=====================================");
        System.out.println("Get last element");
        System.out.println(fruits.getLast());

        System.out.println("=====================================");
        System.out.println("Get from specified index element");
        System.out.println(fruits.get(2));

        System.out.println("=====================================");
        System.out.println("Get all the elements from the linked list : Use iterators");
        System.out.println("Simple forEach() method");
        for (String fruit : fruits ) {
            System.out.println(fruit);
        }

    }
}
