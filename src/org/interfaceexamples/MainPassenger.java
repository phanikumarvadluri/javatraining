package com.org.interfaceexamples;

import java.util.Arrays;

public class MainPassenger {

    public static void main(String[] args) {
        Passenger[] passengers={
                new Passenger("lk",1,180),
                new Passenger("rahul",1,90),
                new Passenger("amith",3,730),
                new Passenger("lalith",2,150),
        };

        Arrays.sort(passengers);
        for(Passenger passenger:passengers)
        {
            System.out.println(passenger.getName());
        }
    }
}
