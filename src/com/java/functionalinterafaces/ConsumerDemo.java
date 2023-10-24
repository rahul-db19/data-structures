package com.java.functionalinterafaces;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (String input)->{
            System.out.println(input);
        };
        consumer.accept("Hello World!");

    }
}
