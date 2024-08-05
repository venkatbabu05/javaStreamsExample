package com.java8.streamsExample.interviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hi Hello";
        String output = Arrays.stream(input.split(" ")).map(e -> new StringBuffer(e).reverse()).collect(Collectors.joining(" "));
        System.out.println(output);
    }
}
