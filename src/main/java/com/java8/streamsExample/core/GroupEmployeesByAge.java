package com.java8.streamsExample.core;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByAge {
    public static void main(String[] args) {
        List<Employee> empList = LoadEmployees.getEmployeeDate();
        empList.stream().collect(Collectors.groupingBy(Employee::getAge))
                .forEach((k,v)->System.out.println(k+""+v));

    }
}
