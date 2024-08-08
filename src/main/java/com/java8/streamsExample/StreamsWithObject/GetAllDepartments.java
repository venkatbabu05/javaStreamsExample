package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.stream.Collectors;

public class GetAllDepartments {
    public static void main(String[] args) {
        List<Employee> empList = LoadEmployees.getEmployeeDate();
        List<String> deptName = empList.stream().map(e->e.getDeptName()).distinct().collect(Collectors.toList());
        deptName.forEach(e->System.out.println(e));
    }
}
