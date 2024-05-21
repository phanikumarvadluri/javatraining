package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
//
//        Set<Integer> set=new HashSet<>(numbers);
//        ArrayList<Integer> nonduplicate = new ArrayList<>(set);
//
//        System.out.println(nonduplicate);

        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);


        // System.out.println(numbers);

//        for(Integer number: numbers)
//        {
//            System.out.println(number);
//        }
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }

//        Stream<Integer> stream = numbers.stream();
//        stream.forEach(System.out::println);

    }

}
