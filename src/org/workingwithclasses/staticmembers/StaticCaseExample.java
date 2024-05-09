package com.org.workingwithclasses.staticmembers;

public class StaticCaseExample {
    public static void main(String[] args) {
        StaticCase staticCase1=new StaticCase();
        StaticCase staticCase2=new StaticCase();
        System.out.println(staticCase1.value);
        System.out.println(staticCase1.value);
        System.out.println(StaticCase.value);
    }
}
