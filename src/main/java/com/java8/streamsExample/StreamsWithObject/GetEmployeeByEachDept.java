package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetEmployeeByEachDept {
    public static void main(String[] args) {
        List<Employee> input =  LoadEmployees.getEmployeeDate();
        Map<String,List<Employee>> output = input.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        output.forEach((k,v)->System.out.println(k+v));
    }
}
