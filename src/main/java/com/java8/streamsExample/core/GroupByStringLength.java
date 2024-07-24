package com.java8.streamsExample.core;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByStringLength {
    public static void main(String[] args) {
       /* List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, List<Employee>> collect = input.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        Map<String,List<Long>> sortedMap = new HashMap<>();
        collect.forEach((dept, empList) -> {
            List<Long> sortedSal = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).map(e -> e.getSalary()).collect(Collectors.toList());
            sortedMap.put(dept,sortedSal);
            //System.out.println(dept+" | "+sortedSal);
        });
        sortedMap.forEach((k,v)->System.out.println(k+v));*/

        List<String> input = Arrays.asList("two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve");
        Map<Integer,List<String>> output = input.stream().collect(Collectors.groupingBy(e->e.length()));// String::length
        output.forEach((k,v)->System.out.println(k+""+v));
    }
}
