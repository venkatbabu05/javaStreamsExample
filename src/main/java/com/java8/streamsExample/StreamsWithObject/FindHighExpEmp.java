package com.java8.streamsExample.StreamsWithObject;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHighExpEmp {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Optional<Employee> maxExpEmp = input.stream().min(Comparator.comparing(Employee::getYearOfJoining));
    System.out.println(maxExpEmp.get());
    }
}
