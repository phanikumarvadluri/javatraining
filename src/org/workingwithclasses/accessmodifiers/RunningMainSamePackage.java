package com.org.workingwithclasses.accessmodifiers;

public class RunningMainSamePackage {

    public static void main(String[] args) {
        Flights flights1 = new Flights();
        Flights flights2 = new Flights();

        Flights flights3 = null;

        if (flights1.hasRoom(flights2)) {
            flights3 = new Flights();
        }

        System.out.println(flights3);
    }

}
