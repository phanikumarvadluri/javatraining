package com.org.conitionlogic;

public class IfExample {
    public static void main(String[] args) {

        int val1 = 90;  // this value
        int val2 = 10;  //

        if (val1 > val2) {
            System.out.println("val1 is bigger");
        }
        else if(val2>val1)
        {
            System.out.println("val2 is bigger");
        }
        else {
            System.out.println("both are equal");
        }
    }
}
