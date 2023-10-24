package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Apple");
        fruitCollection.add("Mango");

        System.out.println(fruitCollection);
        System.out.println(fruitCollection.contains("Banana"));
        //forEach internally uses Consumer functional interfaces
        fruitCollection.forEach((element)->{
            System.out.println(element);
        });
        fruitCollection.clear();
        System.out.println(fruitCollection);
    }
}
