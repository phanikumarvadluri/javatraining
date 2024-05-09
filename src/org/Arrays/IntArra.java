package com.org.Arrays;

public class IntArra {
    public static void main(String[] args) {
//        int[] theVals = new int[4];
//        theVals[0] = 10;
//        theVals[1] = 20;
//        theVals[2] = 30;
//        theVals[3] = 40;

        int[] theVals={10,20,30,40};

        int res = 0;

        for (int i = 0; i < theVals.length; i++) {
            res = res + theVals[i];
        }
        System.out.println(res);
    }
}
