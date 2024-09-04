package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortWords {
    public static void main(String[] args) {
        String input = "I am John I am an engineer I am also a developer";

        List<String> duplicate = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).flatMap(e -> {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i < e.getValue(); i++) {
                        list.add(e.getKey());
                    }
                    return list.stream();
                }).map(e -> e.toLowerCase()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        List<String> unique = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey().toLowerCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        duplicate.forEach(e -> System.out.print(e + " "));
        unique.forEach(e -> System.out.print(e + " "));
    }
}
