package com.org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("10");
        list.add("11");
        list.add("13");
        //method1: for each and printing elements
        for (String string : list) {
            System.out.println(string);
        }

        //method2: iterate over obejcts and printing elements

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
