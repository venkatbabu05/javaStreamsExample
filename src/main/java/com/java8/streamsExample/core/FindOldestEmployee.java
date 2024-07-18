package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindOldestEmployee {
    public static void main(String[] args) {
       List<Employee> employeeList = LoadEmployees.getEmployeeDate();
       Optional output1 = employeeList.stream().max(Comparator.comparing(Employee::getAge));
       Optional<Employee> oldest2 = employeeList.stream().max((emp1, emp2) -> Integer.compare(emp1.getAge(), emp2.getAge()));
       System.out.println(output1.get());
        System.out.println(oldest2.get());
    }
}
