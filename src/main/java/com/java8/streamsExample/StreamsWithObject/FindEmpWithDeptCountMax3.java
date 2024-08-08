package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmpWithDeptCountMax3 {
    public static void main(String[] args) {
        List<Employee> input=  LoadEmployees.getEmployeeDate();
        List<Map.Entry<String, Long>> collect = input.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 2).collect(Collectors.toList());
        collect.forEach(e->System.out.println(e));

    }
}
