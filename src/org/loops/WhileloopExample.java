package com.org.loops;

public class WhileloopExample {


    /*


    logic for factorial is
    example:

    10
    7*6*5*4*3*2*1=  5040
     */
    public static void main(String[] args) {
        int someValue = 10; //3 //2  //1
        int factorial = 1;//1*4= 4//4*3=12// 12*2=24
//while(1>1)
        //while(false)

        while (someValue > 1) {
            factorial = factorial * someValue;
            someValue--;
        }
        System.out.println(factorial);
    }
}
