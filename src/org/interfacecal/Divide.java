package com.org.interfacecal;

public class Divide extends CalculateBase implements MathProcessing{
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

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
