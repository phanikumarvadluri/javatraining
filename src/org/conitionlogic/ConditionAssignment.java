package com.org.conitionlogic;

public class ConditionAssignment {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        //conditional operator
        int res= (a>b)? (a+b): (a-b);
        System.out.println(res);
    }
}
