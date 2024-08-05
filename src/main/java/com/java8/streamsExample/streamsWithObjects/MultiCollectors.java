package com.java8.streamsExample.streamsWithObjects;

import java.util.List;
import java.util.stream.Collectors;

public class MultiCollectors {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Sarah", "Mark");
        String collect = names.stream().collect(Collectors.joining(","));
        System.out.println(collect);
        String collect1 = names.stream().collect(Collectors.collectingAndThen(Collectors.joining(","),String::toUpperCase));
        System.out.println(collect1);
    }
}
