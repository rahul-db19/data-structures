package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

//        Predicate<Integer> predicate = integer -> integer % 2 == 0;
//        System.out.println(predicate.test(35));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(i ->  i % 2 == 0).forEach(i -> System.out.println(i+" Even"));

    }
}
