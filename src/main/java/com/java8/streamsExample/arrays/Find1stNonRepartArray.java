package com.java8.streamsExample.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find1stNonRepartArray {
    public static void main(String[] args) {
        int[] in = {4, 5, 1, 2, 0, 4, 5, 2};

        int result = print1stNonRepeat(in);
        if (result != -1) {
            System.out.println(result);
        }
    }

    private static int print1stNonRepeat(int[] in) {
        for (int i = 0; i < in.length; i++) {
            int count = 0;
            for (int j = i + 1; j < in.length; j++) {
                if (in[i] == in[j]) {
                    count++;
                }
            }
            if (count == 0) {
                return in[i];
            }

        }
        return -1;
    }
}
