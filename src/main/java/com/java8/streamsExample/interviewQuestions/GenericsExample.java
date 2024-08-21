package com.java8.streamsExample.interviewQuestions;

import java.util.*;
import java.util.function.Function;

public class GenericsExample {

    public static <T> Set<T> twoArgMethod(T[] arr1, T[] arr2) {
        Set<T> set1 = new HashSet<>();
        Set<T> result = new HashSet<>();

        for (T element1 : arr1) {
            set1.add(element1);
        }

        for (T element2 : arr2) {
            if (set1.contains(element2)) {
                result.add(element2);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Integer[] inp1 = {5, 4, 3, 2, 1};
        Integer[] inp2 = {9, 8, 7, 6, 5};
        Set<Integer> output = GenericsExample.twoArgMethod(inp1, inp2);
        output.forEach(System.out::println);
        String[] inp3 = {"test1", "test2", "test3"};
        String[] inp4 = {"test3", "test4", "test5"};
        Set<String> output1 = GenericsExample.twoArgMethod(inp3, inp4);
        output1.forEach(System.out::println);
    }
}
