package com.java8.streamsExample.interviewQuestions;

import com.java8.streamsExample.StreamsWithObject.Employee;
import com.java8.streamsExample.StreamsWithObject.LoadEmployees;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorAndThenEx {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        int p = 3;
        Map<String, Employee> output = input.stream().collect(Collectors.collectingAndThen(Collectors.groupingBy(Employee::getDeptName), grpData -> {
            Map<String, Employee> sortedData = new HashMap<>();
            grpData.forEach((dept, empList) -> {
                List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).collect(Collectors.toList());
                if (sortedList.size() >= p) {
                    sortedData.put(dept, sortedList.get(p - 1));
                } else {
                    System.out.println("Position is greater than employee list in Dept = " + dept);
                }

            });
            return sortedData;
        }));
        output.entrySet().forEach(System.out::println);
    }
}
