package com.org.Strings;

import java.time.LocalDate;
import java.util.Scanner;

public class SwitchStatementString {

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
        }
        else if(args.length==1 && args[0].equals("interactive"))
        {
            executeInteractively();
        }

        else if (args.length == 3) {
            handleCommandLine(args);
        } else {
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

    static void executeInteractively() {
        System.out.println("Enter an operation and two number: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);


    }

    private static void performOperation(String[] parts) {
        char opsCode = opsCodeFromString(parts[0]);
        if(opsCode=='w')
        {
            handlewhen(parts);
        }
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double res = execute(opsCode, leftVal, rightVal);
        System.out.println(res);

    }

    private static void handlewhen(String[] parts) {

        LocalDate localDate=
                LocalDate.parse(parts[1]);
        long daysToadd=(long)valueFromWord(parts[2]);
        LocalDate newDate=localDate.plusDays(daysToadd);
        String output=String.format("%s plus %d days is %s", localDate,daysToadd,newDate);
        System.out.println(output);

    }

    static char opsCodeFromString(String operationName) {
        char opscode = operationName.charAt(0);
        return opscode;
    }

    static double valueFromWord(String word) {

        String[] numberWords = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        double val = 0.0d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                val = index;
                break;
            }
        }
        return val;
    }
}
