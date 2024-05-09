package com.org.interfacecal;

public class Multiply extends CalculateBase implements MathProcessing{

    public Multiply() {
    }

    public Multiply(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public void calculate() {
        double value = getLeftValue() * getRightValue();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "multiply";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
