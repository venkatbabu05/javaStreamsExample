package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmpCountByDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, Long> output = input.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        output.forEach((k,v)->System.out.println("Dept Name : "+k+" | EmpCount : "+v));
    }
}
