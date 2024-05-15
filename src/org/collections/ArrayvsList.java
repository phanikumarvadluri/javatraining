package com.org.collections;

public class ArrayvsList {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "phani";
        names[1] = "rk";
        names[2] = "kk";
        names[3] = "kk";
        names = new String[10];

        names[0] = "200";


        for (String name : names) {
            System.out.println(name);
        }
    }
}
