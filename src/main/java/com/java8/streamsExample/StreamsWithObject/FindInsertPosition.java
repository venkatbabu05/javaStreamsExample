package com.java8.streamsExample.StreamsWithObject;

public class FindInsertPosition {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        int k = 5;
        int s = input.length;
        System.out.println(getInsertPosition(input, k, s));
    }

    private static int getInsertPosition(int[] input, int k, int s) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == k) {
                return i;
            } else if (input[i] > k) {
                return i;
            }
        }
        return s;
    }
}
