package com.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

       /*
        Given a Query Expression and 1 parameter which we need to remove from the query
        For example expression passed is:
        "((Category=‘Sports’) or (Category=’Sneakers')) and ((Brand = ‘NIKE’)
        or (Brand = ‘ADIDAS’)) and ((Size = ‘9’) or (Size = ’10’))"

        Parameter to be removed : Brand
        Expected expression:
        "((Category=‘Sports’) or (Category=’Sneakers)) and ((Size = ‘9’) or (Size = ’10’))"
        */

public class Manhatten {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers in the list are :");
        System.out.println(even);

        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers in the list are :");
        System.out.println(odd);
    }
}
