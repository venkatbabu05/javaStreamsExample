package com.java8.streamsExample.interviewQuestions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SortMap {

    public static void main(String[] args) {
        Map<String,Integer> input = new HashMap<>();
        input.put("venkat",50000);
        input.put("babu",40000);
        input.put("avb",30000);

        Optional<Map.Entry<String, Integer>> first = input.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst();
        System.out.println(first.get());
    }
}
