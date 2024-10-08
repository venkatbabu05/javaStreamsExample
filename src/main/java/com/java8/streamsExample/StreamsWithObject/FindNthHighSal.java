package com.java8.streamsExample.StreamsWithObject;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindNthHighSal {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        int n=2;
        Optional<Employee> nthHighSal = input.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(n - 1).findFirst();
        System.out.println(nthHighSal.get());
    }
}
