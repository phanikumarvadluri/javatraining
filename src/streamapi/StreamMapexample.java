package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapexample {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("PHani", 30, 'M', 1001));
        list.add(new Employee("Rajesh", 36, 'M', 1002));
        list.add(new Employee("kiran", 26, 'F', 1003));
        list.add(new Employee("rekha", 25, 'F', 1004));
        list.add(new Employee("sujan", 24, 'M', 1005));

        List<Integer> collect = getEmployeesGreaerthan30(list);
        System.out.println(collect);

    }

    private static List<Integer> getEmployeesGreaerthan30(List<Employee> list) {
        List<Integer> collect = list.stream().filter(value -> value.getAge() >= 30).map(x -> x.getId()).collect(Collectors.toList());
        return collect;
    }

//    private static List<Integer> getEmployeesGreaerthan30(List<Employee> list) {
//
//        List<Integer> new30ageREMployes = new ArrayList<>();
//        for (Employee employee : list) {
//            if (employee.getAge() >= 30) {
//                new30ageREMployes.add(employee.getId());
//            }
//        }
//
//    }

}
