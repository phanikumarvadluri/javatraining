package com.org.interfaceexamples;

public class MainInhertence {

    public static void main(String[] args) {

        CalculateBase[] calculateBases={
                new Adder(100.0d,50.0d),
                new Multiply(100.0d,50.0d),
                new Divide(100.0d,50.0d),
        };

        System.out.println();
        System.out.println("Array calculations");


        for (CalculateBase calculateBase:calculateBases)
        {
            calculateBase.calculate();
            System.out.println("result==="+calculateBase.getResult());
        }

    }


}
