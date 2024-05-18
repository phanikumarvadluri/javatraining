package com.org.lamda;

public class MultithreadingExample {

    public static void main(String[] args) {
        Runnable set1OfElemtns = () -> {
            for (int i = 10; i < 1000; i++) {
                System.out.println("m1" + i);
            }
        };

        Runnable set2ofElements = () -> {
            for (int i = 3000; i < 4000; i++) {
                System.out.println("m2" + i);
            }
        };

        Runnable set3elements = () -> {
            for (int i = 1200; i < 2000; i++) {
                System.out.println("m3" + i);
            }
        };

        Runnable set4 = () -> {
            for (int i = 100000; i < 100500; i++) {
                System.out.println("m4" + i);
            }
        };

        Thread t1 = new Thread(set1OfElemtns);
        Thread t2 = new Thread(set2ofElements);
        Thread t3 = new Thread(set3elements);
        Thread t4 = new Thread(set4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }


}
