package com.org.chikkudelete;

public class Main {

    public static void main(String[] args) {


        UpiPayment phonePay = new Phonepay();

        phonePay.payment();
        phonePay.newFunction();
        UpiPayment.newFunctionStatic();

        UpiPayment gpay = new Gpay();

        gpay.payment();
        gpay.newFunction();


    }


}
