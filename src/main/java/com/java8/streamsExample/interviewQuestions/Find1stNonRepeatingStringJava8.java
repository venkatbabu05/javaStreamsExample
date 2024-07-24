package com.java8.streamsExample.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepeatingStringJava8 {
    public static void main(String[] args) {
        String input = "aaabccdde";
        Optional<String> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        System.out.println(collect.get());
    }
}
