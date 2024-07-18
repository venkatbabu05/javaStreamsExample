package com.java8.streamsExample.core;

import java.util.ArrayList;
import java.util.List;

public class LoadEmployees {
    public static List<Employee> getEmployeeDate() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "babu", 28, 100, "M", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Skip", 27, 200, "F", "Dev", "Chennai", 2015));
        empList.add(new Employee(3, "Marion", 30, 300, "M", "Testing", "Hyderabad", 2017));
        empList.add(new Employee(4, "Carmine", 32, 400, "M", "BA", "Pune", 2022));
        empList.add(new Employee(5, "bob", 31, 500, "F", "HR", "Blore", 2023));
        empList.add(new Employee(6, "Tabbitha", 45, 1000, "M", "Dev", "Chennai", 2018));
        empList.add(new Employee(7, "avb", 31, 900, "F", "Testing", "Hyderabad", 2017));
        empList.add(new Employee(8, "Rachele", 33, 800, "M", "BA", "Pune", 2018));
        empList.add(new Employee(9, "Roosevelt", 26, 700, "F", "Dev", "Chennai", 2021));
        empList.add(new Employee(10, "Slade", 29, 600, "M", "Testing", "Pune", 2019));
        return empList;
    }
}
