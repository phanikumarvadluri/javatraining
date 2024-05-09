package com.org.Strings;

public class Interview {

    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1 + "world";
        String s2 = "hello";
        s2 = s2 + "world";
        //heap area====> internally String constant pool
        // here only one object
          // compare address(refrence_)
        System.out.println(s1 == s2);
        // compare content
        System.out.println(s1.equals(s2));


    }

}
