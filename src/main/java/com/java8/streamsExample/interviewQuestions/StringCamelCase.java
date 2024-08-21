package com.java8.streamsExample.interviewQuestions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StringCamelCase {
    public static void main(String[] args) {
        String input = "KarnatakaIndia";
        String subString;
        List<Integer> position = new ArrayList<>();
        List<String> listOfItems = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            while (Character.isUpperCase(input.charAt(i))) {
                position.add(i);
            }
        }
        for (int i = 0; i < position.size(); i++) {
            if (i + 1 < position.size()) {
                subString = input.substring(position.get(i), position.get(i + 1));
            } else {
                subString = input.substring(position.get(i), input.length());
            }
            listOfItems.add(subString);
        }
        String output = "";
        for (int i = 0; i < listOfItems.size(); i++) {
            output = listOfItems.get(i) + output;
        }
        System.out.println(output);

         /*String firstPart = s.substring(0, s.indexOf("I"));
        String lastPart = s.substring(s.indexOf("I"));
        System.out.println(lastPart + firstPart);*/


    }
}
