package com.interviews;

import java.util.*;
import java.util.stream.Collectors;

public class RoughWork {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,8,9};

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        list1 = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1.size());
    }
}
