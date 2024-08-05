package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("cat", "dog", "elephant"),
                Arrays.asList("ant", "bat", "beetle"),
                Arrays.asList("fish", "shark")
        );

        List<String> result = listOfLists.stream().flatMap(List::stream).filter(e -> e.length()>4).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
