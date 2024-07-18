package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestSal {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Optional<Employee> maxSal = input.stream().max((emp1, emp2) -> {
            return Long.compare(emp1.getSalary(), emp2.getSalary());
        });
        System.out.println(maxSal.get());
    }
}
