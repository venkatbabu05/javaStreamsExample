package com.java8.streamsExample.core;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMenAvgSalByDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, List<Employee>> collect = input.stream().filter(e -> e.getGender().equalsIgnoreCase("M")).collect(Collectors.groupingBy(Employee::getDeptName));
        collect.forEach((dept, empList) -> {
            Double collect1 = empList.stream().collect(Collectors.averagingLong(Employee::getSalary));
            System.out.println("Dept = " + dept + " AvgSal =" + collect1);
        });
    }
}
