package com.java8.streamsExample.core;

import java.util.List;
import java.util.stream.Collectors;

public class CountEmployeeByGender {

    public static void main(String[] args) {
        List<Employee> empList = LoadEmployees.getEmployeeDate();
        empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                .forEach((k,v)->System.out.println("Gender = "+k+" Count = "+v));
    }
}
