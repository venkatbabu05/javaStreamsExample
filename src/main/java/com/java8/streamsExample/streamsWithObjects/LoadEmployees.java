package com.java8.streamsExample.streamsWithObjects;

import java.util.ArrayList;
import java.util.List;

public class LoadEmployees {
    public static List<Employee> getEmployeeDate() {
        List<Employee> empList = new ArrayList<>();
        List<Department> hrList = new ArrayList<>();
        hrList.add(new Department(1, "HR"));
        List<Department> baList = new ArrayList<>();
        baList.add(new Department(2, "BA"));
        List<Department> devList = new ArrayList<>();
        devList.add(new Department(3, "Dev"));
        List<Department> testingList = new ArrayList<>();
        testingList.add(new Department(4, "Testing"));

        empList.add(new Employee(1, "babu", 28, 100, "M", hrList, "Blore", "2020-01-01"));
        empList.add(new Employee(2, "Skip", 27, 200, "F", devList, "Chennai", "2015-05-01"));
        empList.add(new Employee(3, "Marion", 30, 300, "M", testingList, "Hyderabad", "2017-02-01"));
        empList.add(new Employee(4, "Carmine", 32, 400, "M", baList, "Pune", "2022-03-01"));
        empList.add(new Employee(5, "bob", 31, 500, "F", hrList, "Blore", "2023-04-01"));
        empList.add(new Employee(6, "Tabbitha", 45, 1000, "M", devList, "Chennai", "2018-06-01"));
        empList.add(new Employee(7, "avb", 31, 900, "F", testingList, "Hyderabad", "2017-07-01"));
        empList.add(new Employee(8, "Rachele", 33, 800, "M", baList, "Pune", "2018-08-01"));
        empList.add(new Employee(9, "Roosevelt", 26, 700, "F", devList, "Chennai", "2021-09-01"));
        empList.add(new Employee(10, "Slade", 29, 600, "M", testingList, "Pune", "2015-04-01"));
        return empList;
    }


}
