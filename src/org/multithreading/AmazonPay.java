package com.org.multithreading;

public class AmazonPay implements UpiPayment {
    @Override
    public void doPayment() {
        System.out.println("AmazonPaydoPayment");
    }

    public void couponInfo() {
        System.out.println("Amazonpay MY info");
    }
}
