package com.java8.streamsExample.StreamsWithObject;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighSalEachDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();

        //this is to get dept and high salary in each dept
        input.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.mapping(Employee::getSalary, Collectors.maxBy(Comparator.naturalOrder()))))
                .forEach((k, v) -> System.out.println(k + " " + v.get()));

        //this is to get dept and emp object which has high salary in each dept
        Map<String, List<Employee>> collect = input.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        collect.forEach((dept, empList) -> {
            Optional<Employee> sortedEmp = empList.stream().max(Comparator.comparing(Employee::getSalary));
            System.out.println("DeptName =" + dept + " EmpList =" + sortedEmp);
        });
    }
}
