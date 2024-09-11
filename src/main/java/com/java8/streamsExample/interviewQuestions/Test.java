package com.java8.streamsExample.interviewQuestions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("venkat","M");
        map.put("babu","M");
        map.put("Harini","F");

        map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
