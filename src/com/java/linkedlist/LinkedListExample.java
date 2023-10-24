package com.java.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("Methods of Linked List are : ");
        System.out.println("add(), add(index,element), addFirst(), addLast()");

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("JackFruit");

        System.out.println(fruits);
        System.out.println("================================");
        fruits.add(2,"Mango");
        System.out.println("Afrer adding at specified index");
        System.out.println(fruits);

        System.out.println("================================");
        System.out.println("Adding at beginning");
        fruits.addFirst("Kiwi fruit");
        System.out.println(fruits);

        System.out.println("================================");
        System.out.println("Adding at the end of the linked list");
        fruits.addLast("Strawberry");
        System.out.println(fruits);
    }
}
