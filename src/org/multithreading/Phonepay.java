package com.org.multithreading;

public class Phonepay implements UpiPayment {

    @Override
    public void doPayment() {
        System.out.println("PhonepaydoPayment");
    }
}
