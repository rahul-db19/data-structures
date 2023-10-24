package com.java.collections.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// add()
// overloaded add(location, element)
// addFirst() - comes from deque interface
// addLast() - comes from deque interface
public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Jack-fruit");
        System.out.println(fruits);

        //Collections.sort(fruits);
        System.out.println(fruits);

//        fruits.add(1,"Orange");
//        System.out.println("After adding element");
//        System.out.println(fruits);
//
//        System.out.println("Adding element at the begining of the list");
//        fruits.addFirst("Watermelon");
//        System.out.println(fruits);
//        fruits.addLast("abcd");
//        System.out.println(fruits);
    }
}
