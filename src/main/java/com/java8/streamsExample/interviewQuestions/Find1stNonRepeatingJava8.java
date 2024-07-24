package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepeatingJava8 {
    public static void main(String[] args) {
        int[] input = {4, 5, 1, 2, 0, 4, 5, 2};
        /*int result = findResult(input);

        if (result != -1) {
            System.out.println(result);
        }*/
        test(input);
    }

    private static int findResult(int[] input) {
        Map<Integer, Long> collect = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (int i = 0; i < input.length; i++) {
            if (collect.get(input[i]) == 1) {
                return input[i];
            }
        }
        return -1;
    }

    public static void test(int[] input) {
        Map<Integer, Long> collect = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        OptionalInt output = Arrays.stream(input).filter(e -> collect.get(e) == 1).findFirst();
        System.out.println(output);
    }
}
