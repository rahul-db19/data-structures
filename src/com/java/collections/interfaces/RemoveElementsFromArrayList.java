package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;
//remove - with index and with value
//removeAll - with collection as input
//clear - removes all elements from the list
public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println(fruits);
        System.out.println("Using remove all now : ");
        fruits.removeAll(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
