package com.java8.lambda;

import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> {
//
//    @Override
//    public String get() {
//        return "Hi Rahul, Java Developer";
//    }
//
//    public static void main(String[] args) {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());
//    }
//}

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Hi Rahul, A Java Developer";
        };
        System.out.println(supplier.get());
    }
}
