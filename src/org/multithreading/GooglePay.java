package com.org.multithreading;

public class GooglePay implements UpiPayment{
    @Override
    public void doPayment() {
        System.out.println("do GPAY");
    }
}
