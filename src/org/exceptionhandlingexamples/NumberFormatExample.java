package com.org.exceptionhandlingexamples;

public class NumberFormatExample {
    public static void main(String[] args) {
        NumberFormat numberFormat = new NumberFormat();
        int element = 0;
        try {
            element = numberFormat.getElement("777iiiooi");
            System.out.println(element);
        } catch (NumberFormatException e) {//
            System.out.println(e.getMessage());
            System.out.println("Please enter a valid input , input is strictly a number!!!!");
        } finally {
            System.out.println("irrespective of any issue this block is going to be executed");// this is going to be use for resource close
        }

    }
}
