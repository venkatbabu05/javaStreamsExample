package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindAvgAndTotSal {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Double avgSal = input.stream().collect(Collectors.averagingLong(Employee::getSalary));
        System.out.println(avgSal);
        double totSal = input.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totSal);
    }
}
