package com.java.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Jack-fruit");

        System.out.println(fruits.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList()));

        System.out.println(fruits);

        System.out.println(fruits.stream().sorted((Comparator.naturalOrder())).collect(Collectors.toList()));

        System.out.println(fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList()));
        System.out.println(fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList()));


    }
}
