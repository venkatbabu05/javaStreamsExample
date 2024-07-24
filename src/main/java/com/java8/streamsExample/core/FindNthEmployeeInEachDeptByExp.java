package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNthEmployeeInEachDeptByExp {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        int p = 2;
        Map<String, List<Employee>> collect = input.stream().collect(Collectors
                .groupingBy(Employee::getDeptName));
        collect.forEach((dept, empList) -> {
            List<Employee> sortedEmp = empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).collect(Collectors.toList());
            if (sortedEmp.size() > p) {
                Employee emp = sortedEmp.get(p - 1);
                System.out.println(emp);
            } else {
                System.out.println("nth position is greater than employee list in the Department :" + dept);
            }
        });


        /*Map<String, Optional<Employee>> collect1 = input.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));
        collect1.forEach((k,v)->System.out.println(k+" "+v.get()));*/
    }
}
