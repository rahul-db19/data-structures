package com.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> pLang = Arrays.asList("Java","ReactJs","C","C++","Python");

        ListIterator<String> listIterator = pLang.listIterator();

        System.out.println("Forward direction iteration");
        while (listIterator.hasNext()){
            String element = listIterator.next();
            System.out.println(element);
        }
        System.out.println("================================");
        System.out.println("Backward direction iteration");
        while(listIterator.hasPrevious()){
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}
