package com.org.loops;

public class Dowhile {

    public static void main(String[] args) {
        int iVal = 105;// 10
        do{
            System.out.print(iVal);
            System.out.print(" * 2 =");
            iVal=iVal*2;
            System.out.println(iVal);
        }
        while(iVal<100);
    }
}
