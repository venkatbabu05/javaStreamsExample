package com.java8.streamsExample.streamsWithMultiObjects;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FIndMaxMinEmpInEachDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, Optional<Long>> maxSal = input.stream().collect(Collectors.groupingBy(e -> e.getDept().get(0).getDeptName(),
                Collectors.mapping(Employee::getSalary, Collectors.maxBy(Comparator.naturalOrder()))));
        maxSal.forEach((dept,empList)->System.out.println(dept+" | "+empList.get()));
        System.out.println("********************");
        Map<String, Optional<Long>> minSal = input.stream().collect(Collectors.groupingBy(e -> e.getDept().get(0).getDeptName(),
                Collectors.mapping(Employee::getSalary, Collectors.minBy(Comparator.naturalOrder()))));
        minSal.forEach((dept,empList)->System.out.println(dept+" | "+empList.get()));

    }
}
