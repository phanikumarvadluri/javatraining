package com.org.inhertence;

public class Derivedclass extends Baseclass {

    public Derivedclass() {
        System.out.println("Derived class constructor");
    }

    public Derivedclass(int var) {
        super(var);
        System.out.println("Derived class constructor");
    }

    public void m1() {
        System.out.println("m1 Derived class method");
    }

    public void m2() {
        System.out.println("m2 Derived class method");
    }

}
