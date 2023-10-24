package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Apple");
//        arrayList.add("Apple");
//        arrayList.add("Apple");
//        arrayList.add("Apple");
//        arrayList.add(null);
//        arrayList.add(null);
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

//        String str = "rahul";
//        System.out.println(str.length());
//        System.out.println(str.charAt(3));

        List<String> courses = Arrays.asList("C","Java","ReactJs","SpringBoot");
        //System.out.println(courses);

        //Simple for loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }

        //Enhanced for loop
        for (String course: courses) {
            System.out.println(course);
        }

        // Basic loop with iterator
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        //Iterator with while loop
        Iterator iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        //Stram and Lambda expression
        courses.stream().forEach(course -> System.out.println(course));

        System.out.println("Simple for each with Lambda expression");
        courses.forEach(course -> System.out.println(course));
    }
}
