package com.org.understandingmethods;

public class FirstMethod {

    public static void main(String[] args) {
        System.out.println("Before calling a method");
        add(10, 20, 3);
        System.out.println("after calling a method");
    }
/*

parameters
 */
    static void add(int a, int b, int count) {
        int sum = a + b;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
    }

}
