package com.org.exceptionhandlingexamples;

public class IntArrayMain {

    public static void main(String[] args) {

        IntArraExample intArraExample=new IntArraExample();
        int element=0;
        int[] inut={1,2};
        try {
            element = intArraExample.getElement(inut);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Please enter array greater than  5 elements");
            System.out.println(exception.getMessage());
        }
        System.out.println(element);
    }

}
