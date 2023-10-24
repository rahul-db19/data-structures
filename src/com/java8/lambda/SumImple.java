package com.java8.lambda;

interface Calc{
    //void sum(int a, int b);
    int substraction(int a, int b);
}

public class SumImple {
    public static void main(String[] args) {
//        Calc calc = ( a, b ) -> System.out.println( a + b );
//        calc.sum(20,30);

        Calc calc = ( a, b)-> {
          if( a < b ){
              throw new RuntimeException(a+ " should be greater than "+b);
          } else {
              return a - b;
          }
        };
        System.out.println(calc.substraction(20,40));
    }
}
