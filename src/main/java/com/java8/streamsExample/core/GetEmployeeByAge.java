package com.java8.streamsExample.core;

import java.util.List;
import java.util.stream.Collectors;

public class GetEmployeeByAge {
    public static void main(String[] args) {
     List<Employee> empList =LoadEmployees.getEmployeeDate();
     empList.stream().filter(e->e.getAge()==28).collect(Collectors.toList())
             .forEach(e->System.out.println(e));
    }
}
