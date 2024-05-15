package com.org.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistwithEmployee {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Address address1 = new Address();
        address1.setState("Delhi");
        address1.setCountry("IN");
        address1.setCity("Delhi");

        Address address2 = new Address();
        address2.setState("punjab");
        address2.setCountry("IN");
        address2.setCity("Chandigar");

        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);


        Employee employee1 = new Employee();
        employee1.setName("kunal");
        employee1.setSalary(25002.50d);
        employee1.setAddress(addresses);

        Employee employee2 = new Employee();
        employee2.setName("Phani");
        employee2.setSalary(25002.50d);
        employee2.setAddress(addresses);

        list.add(employee1);
        list.add(employee2);

        System.out.println(list);


    }

}
