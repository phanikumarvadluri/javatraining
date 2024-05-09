package com.org.workingwithclasses.constructors;

public class PersonMain {

    public static void main(String[] args) {
//
//        Person person=new Person();
//        Person person1=new Person(890,"name");

        Person person=new Person(890,"name",'F',false,8585.5);

        System.out.println(person.panId);
        System.out.println(person.marritalStatus);
        System.out.println(person.gender);
        System.out.println(person.name);
        System.out.println(person.salary);

    }
}
