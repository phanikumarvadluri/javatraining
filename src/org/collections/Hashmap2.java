package com.org.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();

        map.put(12, "Phani");
        map.put(13, "KK");
        map.put(14, "RK");
        map.put(15, "SS");

        boolean b = map.containsKey(13);

        if (b) {
            System.out.println("map contains information");
        } else {
            System.out.println("No information present");
        }

    }


}
