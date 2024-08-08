package com.java8.streamsExample.interviewQuestions;

import com.java8.streamsExample.StreamsWithObject.Employee;
import com.java8.streamsExample.StreamsWithObject.LoadEmployees;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IncrementEmpSal {

    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();

        List<Employee> collect = input.stream().filter(e -> e.getAge() > 32).map(e->{
            e.setSalary(e.getSalary() + e.getSalary()*20/100);
            return e;
        }).sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
