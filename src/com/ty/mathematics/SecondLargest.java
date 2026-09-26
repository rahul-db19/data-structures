package com.ty.mathematics;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {7, 2, 9, 1, 5, 12, 3};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for ( int num : nums ){
            if ( num > largest ){
                secondLargest = largest;
                largest = num;
            }
            else if ( num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println("Largest is : "+largest);
        System.out.println("Second Largest is : "+secondLargest);
    }
    
}
