package com.java8.streamsExample.StreamsWithObject;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByNameAndAge {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Function<Employee,String> toUppercase = emp->emp.getName().toLowerCase();
        List<Employee> output = input.stream().sorted(Comparator.comparing(toUppercase).thenComparing(Employee::getAge)).collect(Collectors.toList());
        output.forEach(e->System.out.println(e));
    }
}
