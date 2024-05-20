package com.streamapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeUsecase {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("PHani", 30, 1001));
        list.add(new Employee("PHani", 30, 1001));
        list.add(new Employee("Rajesh", 36, 1002));
        list.add(new Employee("koiran", 26, 1003));
        list.add(new Employee("rekha", 25, 1004));
        list.add(new Employee("sujan", 24, 1005));
        list.add(new Employee("sujan", 24, 1006));

//        Set<Employee> set=new HashSet<>(list);
//
//        System.out.println(set);

        List<Employee> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);


//
//        for(Employee employee: list)
//        {
//            System.out.println(employee);
//        }

    }
}
