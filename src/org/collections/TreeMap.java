package com.org.collections;

import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.TreeMap<>();
        map.put(13, "KK");
        map.put(14, "RK");
        map.put(15, "SS");
        map.put(12, "Phani");

        map.put(10, "KK");
        map.put(9, "RK");
        map.put(8, "SS");
        map.put(6, "Phani");


        System.out.println(map);
    }
}
