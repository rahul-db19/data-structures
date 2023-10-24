package com.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void display(){

    }
    public static void main(String[] args) {
//        Test.display();
//        method reference
        List<Integer> list = Arrays.asList(1,2,4,6,2,7);
//        list.forEach(val -> System.out.println(val));

        list.forEach(System.out::println);
    }
}
