package com.org.interfaceexamples;

public class Adder extends CalculateBase {
    public Adder() {

    }

    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public void calculate() {
        double value = getLeftValue() + getRightValue();
        setResult(value);
    }
}
