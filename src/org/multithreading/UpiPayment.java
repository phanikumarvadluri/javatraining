package com.org.multithreading;

public interface UpiPayment {
    public void doPayment();

    default void couponInfo() {
        System.out.println("Generic Coupon info");
    }
}
