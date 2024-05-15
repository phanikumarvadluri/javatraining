package com.org.exceptionhandlingexamples;

public class NullpointExample  {
    public int getLength(String input)  {
        int result = 0;
        try {
            result = input.length();
        } catch (NullPointerException e) {
            System.out.println("User entered null value, Please enter valid String!!!");
        }
        return result;
    }
}
