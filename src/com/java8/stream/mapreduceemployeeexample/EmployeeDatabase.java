package com.java8.stream.mapreduceemployeeexample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
        return Stream.of(new Employee(101,"John","A",60000),
                         new Employee(102,"Peter","B",30000),
                         new Employee(103,"Mack","A",80000),
                         new Employee(104,"Kim","A",90000),
                         new Employee(105,"JSon","C",15000)
                        ).collect(Collectors.toList());
    }
}
