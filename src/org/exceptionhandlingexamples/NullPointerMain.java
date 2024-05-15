package com.org.exceptionhandlingexamples;

public class NullPointerMain {
    public static void main(String[] args) {
        NullpointExample nullpointExample=new NullpointExample();
        int java = nullpointExample.getLength(null);
        System.out.println(java);
    }
}
