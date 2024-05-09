package com.org.workingwithclasses;

import com.org.workingwithclasses.accessmodifiers.Flights;

public class Outsidepackage {
    public static void main(String[] args) {
        Flights flights = new Flights();
        flights.addPassenger();

//        System.out.println(flights.passengers);
//        System.out.println(flights.seats);
    }
}
