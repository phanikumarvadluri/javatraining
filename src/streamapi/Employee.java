package com.streamapi;

import java.util.Comparator;
import java.util.Objects;

public class Employee {
    private String name;
    private int age;

    public char getGender() {
        return gender;
    }

    public Employee(String name, int age, char gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && gender == employee.gender && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, id);
    }

    private char gender;

    public Employee() {
    }

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
