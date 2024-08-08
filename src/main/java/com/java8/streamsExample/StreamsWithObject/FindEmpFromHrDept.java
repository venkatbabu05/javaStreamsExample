package com.java8.streamsExample.StreamsWithObject;

import java.util.List;

public class FindEmpFromHrDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        boolean result = input.stream().anyMatch(e -> e.getDeptName().equalsIgnoreCase("HR"));
        System.out.println(result);
    }
}
