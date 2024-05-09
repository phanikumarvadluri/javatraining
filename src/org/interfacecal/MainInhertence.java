package com.org.interfacecal;

import java.util.Scanner;

public class MainInhertence {

    public static void main(String[] args) {
        dynamicinteractivity();
    }

    private static void dynamicinteractivity() {
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Divide()
        });

        System.out.println("Enter an operation divide two numbers");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        helper.procesing(userInput);
    }
}
