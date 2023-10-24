package com.java.functionalinterafaces;

@FunctionalInterface
interface Rectangle{
    public int area(int a, int b);
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle rect = (int a, int b)-> {
            System.out.println("Area of rectangle is : ");
            return a * b;
        };
        System.out.println(rect.area(10,20));
    }
}
