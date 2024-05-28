package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(91);
        list.add(89);
        list.add(null);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(91);
        linkedList.add(89);
        linkedList.add(null);


        Set<Integer> set = new HashSet<>(list);
        set.add(null);

        Set<Integer> set1 = new LinkedHashSet<>(list);
        set.add(null);
        set.add(null);

        Set<Integer> set2 = new TreeSet<>(list);
        set.add(null);
        set.add(null);


        if (list.size() == set.size()) {
            System.out.println("No duplicates");
        } else {
            System.out.println("duplicates");
        }

    }
}
