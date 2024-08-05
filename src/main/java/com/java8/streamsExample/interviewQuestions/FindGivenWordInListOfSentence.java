package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindGivenWordInListOfSentence {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("java react spring java","java react spring java");
        Map<String, Long> output = input.stream().flatMap(e -> Stream.of(e.split(" "))).filter(e->e.equals("java")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        output.entrySet().forEach(System.out::println);
    }

}


