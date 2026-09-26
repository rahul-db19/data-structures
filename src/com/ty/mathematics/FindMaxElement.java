package com.ty.mathematics;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 12, 56, 76, 43, 100 };

        int max = nums[0];
        if (nums == null || nums.length == 0) {
            System.out.println("Array is empty");
        }
        
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }
}
