package com.java.linkedlist;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("JackFruit");
        fruits.add("Banana");
        System.out.println(fruits);

        System.out.println("=================================");
        fruits.removeFirst();
        System.out.println("After removing the first element in the linked list");
        System.out.println(fruits);

        System.out.println("=================================");
        System.out.println("Remove first occurence in linked list");
        fruits.removeFirstOccurrence("Banana");
        System.out.println(fruits);

        //clear() method used to remove all the elements completely
        System.out.println("==================================");
        System.out.println("After clearing the linked list");
        fruits.clear();
        System.out.println(fruits);
    }
}
