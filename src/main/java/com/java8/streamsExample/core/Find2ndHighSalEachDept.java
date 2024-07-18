package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find2ndHighSalEachDept {
    public static void main(String[] args) {
       List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, List<Employee>> collect = input.stream().collect(Collectors.groupingBy(Employee::getDeptName));
    collect.forEach((dept,empList)->{
        Optional<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(sorted.get());
    });
    }
}
