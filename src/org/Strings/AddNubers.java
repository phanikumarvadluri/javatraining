package com.org.Strings;

public class AddNubers {

    public static void main(String[] args) {

        int val2 = 10;
        int val1 = 20;
        int result = addNumber(val1, val2);
        System.out.println(result);
        int[] inputValues = {1, 2, 3, 4, 7, 89};
        int i = addNumberArray(inputValues);
        System.out.println(i);
    }

    static int addNumber(int a, int b) {
        return a + b;
    }

    static int addNumberArray(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result = result + input[i];
        }

        return result;
    }
}
