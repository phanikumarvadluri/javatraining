package com.org.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapexample {

    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap();
        map.put(12, "Phani");
        map.put(13, "KK");
        map.put(14, "RK");
        map.put(15, "SS");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            Integer key = next.getKey();
            if (key.equals(14)) {
                map.remove(key);
            }

        }

        System.out.println(map);

    }
}
