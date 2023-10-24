package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C","Java","Python","Javascript");
        System.out.println(courses);
        
        //simple for loop
        for(int i=0;i<courses.size();i++){
            System.out.println(courses.get(i));
        }

        //enhanced for each loop
        for(String course : courses){
            System.out.println(course);
        }
        
        //iterator
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
