package com.org.inhertence;

public class Divide extends CalculateBase {
    public void calculate() {
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }
}
