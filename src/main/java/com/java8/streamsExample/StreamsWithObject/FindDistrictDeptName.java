package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.stream.Collectors;

public class FindDistrictDeptName {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        List<String> output = input.stream().map(e->e.getDeptName()).distinct().collect(Collectors.toList());
        output.forEach(e->System.out.println(e));
    }
}
