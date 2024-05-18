package com.org.multithreading;

public class Set1OfElemtns implements Runnable {

//    public void m1() {
//        for (int i = 10; i < 1000; i++) {
//            System.out.println("m1" + i);
//        }
//    }

    @Override
    public void run() {
        for (int i = 10; i < 1000; i++) {
            System.out.println("m1" + i);
        }
    }
}
