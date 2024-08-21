package com.java8.streamsExample.primitiveStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToIntBoxed {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        IntStream lengths = strings.stream()
                .mapToInt(String::length); // Convert each String to its length

        // Collect the lengths into a List
        List<Integer> lengthList = lengths.boxed().collect(Collectors.toList());

        System.out.println(lengthList); // Output: [5, 6, 6]
    }
}
