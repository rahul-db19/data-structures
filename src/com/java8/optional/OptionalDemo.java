package com.java8.optional;

import java.util.Locale;
import java.util.Optional;

class Customer{
    private int id;
    private String name;

    public Customer(){

    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class OptionalDemo {
    public static void main(String[] args) {

        Customer customer1 = new Customer(101,"Rahul");
        Customer customer2 = new Customer(102,null);

        String name2 = customer2.getName();
        Optional<Object> optional1 = Optional.ofNullable(customer2.getName());
//        System.out.println(optional1.orElse("default name"));
//        Throw customized exception
        System.out.println(optional1.orElseThrow(() -> new IllegalArgumentException("Name is not present")));
    }
}
