package com.java8.streamsExample.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepartArray {
    public static void main(String[] args) {
        // int[] in = {4, 5, 1, 2, 0, 4, 5, 2};

        int[] in = {1, 1, 2, 2, 3, 4, 4};

        int result = print1stNonRepeat(in, in.length);
        if (result != -1) {
            System.out.println(result);
        }
    }

    private static int print1stNonRepeat(int[] input, int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && input[i] == input[j]) {
                    break;
                }
            }
            if (j == n) {
                return input[i];
            }
        }
        return 0;
    }
}
