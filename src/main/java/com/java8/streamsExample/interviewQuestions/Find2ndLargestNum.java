package com.java8.streamsExample.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find2ndLargestNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 4, 10, 30, 30, 20);

        Integer output = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().orElse(null);
        System.out.println(output);
    }
}
