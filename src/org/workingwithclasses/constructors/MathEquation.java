package com.org.workingwithclasses.constructors;

public class MathEquation {

    private  double leftValue;
    private double rightValue;
    private char opsCode;
    private double result;

    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public char getOpsCode() {
        return opsCode;
    }

    public void setOpsCode(char opsCode) {
        this.opsCode = opsCode;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public MathEquation() {

    }

    public MathEquation(char opsCode) {
        this.opsCode = opsCode;
    }

    public MathEquation(double leftValue, double rightValue,char opsCode) {
        this(opsCode);
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public void execute(double leftValue,double rightValue) {
        this.leftValue=leftValue;
        this.rightValue=rightValue;
        execute();
    }



    public void execute() {
        switch (opsCode) {
            case 'a':
                result = leftValue + rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            case 'd':
                if (rightValue != 0) {
                    result = leftValue / rightValue;
                } else {
                    System.out.println("given number val2 is zero");
                }
                break;
            default:
                System.out.println("invalid input");
                result = 0.0d;
        }
    }
}
