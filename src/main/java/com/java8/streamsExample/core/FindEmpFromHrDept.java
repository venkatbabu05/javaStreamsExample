package com.java8.streamsExample.core;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindEmpFromHrDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        boolean result = input.stream().anyMatch(e -> e.getDeptName().equalsIgnoreCase("HR"));
        System.out.println(result);
    }
}
