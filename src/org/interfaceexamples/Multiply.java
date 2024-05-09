package com.org.interfaceexamples;

public class Multiply extends CalculateBase {

    public Multiply() {
    }

    public Multiply(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public void calculate() {
        double value = getLeftValue() * getRightValue();
        setResult(value);
    }
}
