package com.java8.streamsExample.streamsWithObjects;

import com.java8.streamsExample.streamsWithObjects.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeById {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        List<Employee> collect = input.stream().sorted(Comparator.comparing(e->e.getName().toUpperCase())).collect(Collectors.toList());
        collect.forEach(emp->System.out.println(emp));
    }
}
