package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        list.add(10);
//        list.add(40);
//        Collections.sort(list);
//        System.out.println(list);  // default ascending order
//        Collections.reverse(list); // descending order
//        System.out.println(list);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Rahul",25,80000));
        employees.add(new Employee(2,"Rakesh",23,40000));
        employees.add(new Employee(3,"Chetan",25,50000));
        employees.add(new Employee(4,"Rajesh",23,35000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) ((o2.getName().compareTo(o1.getName())));
            }
        });
        System.out.println(employees);
    }
}
class MySort implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1,Employee employee2){
        return (int) ((employee1.getName().compareTo(employee2.getName())));
    }

}