package com.org.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrieArraYlistExample {

    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>();


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
