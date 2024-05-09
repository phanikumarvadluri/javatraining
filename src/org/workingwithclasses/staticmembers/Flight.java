package com.org.workingwithclasses.staticmembers;

public class Flight {
    int passengers;
    int seats;
    static int allPassengers;

    public static int getAllPassengers() {
        return allPassengers;
    }

    public void addPassengers() {
        if (passengers < seats) {
            passengers = passengers + 1;
            allPassengers += 1;
        }
    }
}
