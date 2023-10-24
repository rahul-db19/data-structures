package com.java8.stream.example;

import java.util.ArrayList;
import java.util.List;
//Dao layer
public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
            list.add(new Employee(101,"Rahul","CSE",90000));
            list.add(new Employee(102,"Rakesh","ECE",190000));
            list.add(new Employee(103,"Putta","ISE",150000));
            list.add(new Employee(104,"Chetan","MECH",50000));
            list.add(new Employee(104,"Namitha","ECE",110000));
        return list;
    }
}
