package com.org.workingwithclasses.constructors;

public class Passenger {

    int freeBags;
    int checkBags;

    public Passenger() {

    }

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkBags) {
        this(freeBags);
        this.checkBags = checkBags;
    }
}
