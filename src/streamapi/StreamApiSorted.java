package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSorted {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("PHani", 30, 'M',1001));
        list.add(new Employee("Rajesh", 36,'M', 1002));
        list.add(new Employee("kiran", 26,'F', 1003));
        list.add(new Employee("rekha", 25, 'F',1004));
        list.add(new Employee("sujan", 24, 'M',1005));


        List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(collect);


    }
}
