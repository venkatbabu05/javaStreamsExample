package com.java8.streamsExample.primitiveStreams;

import java.util.Arrays;
import java.util.List;

public class DuplicateWordFromListOfString {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("java react spring java","java react spring java");

        //solution1
        long test = input.stream().mapToLong(e -> Arrays.stream(e.split(" ")).filter(a->a.equalsIgnoreCase("java")).count()).sum();

        //solution2
        long test1 = input.stream().map(e -> Arrays.stream(e.split(" ")).filter(v->v.equalsIgnoreCase("java"))).count();

        System.out.println(test);
    }
}
