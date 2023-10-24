package com.java8.stream.mapreduceemployeeexample;

import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class MapReduceEmployee {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();
//        System.out.println(employees);
        List<Employee> gradeA = employees.stream()
                .filter(grade -> grade.getGrade().equalsIgnoreCase("a"))
                .toList();
        int averageSalary = (int) gradeA.stream().map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();

        System.out.println(averageSalary);

    }
}
