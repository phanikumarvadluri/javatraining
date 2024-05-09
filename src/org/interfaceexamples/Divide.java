package com.org.interfaceexamples;

public class Divide extends CalculateBase {
    public Divide()
    {
    }
    public Divide(double leftValue,double rightValue)
    {
        super(leftValue, rightValue);
    }

    public void calculate() {
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }
}
