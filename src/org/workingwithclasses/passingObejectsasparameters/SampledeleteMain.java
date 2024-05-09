package com.org.workingwithclasses.passingObejectsasparameters;

public class SampledeleteMain {

    public static void main(String[] args) {
        Sampledelete sampledelete=new Sampledelete();
//        Flight f1=new Flight(30);
//
//        int flightNumber = sampledelete.getFlightNumber(f1);
//        System.out.println(flightNumber);


        int flightNumber = sampledelete.getFlightNumber(new Flight(30));
        System.out.println(flightNumber);
    }
}
