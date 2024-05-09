package com.org.workingwithclasses.staticmembers;

public class NonStaticMain {

    public static void main(String[] args) {

        NonStatic nonStatic1 = new NonStatic(10);
        NonStatic nonStatic2 = new NonStatic(20);

        System.out.println(nonStatic1.value);
        System.out.println(nonStatic2.value);
    }

}
