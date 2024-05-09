package com.org.Strings;

public class CompareTo {
    public static void main(String[] args) {
        String a = "zee";
        String b = "phani";

        int result = a.compareTo(b);
        System.out.println(result);
        if (result < 0) {
            System.out.println("a come before b");
        } else if (result > 0) {
            System.out.println("b come before a");
        } else {
            System.out.println("a and b are equal");
        }
    }

}
