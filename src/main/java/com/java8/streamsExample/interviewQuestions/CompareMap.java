package com.java8.streamsExample.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompareMap {
    public static void main(String[] args) {

        List<String> fruits1 = Arrays.asList("Apple", "Orange", "Mango", "Orange", "Grape", "Apple", "Apple");
        List<String> fruits2 = Arrays.asList("Grape", "Orange", "Mango", "Orange",  "Orange", "Grape", "Apple", "Apple", "Grape", "Apple");

        Map<String, Long> resultOne = fruits1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> resulTwo = fruits2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        resultOne.forEach((k,v)->{
            if(resulTwo.get(k)==v){
                System.out.println(k);
            }
        });

    }
}
