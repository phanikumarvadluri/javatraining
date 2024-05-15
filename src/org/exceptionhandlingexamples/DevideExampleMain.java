package com.org.exceptionhandlingexamples;

public class DevideExampleMain {

    public static void main(String[] args) {


        //uncheck exception : while compile (javac) we dont any exception and at run time we are going to get a exception is called uncheked exception

        DivideExample divideExample = new DivideExample();
        int result = 0;
        try {
            result = divideExample.divide(100,  0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occured while divide with zero");
            System.out.println(e.getMessage());
        }
        System.out.println("Result is " + result);
        System.out.println("Program is completed");
    }
}
