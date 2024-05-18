package com.org.multithreading;

public class Main {

    public static void main(String[] args) {
        UpiPayment phonepay=new Phonepay();
        phonepay.doPayment();
        phonepay.couponInfo();

        UpiPayment amazonPay=new AmazonPay();
        amazonPay.doPayment();
        amazonPay.couponInfo();
    }
}
