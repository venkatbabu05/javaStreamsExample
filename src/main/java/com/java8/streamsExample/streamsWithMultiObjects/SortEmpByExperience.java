package com.java8.streamsExample.streamsWithMultiObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEmpByExperience {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();

        Function<Employee, LocalDate> dateOfJoin = x -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(x.getDateOfJoining(), formatter);
            return date;
        };

        List<Employee> collect = input.stream().sorted(Comparator.comparing(dateOfJoin)).collect(Collectors.toList());
        //collect.forEach(e->System.out.println(e));

        List<LocalDate> collect1 = input.stream().map(e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(e.getDateOfJoining(), formatter);
            return date;
        }).collect(Collectors.toList());

        collect1.forEach(e->System.out.println(e));

    }


}
