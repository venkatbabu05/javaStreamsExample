package com.java8.streamsExample.concepts;

import com.java8.streamsExample.StreamsWithObject.Employee;
import com.java8.streamsExample.StreamsWithObject.LoadEmployees;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparable {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        input.forEach(System.out::println);
        //the below method only accepts emplist when its implements comparable.
        Collections.sort(input);
        System.out.println("************");
        input.forEach(System.out::println);
        /*Comparator<Employee> comp = Comparator.comparing(o -> o.getName().toLowerCase());
        Collections.sort(input,comp);
        System.out.println("************");
        input.forEach(System.out::println);
        Collections.sort(input,comp.thenComparing(o->o.getAge()));
        System.out.println("************");
        input.forEach(System.out::println);*/
    }
}
