package com.org.conitionlogic;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        //if(10>20 && 10>30)
        //if(false && false)  false
        //if(false)
        //if conditon is true then only it will go inside.
        if (a > b && a > c) {
            System.out.println("a is bigger");
        }
        //else if(20>10 && 20>30)
        //else if(true && false)
        //else if(false)
        else if (b > a && b > c) {
            System.out.println("b is bigger");
        }
        //else if(30>10 && 30> 20)
        // else if(true && true)
        //else if(true)
        else if (c > a && c > b) {
            System.out.println("c is bigger");
        }
    }
}
