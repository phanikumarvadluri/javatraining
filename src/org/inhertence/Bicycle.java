package com.org.inhertence;

public class Bicycle extends Object{

    private int gear;
    private int speed;


    public Bicycle()
    {
    }

    public Bicycle(int gear,int speed)
    {
        this.gear=gear;
        this.speed=speed;
    }

    public void applyBreak(int decrement)
    {
        speed=speed-decrement;
    }

    public void speedUp(int increment)
    {
        speed=speed+increment;
    }

    public String toString()
    {
        return ("No of gears are "+gear+ "speed of bicycle is "+speed);
    }
}
