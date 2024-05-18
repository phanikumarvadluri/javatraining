package com.org.multithreading;

public class LamdaMain {
    public static void main(String[] args) {

        Vehicle vehicle = () -> {
            return "Nissan car";
        };

        String speed = vehicle.speed();
        System.out.println(speed);

    }
}
