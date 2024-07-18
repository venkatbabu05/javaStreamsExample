package com.java8.streamsExample.core;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHighSalByGender {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
       Map<String, Optional<Long>> collect = input.stream().collect(Collectors.groupingBy(
                Employee::getGender, Collectors.mapping(Employee::getSalary, Collectors.maxBy(Comparator.naturalOrder()))));
        collect.forEach((k,v)->System.out.println(k+" = "+v.get()));

    }
}
