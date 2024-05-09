package com.org.conitionlogic;

public class SwitchStatement {

    public static void main(String[] args) {

        double val1 = 100.0d;
        double val2 = 0.0d;
        double res = 0.0d;
        char opCode = 'd';

        switch (opCode) {
            case 'a':
                res = val1 + val2;
                break;
            case 's':
                res = val1 - val2;
                break;
            case 'm':
                res = val1 * val2;
                break;
            case 'd':
                if (val2 != 0) {
                    res = val1 / val2;
                } else {
                    System.out.println("given number val2 is zero");
                    res = 0.0;
                }
                break;
            default:
                System.out.println("invalid input");
                res = 0.0;
        }
        System.out.println(res);
    }
}
