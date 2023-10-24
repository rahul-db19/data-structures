package com.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Nachi");
        list.add("Putta");
        list.add("Chetan");
        list.add("Namitha");
        list.add("Rakesh");

//        for (String s : list){
//            System.out.println(s);
//        }
        System.out.println("We can write the above in streams as well using forEach");
//        for (String s : list) {
//            if(s.startsWith("R")){
//                System.out.println(s);
//            }
//        }
        list.stream().filter((val-> val.startsWith("R"))).forEach(val-> System.out.println(val));
//      list.stream().forEach((s) -> System.out.println(s));

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");

//        map.forEach((key,val)-> {
//            System.out.println(key+" : "+val);
//        });

//        map.entrySet().stream().forEach((obj) ->{
//            System.out.println(obj);
//        });

//        for(String s : map.values()){
//            if(s.startsWith("T")){
//                System.out.println(s);
//            }
//        }

        map.entrySet().stream().filter((k->k.getValue().startsWith("T"))).forEach(val->{
            System.out.println(val.getValue());
        });
    }


}
