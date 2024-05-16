package com.org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * when we try to work with multiple threads- one thread is iterating
 * <p>
 * other thread try ing ot modify
 * <p>
 * remove
 * <p>
 * <p>
 * arraylist will not support
 */
public class ArralistwithmultipleThreads {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(50);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer numeber = iterator.next();
            if (numeber.equals(30)) {
                list.remove(numeber);
            }
        }
        System.out.println(list);
    }
}
