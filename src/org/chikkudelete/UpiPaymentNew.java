package com.org.chikkudelete;


@FunctionalInterface
public interface UpiPaymentNew {
    public void payment();

    default void newFunction() {
        System.out.println("UPI payment new Function ");
    }

    default void newFunction1() {
        System.out.println("UPI payment new Function ");
    }

    default void newFunction32() {
        System.out.println("UPI payment new Function ");
    }


    default void newFunction4() {
        System.out.println("UPI payment new Function ");
    }


    static void newFunctionStatic() {
        System.out.println("UPI payment static Function ");
    }

    static void newFunctionStatic1() {
        System.out.println("UPI payment static Function ");
    }
}
