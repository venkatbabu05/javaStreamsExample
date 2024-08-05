package com.java8.streamsExample.streamsWithObjects;

import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Function<Employee,String> func = emp ->emp.getName();
        Function<String,String> func1 = name ->name.toUpperCase();
        List<Employee> input = LoadEmployees.getEmployeeDate();
        Consumer<String> con = x->System.out.println(x);
        con.accept("");
        Predicate<String> pre = x->x.equalsIgnoreCase("Test");
        Supplier<Double> sup = ()->Math.random();
        List<Double> collect1 = Stream.generate(sup).limit(5).collect(Collectors.toList());
        List<String> collect = input.stream().map(func).collect(Collectors.toList());
        collect.forEach(e->System.out.println(e));
    }
}
