package com.java8.streamsExample.interviewQuestions;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        int[] in = {4, 5, 6, 7, 23, 8, 9};
        int max = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] > max) {// 8 greater than 23 //max =23
                max = in[i];
            }
        }
        System.out.println(max);
    }
}
