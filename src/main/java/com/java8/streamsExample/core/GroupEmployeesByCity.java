package com.java8.streamsExample.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByCity {
    public static void main(String[] args) {
        List<Employee> empList = LoadEmployees.getEmployeeDate();
        Map<String, List<Employee>> output = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        output.forEach((k,v)->System.out.println(k+v));
    }
}
