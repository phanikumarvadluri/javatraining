package com.org.multithreading;

public class Set4 implements  Runnable{


//    public void m4() {
//        for (int i = 100000; i < 100500; i++) {
//            System.out.println("m4" + i);
//        }
//    }

    @Override
    public void run() {
        for (int i = 100000; i < 100500; i++) {
            System.out.println("m4" + i);
        }
    }
}
