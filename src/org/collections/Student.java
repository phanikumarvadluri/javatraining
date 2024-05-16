package com.org.collections;

public class Student {

    private String name;
    private int age;
    private int marks;
    private String cls;
    private String[] skills;

    public Student() {
    }

    public Student(String name, int age, int marks, String cls, String[] skills) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.cls = cls;
        this.skills = skills;
    }

    public String getName() {
        return name;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }



}
