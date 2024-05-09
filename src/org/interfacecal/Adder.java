package com.org.interfacecal;

public class Adder extends CalculateBase implements MathProcessing{
    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }

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
