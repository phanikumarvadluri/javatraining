package com.org.Strings;

public class StringImmutable {
    public static void main(String[] args) {


        String s1 = "Hello";
        s1 += "java";

        String s2 = "Hello";
        s2 += "java";

        System.out.println(s1);
        System.out.println(s2);


        /*
        this is going to check address.
         */
        System.out.println(s1 == s2);
        /*
        checking string equality. it will chekc value
         */
        System.out.println(s1.equals(s2));
    }
}
