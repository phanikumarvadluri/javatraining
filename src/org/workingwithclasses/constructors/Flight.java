package com.org.workingwithclasses.constructors;

public class Flight {

public Flight()
{
    System.out.println("constructor call");
}
    private int passengers;
    int seats=1;
    private int flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable=new boolean[seats];

    public int getPassengers() {
        return passengers;
    }

    public int getSeats() {
        return seats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public boolean[] getIsSeatAvailable() {
        return isSeatAvailable;
    }

// this is iniliation block
    {

        System.out.println("inilization block");
        passengers=90;
        seats=100;
        flightClass='B';
        flightNumber=98999;
        isSeatAvailable[0]=false;
    }
}
