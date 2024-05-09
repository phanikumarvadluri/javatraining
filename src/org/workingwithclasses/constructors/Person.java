package com.org.workingwithclasses.constructors;

public class Person {
    int panId;
    String name;
    char gender;
    boolean marritalStatus;
    double salary;

    //it is not taking any parameters
    public Person() {

    }

    public Person(int panId, String name) {
        this.panId = panId;
        this.name = name;
    }


    //it is  taking  parameters
     Person(int panId, String name, char gender, boolean marritalStatus, double salary) {
        this(panId,name);
        this.gender = gender;
        this.marritalStatus = marritalStatus;
        this.salary = salary;
    }
}
