package com.java8.streamsExample.core;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find2HighSal {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Optional<Long> collect = input.stream().map(e->e.getSalary()).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(collect.get());
    }
}
