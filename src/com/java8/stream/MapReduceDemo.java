package com.java8.stream;

import java.util.Arrays;
import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;

public class MapReduceDemo {
    public static void main(String[] args) {
/*
        List<Integer> list = Arrays.asList(2,4,6,9,1,3,7);
        Integer sumResult = list.stream().reduce(1,( a, b)-> a * b);
        System.out.println(sumResult);
        Find the sum of the elements using iterative approach
        Integer sum = 0;
        for( Integer val : list){
            sum = sum + val;
        }
        System.out.println(sum);
        FInd the maximum string from a string of array
        List<String> names = Arrays.asList("Rahul","Chetan","Nachiket","Raj");
        String maxName = names.stream().reduce((a, b)->a.length()<b.length()?a:b).get();
        System.out.println(maxName);
*/

        System.out.println("Find sum of Squares of even numbers from the list of elements");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> squareOfEven = even.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squareOfEven);

//        int sumOfSquareOfEven = squareOfEven.stream().reduce( 0, ( a, b) -> a + b);
        int sumOfSquareOfEven = squareOfEven.stream().reduce(0, Integer::sum);

        System.out.println(sumOfSquareOfEven);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
//                .reduce( 0, ( a, b ) -> a + b );

        System.out.println(sum);
    }

}
