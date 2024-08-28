package com.java8.streamsExample.interviewQuestions;

public class ReverseStringWithOutInbuild {
    public static void main(String[] args) {
        String input = "UNIX";
        StringBuilder builder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }

        System.out.println(builder);
    }
}
