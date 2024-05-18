package com.org.multithreading;

public class VehicleMain {

    public static void main(String[] args) {
//        Vehicle vehicle = new Car();
//        String speed = vehicle.speed();
//        System.out.println(speed);


        Vehicle vehicle=new Vehicle() {
            @Override
            public String speed() {
                return "Nissan car";
            }
        };

        String speed = vehicle.speed();
        System.out.println(speed);


    }
}
