package com.java8.lambda;

import com.java8.stream.example.Database;
import com.java8.stream.example.Employee;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(8,3,12,4);
//        System.out.println(list);
//        Default sort is ascending
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        reverse order sorting
//        Collections.reverse(list);
//        System.out.println(list);

//        System.out.println("Sorting by using stream api");
//        list.stream().sorted().forEach(val-> System.out.print(val+" "));
//        list.stream().sorted(Comparator.reverseOrder()).forEach( val-> System.out.print(val + " "));
//        list.stream().sorted(Comparator.naturalOrder()).forEach( val-> System.out.print(val + " "));
//
//        sorting employees
        List<Employee> employees = Database.getEmployees();
//        Collections.sort(employees, new sortEmployees());
//        Collections.sort(employees, ( o1, o2) ->
//                 (int) (o1.getSalary()- o2.getSalary()));
//        System.out.println(employees);

//        employees.stream().sorted(( o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach((val)->System.out.println(val));
//        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
    }
}

//class sortEmployees implements Comparator<Employee>{
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int) (o1.getSalary()- o2.getSalary());//ascending
//    }
//}
