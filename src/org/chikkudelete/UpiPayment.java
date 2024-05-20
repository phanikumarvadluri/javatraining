package com.org.chikkudelete;

public interface UpiPayment {
    public void payment();

    public void status();

    public void m1();

    default void newFunction(){
      System.out.println("UPI payment new Function ");
    }

    static void newFunctionStatic(){
        System.out.println("UPI payment static Function ");
    }
}
