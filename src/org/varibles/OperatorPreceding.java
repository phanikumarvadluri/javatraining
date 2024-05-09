package com.org.varibles;

public class OperatorPreceding {
    /*

     */
    public static void main(String[] args) {
        int valA=21;
        int valB=6;
        int valC=3;
        int valD=1;

        int res1=valA-valB/valC;
        //int res1=21-6/3
        //21-2=19
        int res2=(valA-valB)/valC;
        //res2=(21-6)/3
        //5
        System.out.println(res1);
        System.out.println(res2);

        int res3= valA/valC * valD+valB;
        //res3= 21/3 * 1+6
        //res3= 7 * 1 + 6
        //res3=  7+6
        //res3 =13
        int res4=valA/(valC*(valD+valB));

        //res4=  21/(3*(6+1))
        //res4= 21/(3*7)
        //res4= 21/21
        //res4=1
        System.out.println(res3);
        System.out.println(res4);
    }
}
