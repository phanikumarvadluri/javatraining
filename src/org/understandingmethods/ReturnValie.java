package com.org.understandingmethods;

public class ReturnValie {

    public static void main(String[] args) {
        double res = calculateINterest(100d, 0.05d, 10);
        System.out.println(res);
    }

    static double calculateINterest(double amount, double rate, int years) {
        double interest = amount * rate * years;
        return interest;
    }
}
