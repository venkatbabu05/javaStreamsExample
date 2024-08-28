package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortWords {
    public static void main(String[] args) {
        String input = "I am John I am an engineer I am also a developer";

        Map<String, Long> duplicate = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, Long> unique = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        duplicate.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
                .toMap(Map.Entry::getKey,Map.Entry::getValue,(k,v)->k));

        List<String> op1 = new ArrayList<>();
        duplicate.forEach((k, v) -> {
            for (int i = 0; i < v; i++) {
                op1.add(k);
            }
        });

        List<String> op2 = new ArrayList<>();
        unique.forEach((k, v) -> {
            for (int i = 0; i < v; i++) {
                op2.add(k);
            }
        });
        op1.stream().map(e -> e.toLowerCase()).sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                .forEach(e -> System.out.print(e + " "));
        op2.stream().map(e -> e.toLowerCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
                .forEach(e -> System.out.print(e + " "));
    }
}
