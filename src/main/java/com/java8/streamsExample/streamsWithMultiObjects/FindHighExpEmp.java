package com.java8.streamsExample.streamsWithMultiObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

public class FindHighExpEmp {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();

        Employee employee = input.stream().min(Comparator.comparing(emp -> {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(emp.getDateOfJoining(), formatter);
            return date;
        }
        )).get();
        System.out.println(employee);
    }
}
