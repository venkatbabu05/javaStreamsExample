package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.stream.Collectors;

public class SortEmpAgeAndName {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        List<Employee> output = input.stream().sorted((emp1, emp2) -> {
            int ageCompare = Integer.compare(emp1.getAge(), emp2.getAge());
            if (ageCompare != 0) {
                return ageCompare;
            }
            return emp1.getName().compareTo(emp2.getName());
        }).collect(Collectors.toList());
        output.forEach(e -> System.out.println(e));
    }
}
