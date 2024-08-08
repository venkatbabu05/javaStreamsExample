package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxEmpCountByDept {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Optional<Map.Entry<String, Long>> stringLongEntry = input.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(stringLongEntry.get());
    }
}
