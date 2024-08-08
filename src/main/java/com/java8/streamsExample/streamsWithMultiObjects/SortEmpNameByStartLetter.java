package com.java8.streamsExample.streamsWithMultiObjects;

import java.util.List;
import java.util.stream.Collectors;

public class SortEmpNameByStartLetter {
    public static void main(String[] args) {
        List<Employee> input = LoadEmployees.getEmployeeDate();
        List<Employee> collect = input.stream().filter(e -> IsVowel(e.getName().charAt(0))).collect(Collectors.toList());
        collect.forEach(e->System.out.println(e));
    }

    private static boolean IsVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
