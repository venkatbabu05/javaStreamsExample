package com.java8.streamsExample.core;

import java.util.List;

public class FindEmpCount {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Long count = input.stream().count();
        System.out.println(count);
    }
}
