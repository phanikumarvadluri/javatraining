package com.org.conitionlogic;

public class LogicalOr2 {

    public static void main(String[] args) {
        int num = 0;
        //if(false||false)
        //if(false)
        if (num > 0 || num < 0) {
            System.out.println("positive number or negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
