package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
         /*
        Arraylist - uses dynamic array concept. Extends AbstractList
        default capacity 10
        3 constructors are there
        internally uses array to store elements
        stores duplicates, insertion order
        can not create arraylist for primitive types( use wrapper classes )  use Integer, character, Boolean etc
        it is not synchronized - if multiple threads  modify at the same time may result in unexpected results - Must synchronize
         */
        List<Integer> list = new ArrayList<>(25);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
    }
}
