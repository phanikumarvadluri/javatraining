package com.org.conitionlogic;

public class IFElseCalExample {

    public static void main(String[] args) {

        double val1 = 100.0d;
        double val2 = 50.0d;
        double res = 0.0d;
        char opCode = 'a';
        if (opCode == 'a') {
            res = val1 + val2;
        } else if (opCode == 's') {
            res = val1 - val2;
        } else if (opCode == 'm') {
            res = val1 * val2;
        } else if (opCode == 'd') {
            res = val1 / val2;
        }
        System.out.println(res);
    }
}
