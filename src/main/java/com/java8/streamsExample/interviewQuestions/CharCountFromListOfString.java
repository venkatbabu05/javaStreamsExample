package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountFromListOfString {
    public static void main(String[] args) {

        List<String> word = Arrays.asList("hello", "world","apple","orange");
        System.out.println(word.stream().flatMap(a -> Arrays.stream(a.split(""))).filter(a -> a.equals("l"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        long count = word.stream().flatMapToInt(CharSequence::chars).filter(b -> b == 'l').count();
        System.out.println(count);

        long sum = word.stream().mapToLong(s->s.chars().filter(ch->ch=='l').count()).sum();
    }
}
