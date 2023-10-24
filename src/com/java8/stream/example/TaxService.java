package com.java8.stream.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxPayers(String input) {
//        if(input.equalsIgnoreCase("Tax")){
//            return Database.getEmployees().stream().filter((val ->  val.getSalary() >= 100000)).collect(Collectors.toList());
//        }
//        else {
//            return Database.getEmployees().stream().filter((val ->  val.getSalary() < 100000)).collect(Collectors.toList());
//        }
        return  input.equalsIgnoreCase("Tax")
                ?
                Database.getEmployees().stream().filter((val -> val.getSalary() >= 100000)).collect(Collectors.toList())
                :
                Database.getEmployees().stream().filter((val -> val.getSalary() < 100000)).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxPayers("non-tax"));
    }
}
