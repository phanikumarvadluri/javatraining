package com.org.workingwithclasses.passingObejectsasparameters;

import java.awt.*;

public class Flight {
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    int flightNumber;

    public Flight() {

    }

    public Flight(int flightno) {
        flightNumber = flightno;
    }


    public static void swapFlight(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
    }
}
