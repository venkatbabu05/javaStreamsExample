package com.java8.streamsExample.streamsWithObjects;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAvgExperience {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();

        Function<Employee,Long> func = e->{
            LocalDate cur = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate doj = LocalDate.parse(e.getDateOfJoining(),formatter);
            long diff = ChronoUnit.DAYS.between(cur,doj);
            System.out.println(diff);
            return diff;
        };

        List<Employee> collect = input.stream().sorted(Comparator.comparing(func)).collect(Collectors.toList());
        collect.forEach(e->System.out.println(e));
    }
}
