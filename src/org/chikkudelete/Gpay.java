package com.org.chikkudelete;

public class Gpay implements UpiPayment {
    @Override
    public void payment() {
        System.out.println("Gpay payment");
    }

    @Override
    public void status() {
        System.out.println("Gpay status");
    }

    @Override
    public void m1() {
        System.out.println("Gpay m1");
    }

    @Override
    public void newFunction() {
        System.out.println("Gpay  new Function ");
    }
}
