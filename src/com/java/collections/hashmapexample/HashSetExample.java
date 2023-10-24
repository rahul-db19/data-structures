package com.java.collections.hashmapexample;

import java.util.HashSet;
import java.util.Iterator;
/*
     allows only one null value
     no duplicates allowed
     un ordered collection - does not maintain insertion order
     Internally uses HashMap
     Is not a thread safe - do not use in multithreaded environment

     To remove element from HashSet - returns true if element removed else false a boolean value
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(70);
        numbers.add(30);
        numbers.add(50);

        //Iterating over the HashSet
        //Enhanced for loop
//        for( int number : numbers){
//            System.out.println(number);
//        }

        //Basic loop with iterator
        for( Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();){
            Integer num = (int) iterator.next();
            System.out.println(num);
        }
        System.out.println("=========********==========");

        //while loop with iterator
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer num = (int) iterator.next();
            System.out.println(num);
        }

        System.out.println("=============Lambda==================");
        //forEach method with lambda
        numbers.forEach((element)->{
            System.out.println(element);
        });

        //streaming + forEach + lambda expressions
    }
}
