package com.ty.mathematics;

import java.util.Arrays;
import java.util.Collections;

public class SortArrDesc {
    public static void main(String[] args) {
        Integer[] nums = {2,5,3,1,7,8,45,23};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        Arrays.sort(nums, Collections.reverseOrder());

        System.out.println(Arrays.toString(nums));
        
    }
    
}
