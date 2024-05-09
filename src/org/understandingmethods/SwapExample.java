package com.org.understandingmethods;

public class SwapExample {

    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;
        swap(val1, val2);
    }


    static void swap(int i, int j) {
        int k = i;
        i = j;
        j = k;
        System.out.println(i);
        System.out.println(j);
    }
}
