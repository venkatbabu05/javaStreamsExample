package com.java8.streamsExample.StreamsWithObject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmpByCityAndSortByName {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        List<Employee> bloreEmp = input.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore"))
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        bloreEmp.forEach(e->System.out.println(e));
    }
}
