package com.org.workingwithclasses.passingObejectsasparameters;

public class FligtMaoin {

    public static void main(String[] args) {

        Flight f1 = new Flight(10);
        Flight f2 = new Flight(20);

        System.out.println(f1.flightNumber);
        System.out.println(f2.flightNumber);


        Flight.swapFlight(f1,f2);

        System.out.println(f1.flightNumber);
        System.out.println(f2.flightNumber);

    }
}
