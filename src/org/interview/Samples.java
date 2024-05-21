package com.org.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Samples {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 1);
        map.put("World", 2);

        List<Integer> collect = map.values().stream().collect(Collectors.toList());
        List<String> collect1 = map.keySet().stream().collect(Collectors.toList());



        String url = "jdbc:mysql://localhost/phani";
        String uname = "root";
        String pass = "Kalhonaho02&";

    }

}
