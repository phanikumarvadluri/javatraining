package com.org.workingwithclasses.interfaces;

public class MathEquation {

    double leftvalue;
    double rightValue;
    char opCode;
    double result;
    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftvalue + rightValue;
                break;
            case 's':
                result = leftvalue - rightValue;
                break;
            case 'm':
                result = leftvalue * rightValue;
                break;
            case 'd':
                if (rightValue != 0) {
                    result = leftvalue / rightValue;
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
