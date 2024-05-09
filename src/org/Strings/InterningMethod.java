package com.org.Strings;

public class InterningMethod {

    public static void main(String[] args) {

        String s1 = "hello";
        s1 += " java";
        String s2 = "hello";
        s2 += " java";

        System.out.println(s1 == s2);
        /*
        checking string equality. it will chekc value
         */
        System.out.println(s1.equals(s2));

        String s3 = s1.intern();
        String s4 = s2.intern();

        System.out.println(s3 == s4);
        /*
        checking string equality. it will chekc value
         */
        System.out.println(s3.equals(s4));


    }
}
