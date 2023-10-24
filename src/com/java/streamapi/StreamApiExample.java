package com.java.streamapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,30,20,50,40);

        //System.out.println(numbers);
        // stream returns the stream of values
        // It will not affect the original list

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.remove("Orange");
        System.out.println(fruits);
//        System.out.println(fruits);
//        List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(sortedFruits);

//        Stream<Integer> data = numbers.stream().map(n->(n*2));
//        Stream<Integer> sortedData = numbers.stream().sorted();

//        sortedData.forEach(System.out::println);

//        Stream<Integer> mappedData = data.map(n->(n*2));
//        data.forEach(System.out::println);

        //numbers.stream().sorted().map(n->(n*2)).forEach(System.out::println);

//        LocalDateTime now = LocalDateTime.now();
//        LocalDate date = now.toLocalDate();
//        System.out.println(now);
//        System.out.println(date);

//        System.out.println("=========================");
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);
//        System.out.println(zonedDateTime);
//        System.out.println("===========================");
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDate = dateTime.format(formatter);
//        LocalDateTime parsedDate = LocalDateTime.parse("2023-09-04 14:30:00", formatter);
//
//        System.out.println(formatter);
//        System.out.println(formattedDate);
//        System.out.println(parsedDate);
    }
}
