package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        System.out.println("This throws ConcurrentModificationException");
        System.out.println("============================================");
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String element = iterator.next();
//            if (element.equals("One")){
//                list.remove("One");
//            }
//
//            if (element.equals("Four")){
//                list.add("Five");
//            }
//        }

        System.out.println("==============================================");
        System.out.println("We avoid the exception by using CopyOnWriteArrayList class");

        List<String> list1 = new CopyOnWriteArrayList<>(list);

        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.equals("One")){
                list1.remove("One");
            }

            if (element.equals("Four")){
                list1.add("Five");
            }
        }
        System.out.println(list1);

    }
}
