package com.org.understandingmethods;

public class SwitchStatementArray {

    public static void main(String[] args) {

        double[] leftvals = {100.0d, 25.0d, 22.0d, 11.0d};
        double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opscode = {'d', 'a', 's', 'm'};
        double res[] = new double[opscode.length];

        if (args.length == 0) {
            for (int i = 0; i < opscode.length; i++) {
                res[i] = execute(opscode[i], leftvals[i], rightvals[i]);
            }
            System.out.println(res);
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        } else if (args.length == 3) {
            handleCommandLine(args);
        }

        else {
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    private static void handleCommandLine(String[] args) {
        char opsCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightValue = Double.parseDouble(args[2]);
        double res = execute(opsCode, leftVal, rightValue);
        System.out.println(res);
    }

    static double execute(char opCode, double leftvalue, double rightValue) {
        double result = 0.0d;

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
        return result;
    }
}
