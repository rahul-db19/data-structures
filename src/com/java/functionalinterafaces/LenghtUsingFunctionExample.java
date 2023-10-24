package com.java.functionalinterafaces;

import java.util.function.Function;

//class FunctionImpl implements Function<String,Integer> {
//    @Override
//    public Integer apply(String str) {
//        return str.length();
//    }
//}
public class LenghtUsingFunctionExample {
    public static void main(String[] args) {
//        Function<String,Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Rahul is a winner"));

        Function<String,Integer> function = (String str) -> str.length();
        System.out.println(function.apply("Gadaga"));
    }
}
