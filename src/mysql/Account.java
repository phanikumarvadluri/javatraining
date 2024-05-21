package com.mysql;

import java.util.Date;

public class Account {

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account(int name, String phone, String date, String email) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.email = email;
    }

    int name;
    String phone;
    String date;
    String email;

    public Account() {
    }

}
