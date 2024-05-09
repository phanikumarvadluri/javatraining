package com.org.workingwithclasses.classes;

public class Person {
    //variables
    int age;
    int id;
    String name;

    //constructor
    //it dont have return type
    Person() {
        System.out.println("person constucter is called");
        age=30;
        id=34;
        name="java";
    }

    void addPerson() {
        System.out.println("Person is Created");
    }
}
