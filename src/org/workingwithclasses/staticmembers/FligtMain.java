package com.org.workingwithclasses.staticmembers;

public class FligtMain {

    public static void main(String[] args) {
        Flight flight=new Flight();
        flight.passengers=10;
        flight.seats=30;

        Flight flight1=new Flight();
        flight1.passengers=20;

        flight.addPassengers();
        flight1.addPassengers();

        System.out.println(Flight.getAllPassengers());
    }
}
