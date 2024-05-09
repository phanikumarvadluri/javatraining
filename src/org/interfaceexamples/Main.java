package com.org.interfaceexamples;

public class Main {

    public static void main(String[] args) {
        InterfaceExample employeeInterface=new Employee();
        employeeInterface.m1();
        employeeInterface.m2();
        InterfaceExample employeeInterface1=new Account();
        employeeInterface1.m1();
        employeeInterface1.m2();
    }
}
