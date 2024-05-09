package com.org.workingwithclasses.staticmembers;

public class OverloadingMain {

    public static void main(String[] args) {
        Overloading overloading=new Overloading();

        int add = overloading.add(10, 20);
        double add1 = overloading.add(10, 20, 89);
        int add2 = overloading.add(10, 20, 0, 89);
        System.out.println(add);
        System.out.println(add1);
        System.out.println(add2);
    }
}
