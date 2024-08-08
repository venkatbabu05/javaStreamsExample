package com.java8.streamsExample.StreamsWithObject;

import java.util.*;
import java.util.stream.Collectors;

public class FindLowSalByGender {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, Optional<Long>> collect = input.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getSalary, Collectors.minBy(Comparator.naturalOrder()))));
        collect.forEach((k,v)->System.out.println(k+" = "+v.get()));
    }
}
