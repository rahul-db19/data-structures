package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Mango");
        fruitCollection.add("Apple");

        System.out.println(fruitCollection);

        fruitCollection.remove("Banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("Apple"));

        fruitCollection.forEach((element)->
        {
            System.out.println(element);
        });

        fruitCollection.clear();
        System.out.println(fruitCollection);

    }
}
