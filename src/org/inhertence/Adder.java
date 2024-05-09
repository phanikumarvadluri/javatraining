package com.org.inhertence;

public class Adder extends CalculateBase {
    public void calculate() {
        double value = getLeftValue() + getRightValue();
        setResult(value);
    }
}
