package com.org.interfaceexamples;

public interface InterfaceExample {
    //any method which dont have body is called abstarct methods
    public abstract void m1();
    public abstract void m2();
    public abstract   void m3();
    default public  void m4(){
    }
}
