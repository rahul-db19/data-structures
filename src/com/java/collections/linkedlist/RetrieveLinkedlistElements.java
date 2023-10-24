package com.java.collections.linkedlist;

import java.util.LinkedList;
// first element
// last element
// at specified index
// get all the elements
public class RetrieveLinkedlistElements {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Jackfruit");

//        System.out.println(fruits.getFirst());
//        System.out.println(fruits.getLast());
//        System.out.println(fruits.get(1));
//        System.out.println("--------------");
//        for(int i=0;i< fruits.size();i++){
//            System.out.println(fruits.get(i));
//        }

        for (String fruit: fruits ) {
            System.out.println(fruit);
        }
    }
}
