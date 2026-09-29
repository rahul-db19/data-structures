package com.ty.mathematics;

public class RemovaDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,3,4,5,5};

        int i = 0;

        for( int j = 1; j < nums.length; j++){
            if ( nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
