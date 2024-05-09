package com.org.moredatatypes;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        checkRelationShip(instant);
    }

    static void checkRelationShip(Instant otherInstant)
    {
        Instant instant = Instant.now();
        System.out.println(instant);
        if(otherInstant.compareTo(instant)>0)
        {
            System.out.println("Instant is future");
        }
        else if(otherInstant.compareTo(instant)<0)
        {
            System.out.println("Instant is past");
        }
        else{
            System.out.println("Now");
        }
    }
}
