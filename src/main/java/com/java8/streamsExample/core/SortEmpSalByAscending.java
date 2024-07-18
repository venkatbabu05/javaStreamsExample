package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpSalByAscending {
    public static void main(String[] args) {
        List<Employee> input =  LoadEmployees.getEmployeeDate();
        input.stream().sorted(Comparator.comparing(Employee::getSalary)).map(e->e.getSalary()).collect(Collectors.toList())
                .forEach(e->System.out.println(e));
    }
}
