package com.org.workingwithclasses.staticmembers;

public class Staicinilization {
    private int id;
    private String name;
    private static String companyName = "ABCD";

    public Staicinilization() {
        System.out.println("default constructor");
        System.out.println(id);
        System.out.println(name);

    }
    {
        System.out.println("initializatoion block");
        System.out.println(id);
        System.out.println(name);
    }
    {
        System.out.println("initializatoion block 2");
        System.out.println(id);
        System.out.println(name);
    }

    static {
        System.out.println("static initilization block");
    }

    static {
        System.out.println("static initilization 2 block");
    }

    public static void m1Static() {
        System.out.println("static m1Static method");
    }

    public void m1() {
        System.out.println("m1 method");
    }

    /**
     *
     * static initilization block
     * static initilization 2 block
     *
     * initializatoion block
     * 0
     * null
     *
     * initializatoion block 2"
     * 0
     * null
     * default constructor
     * 0
     * null

     *
     */
}
