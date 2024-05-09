package com.org.inhertence;

public class MainInhertence {

    public static void main(String[] args) {

     Multiply multiply=new Multiply();
     doCalculation(multiply,100.0d,50.0d);

    }

    static void doCalculation(CalculateBase calculateBase,double leftValue,double rightValue)
    {
        calculateBase.setLeftValue(leftValue);
        calculateBase.setRightValue(rightValue);
        calculateBase.calculate();
        System.out.println("calculation result ="+calculateBase.getResult());
    }
}
