package com.java8.streamsExample.interviewQuestions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String input ="test";
        char[] ch = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i=ch.length-1;i>=0;i--){
            builder.append(ch[i]);
        }
        System.out.println(builder.toString());
    }
}
