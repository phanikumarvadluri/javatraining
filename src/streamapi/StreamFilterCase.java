package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCase {

    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        list.add(new Employee("PHani", 30, 'M',1001));
        list.add(new Employee("Rajesh", 36,'M', 1002));
        list.add(new Employee("kiran", 26,'F', 1003));
        list.add(new Employee("rekha", 25, 'F',1004));
        list.add(new Employee("sujan", 24, 'M',1005));
        //List<Employee> agegreaterthan30 = new ArrayList<>();

//        for (Employee employee : list) {
//            if (employee.getAge() >= 30) {
//                agegreaterthan30.add(employee);
//            }
//        }
        //List<Employee> collect = list.stream().filter(x -> x.getAge() >= 30).collect(Collectors.toList());
       // System.out.println(collect);

        List<Employee> collect = list.stream().filter(x -> x.getGender() == 'F').collect(Collectors.toList());

        System.out.println(collect);
    }
}
