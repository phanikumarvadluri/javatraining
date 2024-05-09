package com.org.workingwithclasses.accessmodifiers;

 public class Flights {

     private int passengers;
     private int seats;

    public Flights()
    {
        passengers=1;
       System.out.println("Flight constucter is created");
        System.out.println("passengers count"+passengers);
    }

    public void addPassenger()
    {
         System.out.println("add passenger");
         addPassenger1();
    }

     public boolean hasRoom(Flights f1)
     {
       return true;
     }

    private void addPassenger1() {
       System.out.println("inside private passenger");
    }
 }
