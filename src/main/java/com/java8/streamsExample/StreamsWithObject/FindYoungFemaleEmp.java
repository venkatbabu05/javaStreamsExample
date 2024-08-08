package com.java8.streamsExample.StreamsWithObject;

import java.util.List;
import java.util.Optional;

public class FindYoungFemaleEmp {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Optional<Employee> emp = input.stream().filter(e -> e.getGender().equalsIgnoreCase("F"))
                        .min((emp1,emp2)->Integer.compare(emp1.getAge(),emp2.getAge()));
        System.out.println(emp.isPresent()?emp.get():null);
    }
}
