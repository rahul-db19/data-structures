package com.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(40);
        hashSet.add(30);
        hashSet.add(null);
        hashSet.add(20);
        hashSet.add(25);
        hashSet.add(null); // allows only one null value
        hashSet.add(25); //does not allow duplicates, insertion order not preserved
        System.out.println(hashSet);

        System.out.println("==================================");
        System.out.println("Enhanced for loop");
        for (Integer ele:hashSet
             ) {
            System.out.println(ele);
        }

        System.out.println("==================================");
        System.out.println("Simple for loop with iterator");
        Iterator<Integer> iterator = hashSet.iterator();
        for( ;iterator.hasNext();){
            Object element = (Integer) iterator.next();
            System.out.println(element);
        }

        System.out.println("==================================");
        System.out.println("While loop with iterator");
        Iterator<Integer> iterator1 = hashSet.iterator();
        while (iterator1.hasNext()){
            Integer ele = iterator1.next();
            System.out.println(ele);
        }

        System.out.println("=================================");
        System.out.println("With Java 8 lambda expression");
        hashSet.forEach(ele-> System.out.println(ele));

        System.out.println("==================================");
        System.out.println("Java 8 stram api");
        hashSet.stream().forEach(ele-> System.out.println(ele));
    }
}
