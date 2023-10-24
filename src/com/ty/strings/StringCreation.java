package com.ty.strings;

import java.util.Objects;
import java.util.StringTokenizer;

public class StringCreation {
    public static void main(String[] args) {
        String s1= "rahul";
        String s2 = new String("rahul");
        StringBuffer sb1 = new StringBuffer("chetan");
        StringBuilder sb2 = new StringBuilder("nachiket");
//        System.out.println(s1.equals(s2));
//        System.out.println(Objects.equals(s1,s2));
        System.out.println(Objects.equals(null,null));
        String s3 = null;
        String s4 = null;
        System.out.println(s3.equals(s4)); //null pointer exception
    }
}
