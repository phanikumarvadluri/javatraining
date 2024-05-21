package com.org.chikkudelete;

public class Phonepay implements UpiPayment{
    @Override
    public void payment() {
  System.out.println("Phonepay payment");
    }

    @Override
    public void status() {
        System.out.println("Phonepay status");
    }

    @Override
    public void m1() {
        System.out.println("Phonepay m1");
    }
}
