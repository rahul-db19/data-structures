package com.java8.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        /*long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 500).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream took time : "+(end - start));

        System.out.println("==================================================");
        start = System.currentTimeMillis();
        IntStream.range(1, 500).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream took time : "+(end - start));
*/
        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" value : "+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" value : "+x);
        });

    }
}
