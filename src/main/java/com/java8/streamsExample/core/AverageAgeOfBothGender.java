package com.java8.streamsExample.core;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeOfBothGender {

    public static void main(String[] args) {
        List<Employee> employeeList = LoadEmployees.getEmployeeDate();
        Map<String,Double> output =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        output.forEach((k,v)->System.out.println("Gender = "+k+" Average age = "+v));
    }
}
