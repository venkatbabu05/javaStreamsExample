package com.java8.streamsExample.core;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAvgSalEachDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String,Double> output = input.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingLong(Employee::getSalary)));
        output.forEach((k,v)->System.out.println("Dept : "+k+" | AvgSal : "+v));
    }
}
