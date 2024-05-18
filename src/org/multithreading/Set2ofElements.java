package com.org.multithreading;

public class Set2ofElements implements  Runnable{
//    public void m2() {
//
//        for (int i = 3000; i < 4000; i++) {
//            System.out.println("m2" + i);
//        }
//    }

    @Override
    public void run() {

        for (int i = 3000; i < 4000; i++) {
            System.out.println("m2" + i);
        }

    }
}
