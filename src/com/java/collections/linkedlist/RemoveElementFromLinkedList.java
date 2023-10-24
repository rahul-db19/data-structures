package com.java.collections.linkedlist;

import java.util.LinkedList;
/*
remove first element
remove last element
remove first occurrence of an element
clear the linked list completely
 */
public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Jack-fruit");
        fruits.add("Apple");
//        System.out.println(fruits);
//        System.out.println("Removing first element");
//        fruits.removeFirst();
//        System.out.println(fruits);
//
//        System.out.println("Removing last element");
//        fruits.removeLast();
//        System.out.println(fruits);
        System.out.println(fruits);
        System.out.println("Remove first occurrence of an element");
        fruits.remove("Apple");
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

    }
}
