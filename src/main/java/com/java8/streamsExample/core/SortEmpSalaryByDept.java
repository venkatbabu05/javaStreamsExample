package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmpSalaryByDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Map<String, List<Employee>> collect = input.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        System.out.println("Ascending order");
        collect.forEach((dept, empList) -> {
            List<Employee> sortedEmp = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
            System.out.println("Dept Name :"+dept+" | Emp Details :"+ sortedEmp);
        });

        System.out.println("Descending order");
        collect.forEach((dept, empList) -> {
            List<Employee> sortedEmp = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
            System.out.println("Dept Name :"+dept+" | Emp Details :"+ sortedEmp);
        });
    }
}
