package com.org.inhertence;

public class Multiply extends CalculateBase {

    public void calculate() {
        double value = getLeftValue() * getRightValue();
        setResult(value);
    }

}
