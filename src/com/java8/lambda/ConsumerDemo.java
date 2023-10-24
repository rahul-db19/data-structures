package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
//    @Override
//    public void accept(Integer integer) {
//        System.out.println(integer);
//    }

    public static void main(String[] args) {
        //Consumer<Integer> consumer = t -> System.out.println("Printing the number "+t);
        //consumer.accept(10);

        List<Integer> list = Arrays.asList(1,2,6,4,2);
        list.stream().forEach( (integer) -> {
            System.out.print(integer+" ");
        });
    }



}
