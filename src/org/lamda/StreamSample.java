package com.org.lamda;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamSample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 788, 8);
//
//        List<Integer> evenList =new ArrayList<>();
//
//        for (Integer input : list) {
//            if (input % 2 == 0) {
//                evenList.add(input);
//            }
//        }

        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());


        System.out.println(evenList);


    }
}


