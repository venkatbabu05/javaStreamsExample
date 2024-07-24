package com.java8.streamsExample.interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindConsecutiveSequenceCount {
    public static void main(String[] args) {
        String input = "aabbccaaa";
        /*StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int count =1;
            while (i+1 <input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(input.charAt(i)+""+count);
        }*/
        String result = Arrays.stream(input.split("(?<=(.))(?!\\1)"))
                .map(s -> s.length() + Character.toString(s.charAt(0)))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
