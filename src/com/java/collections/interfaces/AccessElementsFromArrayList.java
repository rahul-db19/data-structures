package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {
        List<String> topProgrammingLanguages = new ArrayList<>();
        System.out.println("Is the list empty? : "+topProgrammingLanguages.isEmpty());
        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("Python");
        System.out.println(topProgrammingLanguages.size());
        for(int i=0;i<topProgrammingLanguages.size();i++){
            System.out.println(topProgrammingLanguages.get(i));
        }
        System.out.println(topProgrammingLanguages);

        //modify element at the specified index
        topProgrammingLanguages.set(3,"Javascript");
        System.out.println(topProgrammingLanguages);
    }
}
