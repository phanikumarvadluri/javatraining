package com.org.workingwithclasses.accessmodifiers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Specialreference {

    //
    //  implicit reference to the current object: this
    int a = 10;
    int b = 20;

    public void m1(int a, int b) {
        this.a = this.a + a;
        this.b = this.b + b;

        System.out.println(this.a);
        System.out.println(this.b);
    }

//    List<Integer> list = Arrays.asList(1, 11, 22, 13, 17, 88);
//    List<String> collect = list.stream().map(x -> x.toString()).filter(x -> x.startsWith("1")).collect(Collectors.toList());
//        System.out.println(collect);
//
//    ist<Integer> collect = list.stream().filter(x -> !hashSet.add(x)).collect(Collectors.toList());
//        System.out.println(hashSet);

//    List<Integer> list = Arrays.asList(88, 11, 22, 13, 17, 88, 88);
//    long count = list.stream().max(Integer::compare).get();
//        System.out.println(count);

//    String input = "Java articles are Awesome";
//
//    IntStream chars = input.chars();
//
//    Stream<Character> characterStream = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)));
//    List<Character> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().
//            filter(entry -> entry.getValue() == 1L).map(x -> x.getKey()).collect(Collectors.toList());
//        System.out.println(collect);

//
//    String input = "Java Articles are Awesome";
//    IntStream chars = input.chars();
//    Stream<Character> characterStream = chars.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)));
//    LinkedHashMap<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//    List<Character> collect1 = collect.entrySet().stream().filter(x -> x.getValue() > 1 && x.getKey()!=' ').map(x -> x.getKey()).collect(Collectors.toList());
//        System.out.println(collect1);

}
