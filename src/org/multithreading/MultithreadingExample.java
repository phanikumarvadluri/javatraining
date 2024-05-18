package com.org.multithreading;

public class MultithreadingExample {

    public static void main(String[] args) {

        Set1OfElemtns set1OfElemtns = new Set1OfElemtns();
        Set2ofElements set2ofElements = new Set2ofElements();
        Set3elements set3elements = new Set3elements();
        Set4 set4 = new Set4();

        Thread t1=new Thread(set1OfElemtns);
        Thread t2=new Thread(set2ofElements);
        Thread t3=new Thread(set3elements);
        Thread t4=new Thread(set4);

//        set1OfElemtns.m1();
//        set2ofElements.m2();

//        set3elements.m3();
//        set4.m4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }


}
