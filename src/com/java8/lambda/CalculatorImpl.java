package com.java8.lambda;

//interface Calculator{
//    void switchOn();
//}
//public class CalculatorImpl implements Calculator{
//    @Override
//    public void switchOn() {
//        System.out.println("Switch On");
//    }
//
//    public static void main(String[] args) {
//        Calculator calculator = new CalculatorImpl();
//        calculator.switchOn();
//    }
//}

interface Calculator {
    void switchOn();
}

public class CalculatorImpl {

    public static void main(String[] args) {
//        Calculator calculator = () -> {
//            System.out.println("Switch On");
//        };
//        calculator.switchOn();

        Calculator calculator = () -> System.out.println("Switch On");
        calculator.switchOn();
    }
}