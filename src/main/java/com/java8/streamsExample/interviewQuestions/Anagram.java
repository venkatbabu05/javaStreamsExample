package com.java8.streamsExample.interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s1 ="Bear";
        String s2 ="Bare";
        String so1 = Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String so2 = Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(so1.equals(so2));
    }
}
