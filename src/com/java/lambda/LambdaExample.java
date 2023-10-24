package com.java.lambda;

interface Shape{
    void draw();
}
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Rectangle class draw() method");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square draw() method");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle draw() method");
    }
}
//This is polymorphism
public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("This is Rectangle class draw() method");
        rectangle.draw();
    }
}
