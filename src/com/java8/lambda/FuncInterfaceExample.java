package com.java8.lambda;

public class FuncInterfaceExample implements Runnable{

    @Override
    public void run() {
        System.out.println("This is rum method of Runnable interface");
    }

    public static void main(String[] args) {
        new FuncInterfaceExample().run();
    }
}
