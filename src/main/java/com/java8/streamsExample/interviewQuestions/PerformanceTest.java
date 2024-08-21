package com.java8.streamsExample.interviewQuestions;

import com.java8.streamsExample.StreamsWithObject.Employee;
import com.java8.streamsExample.StreamsWithObject.LoadEmployees;

import java.util.*;
import java.util.stream.Collectors;

public class PerformanceTest {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        long startTime = System.currentTimeMillis();
        input.stream().filter(e->e.getAge() >30).sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2)
                .forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        long total = endTime-startTime;
        System.out.println(total);
        long startTime1 = System.currentTimeMillis();
        List<Employee> collect = input.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30))
                .entrySet().stream().filter(e -> e.getKey() == true).flatMap(e -> e.getValue().stream())
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList());
        collect.forEach(System.out::println);
        long endTime1 = System.currentTimeMillis();
        long total1 = endTime1-startTime1;
        System.out.println(total1);
        //Object or ref::MethodName
    }
}
