package com.java8.streamsExample.interviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] in = {5, 4, 3, 2, 1};
        int temp;
        for (int i = 0; i < in.length; i++) {
            for (int j = i + 1; j < in.length; j++) {
                if (in[i] > in[j]) {
                    temp =in[i];
                    in[i]=in[j];
                    in[j] =temp;
                }
            }
        }
        Arrays.stream(in).forEach(e->System.out.println(e));
        System.out.println("2nd Largest array "+in[in.length-2]);
    }
}
