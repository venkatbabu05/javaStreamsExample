package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CombinationsZero {
    public static void main(String[] args) {
        // Test cases
        //String[] inputs = {"aaaab", "aaaabcc", "abcabc", "1231234"};
        String[] inputs = {"aaaab"};

        for (String input : inputs) {
            System.out.println(transform(input));
        }
    }

    public static String transform(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        Map<Character, Long> counts = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println("**********");
        counts.entrySet().forEach(System.out::println);
        // Construct the output
        List<Character> dup = new ArrayList<>();
        List<Character> results = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            // If the count of the character is greater than 1
            if (counts.get(ch) > 1) {
                results.add('0');
                // Reduce the count to avoid redundant zeros
                counts.put(ch, counts.get(ch) - 2);
                dup.add(ch);
            } else {
                if (!dup.contains(ch))
                    results.add(ch);
            }
        }
        System.out.println("****************");
        counts.entrySet().forEach(System.out::println);
        // results.stream().sorted().forEach(System.out::print);
        return
                results.stream().sorted()
                        .map(String::valueOf).collect(Collectors.joining());
    }
}
