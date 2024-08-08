package com.java8.streamsExample.StreamsWithObject;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxAgeEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = LoadEmployees.getEmployeeDate();
        Optional<Employee> maxAge = employeeList.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println(maxAge.get());
    }
}
