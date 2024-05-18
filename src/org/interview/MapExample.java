package com.org.interview;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //List<String> list1 = Arrays.asList("apple", "banana");
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("banana");
        list.add("banana");
        list.add("banana");
        list.add("kiwi");
        list.add("orange");

        Map<String, Integer> map = new HashMap<>();
        for (String fruit : list) {
            //System.out.println(fruit);

            Integer i = map.get(fruit);
            if (i != null) {
                map.put(fruit, i + 1);
            } else {
                map.put(fruit, 1);
            }
        }
        System.out.println(map);


    }

}
