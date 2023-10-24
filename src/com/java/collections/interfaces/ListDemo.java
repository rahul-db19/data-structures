package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /*
        List is an interface
        - maintains insertion order
        - allows duplicates
        - stores null values
        - accessed using indexes as well
        - Arraylist, LinkedList, Vector, Stack, CopyOnWriteArrayList
         */
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(null);
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list);


    }
}
