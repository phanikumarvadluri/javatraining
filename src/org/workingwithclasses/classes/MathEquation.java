package com.org.workingwithclasses.classes;

public class MathEquation {

     double leftValue;
     double rightValue;
     char opsCode;
     double result;

     void execute() {
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
